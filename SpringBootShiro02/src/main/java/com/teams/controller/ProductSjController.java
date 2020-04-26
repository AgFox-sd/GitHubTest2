package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teams.service.ProductSjService;
import com.teams.pojo.D_file;
import com.teams.pojo.Feilei;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;
@Controller
public class ProductSjController {
	@Autowired
    ProductSjService service;
	
	@RequestMapping("/addda")
	@ResponseBody
	 public String addda(@RequestBody D_file file ) {
		 int row =service.addda(file);
		 return row>0?"成功":"失败";
	 } 
	
	@RequestMapping("/zcfiles")
	public String zcfiles() {
		return "zcfile";
	}
	
	@RequestMapping("/selecttype")
	@ResponseBody
	public List<Type> selecttype(){
		List<Type> list =service.selecttype();
		return list;
	}
	@RequestMapping("/selectfeilei")
	@ResponseBody
	public List<Feilei> selectfeilei(){
		List<Feilei> list =service.selectfeilei();
		return list;
	}
	@RequestMapping("/selectpclass")
	@ResponseBody
	public List<Pclass> selectpclass(){
		List<Pclass> list =service.selectpclass();
		return list;
	}
}
