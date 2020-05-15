package com.teams.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*
 * 生产计划管理
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.D_file;
import com.teams.pojo.S_gather;
import com.teams.pojo.S_gather_details;
import com.teams.pojo.m_apply;
import com.teams.pojo.s_pay;
import com.teams.pojo.s_pay_details;
import com.teams.pojo.stockjh;
import com.teams.service.LidongService;

@Controller
public class LidongController {

	@Autowired
	LidongService service;
	
	//添加
	//添加产品  --查询符合条件的产品
	@RequestMapping("/productSccx")
	@ResponseBody
	public List<D_file> selectcp(@RequestParam("design_procedure_tag")String design_procedure_tag){
		return service.selectcp(design_procedure_tag);
	}
	
	//添加产品  --查询选中的产品信息
	@RequestMapping("/productSccpxx")
	@ResponseBody
	public List<D_file> selectcpxx(@RequestParam("product_id")String [] product_id){
		List<D_file> list=new ArrayList<D_file>();
	    for (int i = 0; i < product_id.length; i++) {
			D_file d_file=service.selectcpxx(product_id[i]);
			list.add(d_file);
		}	
		return list;
	}
	
	//添加生产计划
	@RequestMapping("/productSc")
	@ResponseBody
	public int addSc(@RequestParam("apply_id")String apply_id,@RequestParam("remark")String remark,@RequestParam("subtotal")Double subtotal,@RequestParam("register")String register,@RequestParam("check_tag")String check_tag,@RequestParam("manufacture_tag")String manufacture_tag,
			@RequestParam("product_id")String [] product_id,@RequestParam("product_name")String [] product_name,@RequestParam("product_describe")String [] product_describe,@RequestParam("amount")Integer [] amount,@RequestParam("personal_unit")String [] personal_unit,@RequestParam("real_cost_price")Double [] real_cost_price){
		System.out.println(product_id.length);
		for (int i = 0; i < product_id.length; i++) {
			service.addScmx(apply_id,product_id[i],product_name[i],product_describe[i],amount[i],personal_unit[i],real_cost_price[i],manufacture_tag);
		}
		
		return service.addSc(apply_id,remark,subtotal,register,check_tag);
	}
	
	//添加产品  --查询生产计划明细
	@RequestMapping("/productScmx")
	@ResponseBody
	public List<D_file> selectscmx(@RequestParam("apply_id")String apply_id){
		return service.selectscmx(apply_id);
	}
	
	//查询所有等待审核的生产计划
	@RequestMapping("/productShcx")
	@ResponseBody
	public List<m_apply> selectShcx(@RequestParam("check_tag")String check_tag){
		return service.selectShcx(check_tag);
	}
	
	//查询所有等待审核的生产计划总数
	@RequestMapping("/productShcxsum")
	@ResponseBody
	public int selectShcxsum(@RequestParam("check_tag")String check_tag){
		return service.selectShcxsum(check_tag);
	}
	
	//生产计划审核通过
	@RequestMapping("/Scjhshtg")
	@ResponseBody
	public int updShjh(@RequestBody m_apply apply){
		return service.updShjh(apply);
	}
	
	//生产计划审核不通过
	@RequestMapping("/Scjhshbtg")
	@ResponseBody
	public int delShjh(@RequestParam("apply_id")String apply_id){
		service.delShjhmx(apply_id);
		return service.delShjh(apply_id);
	}
	
	//查询所有生产计划
	@RequestMapping("/GetShjh")
	@ResponseBody
	public List<m_apply> selectShjh(){
		return service.selectShjh();
	}
	
	
	/*
	 * 入库申请管理
	 */
	//查询所有通过审核的档案信息
	@RequestMapping("/productShtg")
	@ResponseBody
	public List<D_file> selectShtg(@RequestParam("check_tag")String check_tag){
		return service.selectShtg(check_tag);
	}
	
	//添加入库申请单
	@RequestMapping("/productRk")
	@ResponseBody
	public int addRk(@RequestParam("gather_id")String gather_id,@RequestParam("storer")String storer,@RequestParam("reason")String reason,@RequestParam("amount_sum")Integer amount_sum,@RequestParam("cost_price_sum")Double cost_price_sum,@RequestParam("remark")String remark,@RequestParam("register")String register,
			@RequestParam("check_tag")String check_tag,@RequestParam("store_tag")String store_tag,
			@RequestParam("product_id")String [] product_id,@RequestParam("product_name")String [] product_name,@RequestParam("product_describe")String [] product_describe,@RequestParam("amount")Integer [] amount,@RequestParam("amount_unit")String [] amount_unit,@RequestParam("cost_price")Double [] cost_price){
		System.out.println(product_id.length);
		double subtotal=0;
		for (int i = 0; i < product_id.length; i++) {
			subtotal=amount[i]*cost_price[i];
			service.addRkmx(gather_id,product_id[i],product_name[i],product_describe[i],amount[i],amount_unit[i],cost_price[i],subtotal);
		}
		return service.addRk(gather_id,storer,reason,amount_sum,cost_price_sum,remark,register,check_tag,store_tag);
	}
	
	//查询入库单明细
	@RequestMapping("/productRkmx")
	@ResponseBody
	public List<S_gather_details> selectRkmx(@RequestParam("gather_id")String gather_id){
		return service.selectRkmx(gather_id);
	}
	
	//查询所有等待审核的入库申请单  --不为生产入库的
	@RequestMapping("/productRkddsh")
	@ResponseBody
	public List<S_gather> selectRkddsh(@RequestParam("check_tag")String check_tag,@RequestParam("reason")String reason){
		return service.selectRkddsh(check_tag,reason);
	}
	
