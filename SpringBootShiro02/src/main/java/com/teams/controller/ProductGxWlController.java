package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.D_module_details;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_procedure_module;
import com.teams.service.ProductGxWlService;

@Controller
public class ProductGxWlController {
	
	@Autowired
	ProductGxWlService service;
	
	//查询已设计完产品工序的产品信息
	@RequestMapping("/productGxWl")
	@ResponseBody
	public List<M_design_procedure> productGxWl(){
		List<M_design_procedure> list = service.productGxWl();
		return list;
	}
	
	//查询设计完产品工序的工序信息
	@RequestMapping("/productGxMx")
	@ResponseBody
	public List<M_design_procedure_details> productGxMx(String product_id){
		List<M_design_procedure_details>  list = service.productGxMx(product_id);
		return  list;
	}
	
	//根据产品编号查询设计完产品工序所需的物料信息
	@RequestMapping("/productGxWlSj")
	@ResponseBody
	public List<D_module_details> productGxWlSj(String proudct_id){
		List<D_module_details> list = service.productGxWlSj(proudct_id);
		System.out.println(proudct_id);
		return list;
	}
	
	//添加工序物料表
	@RequestMapping("/addGxWl")
	@ResponseBody
	public List<m_procedure_module> addGxWl(@RequestParam("bh") String[] bh,@RequestParam("mc") String[] mc,@RequestParam("mx") String[] mx,@RequestParam("sl") int[] sl,@RequestParam("dw") String[] dw,@RequestParam("dj") double[] dj,@RequestParam("design_id") String design_id,@RequestParam("gongxu_name") String gongxu_name,@RequestParam("product_id") String product_id){
		double module_subtotal =0;
		for (int i = 0; i < dj.length; i++) {
			service.updWlMx(sl[i],bh[i],product_id);
		    service.addGxWl(design_id,gongxu_name,bh[i],mc[i],sl[i],dw[i],dj[i],sl[i]*dj[i]);
		    module_subtotal +=sl[i]*dj[i];
		}
		service.updCpGx(module_subtotal,design_id,gongxu_name);
	    service.updWlZcb(module_subtotal,design_id);
		return service.selectGxWl(design_id,gongxu_name);
	}
	
	//修改产品工序表为已设计
	@RequestMapping("/updGxWlSj")
	@ResponseBody
	public int updGxWlSj(String design_id) {
		return service.updGxWlSj("已设计",design_id);
	}
	
	//修改产品工序表为已审核
	@RequestMapping("/updateGxWlSh")
	@ResponseBody
	public int updateGxWlSh(String design_id,String real_cost_price) {
		service.productGxSj("已设计",real_cost_price,design_id);
		return service.updateGxWlSh(design_id);
	}
	
	//查询已设计完物料工序的产品
	@RequestMapping("/productGxWlSh")
	@ResponseBody
	public List<M_design_procedure> productGxWlSh(){
		List<M_design_procedure> list = service.productGxWlSh("变更等待审核");
		return list;
	}
	
	//查询已设计或已审核的产品
	@RequestMapping("/productGxWlCx")
	@ResponseBody
	public List<M_design_procedure> productGxWlCx(){
		List<M_design_procedure> list = service.productGxWlCx();
		return list;
	}
	
	//查询工序物料表
	@RequestMapping("/selectGxWl")
	@ResponseBody
	public List<m_procedure_module> selectGxWl(String design_id,String gongxu_name){
		return service.selectGxWl(design_id,gongxu_name);
	}
	
	//修改相关表字段
	@RequestMapping("/updateSySj")
	@ResponseBody
	public  int updateSySj(String design_id,int[] sl,String[] wlbh,String product_id) {
	service.updWlZcb2(design_id);
	service.updCpGx2(design_id);
		for (int i = 0; i < wlbh.length; i++) {
			service.updWlMx2(sl[i],wlbh[i] ,product_id);
		}		
	return service.updGxWlSj("审核不通过",design_id);
	}
	
	
	//根据设计编号查询所有工序
	@RequestMapping("/cxsygx")
	@ResponseBody
	public List<m_procedure_module> cxsygx(String design_id){
		return service.cxsygx(design_id);
	}
	
	//查询已审核的产品信息
	@RequestMapping("/productGxWlSh2")
	@ResponseBody
	public List<M_design_procedure> productGxWlSh2(){
		List<M_design_procedure> list = service.productGxWlSh2();
		return list;
	}
	
	//变更
	@RequestMapping("/updgxwlbg")
	@ResponseBody
	public int updgxwlbg(String product_id,int sl,double dj,double xj,int slsl,String design_id,String gongxu_name) {
		int ky = sl-slsl;
		double djdj = (slsl*dj)-xj;
		System.out.println(djdj);
		service.updmpm(slsl,slsl*dj,product_id,design_id);
		service.updmdp(djdj,design_id);
		service.updmdpd(slsl*dj,design_id,gongxu_name);
		return service.upddmd(ky,product_id,design_id);
	}
}