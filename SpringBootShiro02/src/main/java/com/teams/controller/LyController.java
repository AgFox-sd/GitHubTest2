package com.teams.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_djfh_xq;
import com.teams.pojo.m_pg;
import com.teams.pojo.M_sc;
import com.teams.pojo.m_procedure_module;
import com.teams.service.LyService;

@Controller
public class LyController {
	@Autowired
	LyService service;

	// 查询登记
	@RequestMapping("/scdj")
	@ResponseBody
	public List<m_pg> scdj() {
		List<m_pg> list = service.scdj("审核通过", "未生产");
		System.out.println(list);
		return list;
	}

	// 根据产品编号查询工序
	@RequestMapping("/scgx")
	@ResponseBody
	public List<M_design_procedure_details> scgx(String product_id) {
		System.out.println(product_id+"aa");
		List<M_design_procedure_details> list = service.scgx(product_id);
		System.out.println(list);
		return list;
	}

	// 根据工序名称和工序单号查询物料详情
	@RequestMapping("/scdjwl")
	@ResponseBody
	public List<m_procedure_module> selectGxWl(String parent_id, String gongxu_name) {
		return service.selectGxWl(parent_id, gongxu_name);
	}

	@RequestMapping("/zjdjfh")
	@ResponseBody
	public int zjdjfh(String product_id, String scjh_id) {
		String gongxu_id = service.selectGongxu_id(product_id);
		System.out.println(product_id+scjh_id);
		if (service.selectCount(gongxu_id) > 0) {
		} else {
			List<String> gongxu = service.selectGongxu(gongxu_id);
			for (String string : gongxu) {
				service.adddjfh(scjh_id, gongxu_id, string.toString());
			}
		}
		return 1;
	}

	@RequestMapping("/zjwl")
	@ResponseBody
	public int zjwl(@RequestParam("check_tag") String check_tag, @RequestParam("pg_id") String pg_id,
			@RequestParam("procedure_name") String procedure_name, @RequestParam("dj_jj") String dj_jj,
			@RequestParam("sl") int[] sl, @RequestParam("did") String did,
			@RequestParam("product_id") String[] product_id, @RequestParam("product_name") String[] product_name,
			@RequestParam("amount") int[] amount, @RequestParam("cost_price") double[] cost_price,
			@RequestParam("xq_sh") String xq_sh,HttpSession ses) {
		double zcb = 0;
		double zjs = 0;
		String pay_id = Dindan();
		String storer = (String) ses.getAttribute("username");
		String reason = "生产领料";
		for (int i = 0; i < sl.length; i++) {
			service.add_xq(did, procedure_name, product_id[i], product_name[i], amount[i], cost_price[i],
					(amount[i] * cost_price[i]), xq_sh);
			zjs +=amount[i];
			zcb += amount[i] * cost_price[i];
			service.addpayxq(pay_id,product_id[i],product_name[i],amount[i],cost_price[i],amount[i] * cost_price[i],"已登记");
		}
		service.addpay(pay_id,storer,reason,zjs,zcb,"审核通过","已登记");
		service.updsjsysl(zcb, dj_jj, procedure_name,did);
		service.updm_pg(check_tag, pg_id);
		return 1;
	}

	// 复核
	// 查询派工单未复核
	// 查询登记
	@RequestMapping("/scdjwfh")
	@ResponseBody
	public List<m_pg> scdjwfh() {
		List<m_pg> list = service.scdjwfh("未审核");
		System.out.println(list);
		return list;
	}

	// 根据产品编号查询工序
	@RequestMapping("/scgxfh")
	@ResponseBody
	public List<M_design_procedure_details> scgxfh(String product_id) {
		List<M_design_procedure_details> list = service.scgx(product_id);
		System.out.println(list);
		return list;
	}

	@RequestMapping("/scfhwl")
	@ResponseBody
	public List<M_djfh_xq> selectfhwl(String procedure_name,String did) {
		return service.selectfhwl(procedure_name,did);
	}

	// 登记复核
	@RequestMapping("/djfh")
	@ResponseBody
	public int djfh(@RequestParam("check_tag") String check_tag, @RequestParam("pg_id") String pg_id,
			@RequestParam("xq_sh") String xq_sh, @RequestParam("procedure_name") String procedure_name,
			@RequestParam("dj_jj") String dj_jj, @RequestParam("dj_sh") String dj_sh,@RequestParam("did") String did) {
		service.djxq(xq_sh, procedure_name);
		service.djfh(dj_jj, dj_sh, procedure_name,did);
		service.updm_pg(check_tag, pg_id);
		return 1;
	}

	// 交接复核
	@RequestMapping("/jjfh")
	@ResponseBody
	public int jjfh(@RequestParam("check_tag") String check_tag, @RequestParam("pg_id") String pg_id,
			@RequestParam("design_id") String design_id, @RequestParam("procedure_name") String procedure_name,
			@RequestParam("did") String did, @RequestParam("dj_tcsl") int dj_tcsl, @RequestParam("dj_fh") String dj_fh,
			@RequestParam("product_id") String product_id, @RequestParam("product_name") String product_name,
			@RequestParam("sc_unit") int sc_unit, @RequestParam("dj_sh") String dj_sh) {
		service.addsc(design_id, procedure_name, did, dj_tcsl, dj_fh);
		service.updm_pg(check_tag, pg_id);
		service.upsjjfh(dj_sh, procedure_name,did);
		return 1;
	}

	@RequestMapping("/sczb")
	@ResponseBody
	public int sczb(@RequestParam("pg_id") String pg_id, @RequestParam("design_id") String design_id,
			@RequestParam("did") String did, @RequestParam("product_id") String product_id,
			@RequestParam("product_name") String product_name, @RequestParam("sc_unit") int sc_unit,HttpSession ses) {

		double zcb = service.gszcb(design_id) + service.wlzcb(design_id);
		service.xgzcb(zcb,product_id);
		service.xgscct(pg_id);
		String gather_id = Dindan();
		String storer = (String) ses.getAttribute("username");
		String reason = "生产入库";
		service.addsg(gather_id,storer,reason,sc_unit,zcb*sc_unit,"审核通过","已登记");
		service.addsgxq(gather_id,product_id,product_name,sc_unit,zcb,zcb*sc_unit,"已登记");
		service.addnbsc(did, pg_id, product_id, product_name, sc_unit, zcb, zcb * sc_unit);
		return 1;
	}

	// 交接复核
	@RequestMapping("/jjyfh")
	@ResponseBody
	public int jjyfh(@RequestParam("check_tag") String check_tag, @RequestParam("pg_id") String pg_id,
			@RequestParam("dj_fh") String dj_fh, @RequestParam("procedure_name") String procedure_name,
			@RequestParam("dj_sh") String dj_sh,@RequestParam("did") String did) {
		System.out.println(did);
		service.updm_pg(check_tag, pg_id);
		service.upd_sc(dj_fh, procedure_name,did);
		service.upsnb(dj_sh, procedure_name,did);
		return 1;
	}

	// 查询工序数量
	@RequestMapping("/cxgxsl")
	@ResponseBody
	public List<M_sc> cxgxsl(String procedure_name,String did) {
		return service.cxgxsl(procedure_name,did);
	}

	// 生产查询
	@RequestMapping("/cxpgsc")
	@ResponseBody
	public List<m_pg> cxpgsc() {
		return service.cxpgsc();
	}

	//生成订单编号
	public String Dindan() {
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String batchno=format.format(new Date());
		int num=(int)((Math.random()*9+1)*100000);
		return 100+batchno+num;
	}
}
