package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.service.ProductSjService;
import com.teams.pojo.D_file;
import com.teams.pojo.D_module;
import com.teams.pojo.D_module_details;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;
@Controller
public class ProductSjController {
	@Autowired
    ProductSjService service;
	
	//去页面
	@RequestMapping("/gocpdash")
	public String aaa() {
		return "cpdash";
	}
	@RequestMapping("/cpdash")
	@ResponseBody    //产品档案等待审核查询
	public List<D_file > selectcpdash(@RequestParam("check_tag") String check_tag){
		return service.selectcpdash(check_tag);
	}
	
	@RequestMapping("/ddfynum")
	@ResponseBody    //查询等待复核总数
	public int selectddfh(@RequestParam("check_tag") String check_tag){
		return service.selectddfh(check_tag);
	}
	
	@RequestMapping("/tgfynum")
	@ResponseBody    //查询通过复核总数
	public int selecttgfh(@RequestParam("check_tag") String check_tag){
		return service.selecttgfh(check_tag);
	}
	
	@RequestMapping("selecttype")
	@ResponseBody   //产品类型查询
	public List<Type> selecttype(){
		return service.selecttype();
	}
	@RequestMapping("selectpclass")
	@ResponseBody   //产品档次查询
	public List<Pclass> selectpclass(){
		return service.selectpclass();
	}
	@RequestMapping("/updatefh")
	@ResponseBody  //产品档案审核
	public String updfh(@RequestBody D_file d_file) {
		return service.updfh(d_file)>0?"成功":"失败";
	}
	
	
	
	//去页面
	@RequestMapping("/towlzcsh")
	public String bb() {
		return "wlzcsh";
	}
	@RequestMapping("/wusjsh")
	@ResponseBody    //产品物料设计单查询
	public List<D_module> selectwusjsh(@RequestParam("check_tag") String check_tag){
		
		return service.selectwusjsh(check_tag);
	}
	@RequestMapping("/wuddshsum")
	@ResponseBody    //查询产品物料设计单等待审核总数
	public int selectwuddshsum(@RequestParam("check_tag") String check_tag){
		return service.selectwuddshsum(check_tag);
	}
	
	@RequestMapping("/wlmx")
	@ResponseBody    //查询产品设计单物料明细
	public List<D_module_details> selectwlmx(@RequestParam("design_id") String design_id){
		return service.selectwlmx(design_id);
	}
	@RequestMapping("/updatewlsh")
	@ResponseBody  //产品物料设计审核  --通过
	public int updatewlsh(@RequestBody D_module d_module) {
		return service.updatewlsh(d_module);
	}
	@RequestMapping("/delwlsj")
	@ResponseBody  //产品物料设计审核  --不通过
	public int delwlsj(@RequestParam("design_id") String design_id,@RequestParam("product_id") String product_id,@RequestParam("design_module_tag") String design_module_tag) {
		service.delwlsjmx(design_id);
		service.updcpdnwlsj(product_id,design_module_tag);
		return service.delwlsj(design_id);
	}
	
	
}
