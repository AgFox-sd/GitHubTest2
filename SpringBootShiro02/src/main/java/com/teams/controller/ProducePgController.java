package com.teams.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.D_module;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_apply;
import com.teams.pojo.m_pg;
import com.teams.pojo.m_procedure_module;
import com.teams.service.ProducePgService;

/*
 *	生产调度管理控制器
 * */

@Controller
public class ProducePgController {

	@Autowired
	ProducePgService service;
	
	
	//查询已通过审核并未派工的生产计划
	@RequestMapping("/SelectApply")
	@ResponseBody
	public List<m_apply> SelectApply() {
		List<m_apply> list=service.SelectApply("审核通过","未派工");
		return list;
	}
	
	//通过产品编号查询工序
	@RequestMapping("/Prt")
	@ResponseBody
	public List<M_design_procedure_details> SelGx(String product_id,HttpSession session){
		List<M_design_procedure_details> list=service.SelGx(product_id);
		double cb=0;
		double wl=0;
		for (int i = 0; i < list.size(); i++) {
			cb+=list.get(i).getSubtotal();
			wl+=list.get(i).getModule_subtotal();
		}
		session.setAttribute("gscb",cb);
		session.setAttribute("wlcb",wl);
		return list;
	}
	
	
	//查询工序物料
	@RequestMapping("/SelWL")
	@ResponseBody
	public List<m_procedure_module> SelWL(String design_id,String name){
		 List<m_procedure_module> list=service.SelWL(design_id,name);
		 return list;
	}
	
	//生产派工单提交
	@RequestMapping("/addPg")
	@ResponseBody
	public String addPg(@RequestBody m_pg pg){
		int b=service.addPg(pg);
		service.updAySh(pg.getProduct_id(),pg.getJhdbh());//修改派工状态
		return b>0?"成功":"失败";
	}
	
	//查询信息范围为已派工的派工单
	@RequestMapping("/SelectPg")
	@ResponseBody
	public List<m_pg> SelectPg(HttpSession session){
		List<m_pg> list=service.SelectPg("未审核");
		String zdr="";
		for (int i = 0; i < list.size(); i++) {
			zdr=list.get(i).getPg_ren();
		}
		System.out.println(zdr);
		session.setAttribute("zdr", zdr);
		return list;
	}
	
	//查询当前等待审核的生产派工单总数SelSum
	@RequestMapping("/SelSum")
	@ResponseBody
	public int SelSum(){
		return service.SelSum("未审核");
	}
	
	//生产派工单审核通过
	@RequestMapping("/updPgtg")
	@ResponseBody  
	public int updPgtg(String check_tag,String pg_id) {
		return service.updPgtg(check_tag,pg_id);
	}
	
   	//审核未通过,删除派工单 并修改派工标志
	@RequestMapping("/delpg")
	@ResponseBody  
	public int delpg(String product_id,String apply_id,String manufacture_tag,String pg_id) {
		service.updPgbz(manufacture_tag,product_id,apply_id);
	    return service.delPgd(pg_id);
	}
	
	//生产派工单查询
	@RequestMapping("/SelectPG2")
	@ResponseBody  
	public List<m_pg> SelectPG2() {
		List<m_pg> list=service.SelectPG2("审核通过");
		return list;
	}
	
	//查询当前等待审核的生产派工单总数SelSum
	@RequestMapping("/SelSum2")
	@ResponseBody
	public int SelSum2(){
		return service.SelSum("审核通过");
	}
		
}
