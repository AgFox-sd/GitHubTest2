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
import com.teams.pojo.m_apply;
import com.teams.pojo.m_apply_mx;
import com.teams.service.LidongService;

@Controller
public class LidongController {

	@Autowired
	LidongService service;
	
	
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
	
	
}