	//查询所有审核状态的入库申请单总数    --审核状态
	@RequestMapping("/productRkddshsum")
	@ResponseBody
	public int selectRkddshsum(@RequestParam("check_tag")String check_tag,@RequestParam("reason")String reason){
		return service.selectRkddshsum(check_tag,reason);
	}
	
	//入库申请单审核
	@RequestMapping("/Rksqdsh")
	@ResponseBody
	public int updRksqdsh(@RequestBody S_gather s_gather){
		return service.updRksqdsh(s_gather);
	}
	
	//查询所有的入库申请单  --不为生产入库
	@RequestMapping("/GetRksqd")
	@ResponseBody
	public List<S_gather> selectGetRksqd(@RequestParam("reason")String reason){
		return service.selectGetRksqd(reason);
	}
	
	
	/*
	 * 入库管理
	 */
	
	//查询所有入库单
	@RequestMapping("/GetRkd")
	@ResponseBody
	public List<S_gather> selectGetRkd(@RequestParam("reason")String reason,@RequestParam("store_tag")String store_tag,@RequestParam("check_tag")String check_tag){
		return service.selectGetRkd(reason,store_tag,check_tag);
	}
	//查询入库单总数
	@RequestMapping("/GetRkdsum")
	@ResponseBody
	public int selectGetRkdsum(@RequestParam("check_tag")String check_tag,@RequestParam("reason")String reason,@RequestParam("store_tag")String store_tag){
		return service.selectGetRkdsum(check_tag,reason,store_tag);
	}
	//查询入库单详细
	@RequestMapping("/GetRkdxx")
	@ResponseBody
	public List<stockjh> selectGetRkdxx(@RequestParam("gather_id")String gather_id){
		return service.selectGetRkdxx(gather_id);
	}
	//入库登记   -修改入库表
	@RequestMapping("/GetRkddj")
	@ResponseBody
	public int updGetRkddj(@RequestParam("gather_id")String gather_id,@RequestParam("store_tag")String store_tag,@RequestParam("gathered_amount")Integer gathered_amount,@RequestParam("register")String register){
		service.updGetRkmx(gather_id,gathered_amount,store_tag);
		return service.updGetRkddj(gather_id,store_tag,gathered_amount,register);
	}
	
	//判断产品是否安全配置
	@RequestMapping("/GetRkpd")
	@ResponseBody
	public int selectGetRkpd(@RequestParam("gather_id")String gather_id){
		return service.selectGetRkpd(gather_id);
	}
	
	//入库单复核通过
	@RequestMapping("/GetRkdfhtg")
	@ResponseBody
	public int updGetRkdfhtg(@RequestParam("gather_id")String gather_id,@RequestParam("store_tag")String store_tag,@RequestParam("gathered_amount")Integer gathered_amount,@RequestParam("checker")String checker,@RequestParam("check_tag")String check_tag){
		service.updGetRkmx(gather_id,gathered_amount,store_tag);
		service.updGets_cell(gather_id,gathered_amount);
		return service.updGetRkdfhtg(gather_id,store_tag,gathered_amount,checker,check_tag);
	}
	
	
	
	/*
	 * 出库申请单
	 */
	
	//添加出库申请单
	@RequestMapping("/productCk")
	@ResponseBody
	public int addCk(@RequestParam("pay_id")String pay_id,@RequestParam("storer")String storer,@RequestParam("reason")String reason,@RequestParam("amount_sum")Integer amount_sum,@RequestParam("cost_price_sum")Double cost_price_sum,@RequestParam("remark")String remark,@RequestParam("register")String register,
			@RequestParam("check_tag")String check_tag,@RequestParam("store_tag")String store_tag,
			@RequestParam("product_id")String [] product_id,@RequestParam("product_name")String [] product_name,@RequestParam("product_describe")String [] product_describe,@RequestParam("amount")Integer [] amount,@RequestParam("amount_unit")String [] amount_unit,@RequestParam("cost_price")Double [] cost_price){
		double subtotal=0;
		for (int i = 0; i < product_id.length; i++) {
			subtotal=amount[i]*cost_price[i];
			service.addCkmx(pay_id,product_id[i],product_name[i],product_describe[i],amount[i],amount_unit[i],cost_price[i],subtotal);
		}
		return service.addCk(pay_id,storer,reason,amount_sum,cost_price_sum,remark,register,check_tag,store_tag);
	}	
	
	//查询出库申请单明细
	@RequestMapping("/productCkmx")
	@ResponseBody
	public List<s_pay_details> selectCkmx(@RequestParam("pay_id")String pay_id){
		return service.selectCkmx(pay_id);
	}
	
	//查询所有等待审核的出库申请单  --不为生产领料的
	@RequestMapping("/productCkddsh")
	@ResponseBody
	public List<s_pay> selectCkddsh(@RequestParam("check_tag")String check_tag,@RequestParam("reason")String reason){
		return service.selectCkddsh(check_tag,reason);
	}
	
	//查询所有审核状态的出库申请单总数    --审核状态
	@RequestMapping("/productCkddshsum")
	@ResponseBody
	public int selectCkddshsum(@RequestParam("check_tag")String check_tag,@RequestParam("reason")String reason){
		return service.selectCkddshsum(check_tag,reason);
	}
	
	//出库申请单审核
	@RequestMapping("/Cksqdsh")
	@ResponseBody
	public int updCksqdsh(@RequestBody s_pay s){
		return service.updCksqdsh(s);
	}
	
	//查询所有的出库申请单  --不为生产领料
	@RequestMapping("/GetCksqd")
	@ResponseBody
	public List<s_pay> selectGetCksqd(@RequestParam("reason")String reason){
		return service.selectGetCksqd(reason);
	}
		
}
