package com.teams.controller;

import java.util.List;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.service.ProductSjService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.D_module;
import com.teams.pojo.D_module_details;
import com.teams.pojo.Feilei;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;

@Controller
public class ProductSjController {
	
	@Autowired
    ProductSjService service;
	
	//查询审核通过的产品信息
	@RequestMapping("/selectAllProduct")
	@ResponseBody
	public List<D_file> selectProduct() {
			List<D_file> list=service.selectProduct("审核通过");
			return list;
	}
	
	//删除审核通过的产品信息
	@RequestMapping("/deleteProduct")
	@ResponseBody
	public int deleteProduct(@RequestParam("product_id") String product_id) {
		return service.updDelete_tag(product_id,"已删除");
	}
	
	//恢复审核通过的产品信息
	@RequestMapping("/recoverProduct")
	@ResponseBody
	public int recoverProduct(@RequestParam("product_id") String product_id) {
		return service.updDelete_tag(product_id,"未删除");
	}
	
	//永久删除审核通过的产品信息
	@RequestMapping("/yjDeleteProduct")
	@ResponseBody
	public int yjDeleteProduct(@RequestParam("product_id") String product_id) {
		return service.yjDeleteProduct(product_id);
	}
	
	//产品档案等待审核查询
	@RequestMapping("/cpdash")
	@ResponseBody   
	public List<D_file > selectcpdash(@RequestParam("check_tag") String check_tag){
		return service.selectcpdash(check_tag);
	}
	
	//查询等待复核总数
	@RequestMapping("/ddfynum")
	@ResponseBody    
	public int selectddfh(@RequestParam("check_tag") String check_tag){
		return service.selectddfh(check_tag);
	}
	
	//查询通过复核总数
	@RequestMapping("/tgfynum")
	@ResponseBody   
	public int selecttgfh(@RequestParam("check_tag") String check_tag){
		return service.selecttgfh(check_tag);
	}
	
	//产品类型查询
	@RequestMapping("selecttype")
	@ResponseBody   
	public List<Type> selecttype(){
		return service.selecttype();
	}
	
	//产品档次查询
	@RequestMapping("selectpclass")
	@ResponseBody   
	public List<Pclass> selectpclass(){
		return service.selectpclass();
	}
	
	//产品档案审核
	@RequestMapping("/updatefh")
	@ResponseBody  
	public String updfh(@RequestBody D_file d_file) {
		return service.updfh(d_file)>0?"成功":"失败";
	}
	
	
	//产品物料设计单查询
	@RequestMapping("/wusjsh")
	@ResponseBody    
	public List<D_module> selectwusjsh(@RequestParam("check_tag") String check_tag){
		
		return service.selectwusjsh(check_tag);
	}
	
	//查询产品物料设计单等待审核总数
	@RequestMapping("/wuddshsum")
	@ResponseBody    
	public int selectwuddshsum(@RequestParam("check_tag") String check_tag){
		return service.selectwuddshsum(check_tag);
	}
	
	 //查询产品设计单物料明细
	@RequestMapping("/wlmx")
	@ResponseBody   
	public List<D_module_details> selectwlmx(@RequestParam("design_id") String design_id){
		return service.selectwlmx(design_id);
	}
	
	//产品物料设计审核  --通过
	@RequestMapping("/updatewlsh")
	@ResponseBody  
	public int updatewlsh(@RequestBody D_module d_module) {
		return service.updatewlsh(d_module);
	}
	
	//产品物料设计审核  --不通过
	@RequestMapping("/delwlsj")
	@ResponseBody  
	public int delwlsj(@RequestParam("design_id") String design_id,@RequestParam("product_id") String product_id,@RequestParam("design_module_tag") String design_module_tag) {
		service.delwlsjmx(design_id);
		service.updcpdnwlsj(product_id,design_module_tag);
		return service.delwlsj(design_id);
	}
	
	
	//查询显示的信息为所有已通过复核的产品档案
	@RequestMapping("/selectId2")
	@ResponseBody
	public List<D_file> selectId2() {
			//System.out.println("1111");
			List<D_file> list=service.selectId2("审核通过");
			//System.out.println(list);
			return list;
	}
	
	
	//通过产品编号(id)查询档案信息
	@RequestMapping("/Selidxx")
	@ResponseBody
	public D_file Selidxx(String product_id) {
		D_file file=service.Selidxx(product_id);
		return file;
	}
	
	//提交变更(修改)
	@RequestMapping("/updBG")
	@ResponseBody
	public String updBG(@RequestBody D_file file) {
		 int upd=service.updBG(file);
		 return upd>0?"成功":"失败";
   }


	
	//查询通过审核的商品档案信息
	@RequestMapping("/Selad")
	@ResponseBody
	public List<D_file> Selad() {
		List<D_file> list=service.Selad("审核通过","未设计",1);
		return list;
	}
	
	//查询通过审核的物料信息
	@RequestMapping("/Selad2")
	@ResponseBody
	public List<D_file> Selad2() {
		List<D_file> list=service.Selad("审核通过","未设计", 2);
		return list;
	}
	//添加产品物料组成设计单和物料组成明细单
	@RequestMapping("/productWlZc")
	@ResponseBody
    public List<D_module_details> productWlZc(@RequestParam("bh") String[] bh,@RequestParam("mc") String[] mc,@RequestParam("lx") String[] lx,@RequestParam("dc") String[] dc,@RequestParam("sl") int[] sl,@RequestParam("dw") String[] dw,@RequestParam("dj") double[] dj,@RequestParam("product_id") String product_id,@RequestParam("product_name") String product_name,@RequestParam("sjdh") String sjdh,@RequestParam("sjr") String sjr) {		
		double zje =0;
    	List<D_module_details> list = new ArrayList<D_module_details>();
		for (int i = 0; i < dj.length; i++) {
			service.wlZcMx(sjdh,bh[i],mc[i],dw[i],sl[i],dj[i],sl[i]*dj[i]);
			service.updWlSj(product_id,"已设计");
			D_module_details dmd = new D_module_details(bh[i],mc[i],dw[i],sl[i],dj[i],sl[i]*dj[i],lx[i],dc[i]);
			zje +=sl[i]*dj[i];
			list.add(dmd);
		}
		service.productWlZc(sjdh,product_id,product_name,sjr,zje);
		return list;
	}
    
    @RequestMapping("/addda")
	@ResponseBody
	 public String addda(@RequestBody D_file file ) {
		 int row =service.addda(file);
		 return row>0?"成功":"失败";
	 } 	
	
	@RequestMapping("/selectfeilei")
	@ResponseBody
	public List<Feilei> selectfeilei(){
		List<Feilei> list =service.selectfeilei();
		return list;
	}
	
}
