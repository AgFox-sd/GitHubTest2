package com.teams.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.cgPlan;
import com.teams.pojo.cgPlanXq;
import com.teams.service.ProductCgService;
import com.teams.utils.Params;

@Controller
public class ProductCgController {

	@Autowired
	ProductCgService service;
	
	//查询符合条件的产品档案
	@RequestMapping("/productCp")
	@ResponseBody
	public List<D_file> selectCp(@RequestParam("check_tag")String check_tag){
		return service.selectCp(check_tag);
	}
	
	//查询符合条件的产品档案总数
	@RequestMapping("/productCpsum")
	@ResponseBody
	public int selectCpsum(@RequestParam("check_tag")String check_tag){
		return service.selectCpsum(check_tag);
	}
	
	//点击添加查询选中的产品信息
	@RequestMapping("/productCgcpxx")
	@ResponseBody
	public List<D_file> selectCgcpxx(@RequestParam("product_id")String[] product_id){
		List<D_file> list=new ArrayList<D_file>();
		for (int i = 0; i < product_id.length; i++) {
			D_file d_file=service.selectCgcpxx(product_id[i]);
			list.add(d_file);
		}
		return list;
	}
	
	
	/*生成随机流水号  --采购计划详情编号
	public static String aa() {
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String batchno=format.format(new Date());
		int num=(int)((Math.random()*9+1)*100000);
		String danghao="050900"+batchno+num;
		return danghao;
	}*/
	
	//添加采购计划
	@RequestMapping("/productCg")
	@ResponseBody
	public int addproductCg(@RequestParam("cgPlanId")String cgPlanId,@RequestParam("remark")String remark,@RequestParam("register")String register,@RequestParam("check_tag")String check_tag,
			@RequestParam("product_id")String [] product_id,@RequestParam("product_name")String [] product_name,@RequestParam("amount")double [] amount,@RequestParam("amount_unit")String [] amount_unit,@RequestParam("cost_price")double [] cost_price,@RequestParam("execute_tag")String execute_tag){
		for (int i = 0; i < product_id.length; i++) {
			service.addcgPlanXq(cgPlanId,product_id[i],product_name[i],amount[i],amount_unit[i],cost_price[i],execute_tag);
		}
		return service.addproductCg(cgPlanId,remark,register,check_tag);
	}
	
	//查询采购计划明细
	@RequestMapping("/productCgmx")
	@ResponseBody
	public List<cgPlanXq> selectCgmx(@RequestParam("cgPlanId")String cgPlanId){
		return service.selectCgmx(cgPlanId);
	}
	
	//查询所有等待审核的采购计划单
	@RequestMapping("/Cgddsh")
	@ResponseBody
	public PageInfo<cgPlan> selectCgddsh(@RequestBody Params params){
		return service.selectCgddsh(params);
	}
	
	//查询所有等待审核的采购计划单总数
	@RequestMapping("/Cgddshsum")
	@ResponseBody
	public int selectCgddshsum(@RequestParam("check_tag")String check_tag){
		return service.selectCgddshsum(check_tag);
	}
	
	//采购计划审核
	@RequestMapping("/Cgshtg")
	@ResponseBody
	public int updCgshtg(@RequestBody cgPlan cgPlan){
		return service.updCgshtg(cgPlan);
	}
	
	//查询所有的采购计划单
	@RequestMapping("/GetCg")
	@ResponseBody
	public PageInfo<cgPlan> selectGetCg(@RequestBody Params params){
		return service.selectGetCg(params);
	}
	
	//查询所有采购计划单总数
	@RequestMapping("/GetCgsum")
	@ResponseBody
	public int selectGetCgsum(){
		return service.selectGetCgsum();
	}
	
	//查询不在采购计划的产品档案信息 ----修改采购计划
	@RequestMapping("/XgCgcpda")
	@ResponseBody
	public List<D_file> selectXgCgcpda(@RequestParam("cgPlanId")String cgPlanId){
		return service.selectXgCgcpda(cgPlanId);
	}
	
	//查询不在采购计划的产品档案信息总数 ----修改采购计划
	@RequestMapping("/XgCgcpdasum")
	@ResponseBody
	public int selectXgCgcpdasum(@RequestParam("cgPlanId")String cgPlanId){
		return service.selectXgCgcpdasum(cgPlanId);
	}
	
	//追加采购明细表产品
	@RequestMapping("/addcgjxmx")
	@ResponseBody
	public int addcgjxmx(@RequestParam("cgPlanId")String cgPlanId,@RequestParam("product_id")String [] product_id,@RequestParam("product_name")String [] product_name,@RequestParam("amount_unit")String [] amount_unit,@RequestParam("cost_price")double [] cost_price){
		String execute_tag="未执行";
		for (int i = 0; i < product_id.length; i++) {
			service.addcgjxmx(cgPlanId,product_id[i],product_name[i],amount_unit[i],cost_price[i],execute_tag);
		}
		return 1;
	}
	
	//点击删除采购计划详情产品
	@RequestMapping("/delcgjxmx")
	@ResponseBody
	public int delcgjxmx(@RequestParam("cgPlanId")String cgPlanId,@RequestParam("product_id")String product_id) {
		return service.delcgjxmx(cgPlanId,product_id);
	}
	
	//修改采购计划
	@RequestMapping("/updcgjh")
	@ResponseBody
	public int updcgjh(@RequestParam("cgPlanId")String cgPlanId,@RequestParam("product_id")String[] product_id,@RequestParam("amount")Double[] amount,@RequestParam("remark")String remark) {
		for (int i = 0; i < product_id.length; i++) {
			service.updcgjhmx(cgPlanId,product_id[i],amount[i]);
		}
		String check_tag="等待审核";
		return service.updcgjh(cgPlanId,check_tag,remark);
	}
	
	
	
	
	
	
}
