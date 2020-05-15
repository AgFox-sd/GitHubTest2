package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.D_file;
import com.teams.pojo.provider;
import com.teams.service.ProviderService;

@Controller
public class ProviderController {
	
	@Autowired
	ProviderService service;
	
	//查询所有供应商
	@RequestMapping("/AllGYS")
	@ResponseBody
	 public List<provider> AllGYS(){
		 List<provider> list=service.AllGYS();
		return list;
	 }
	 
	 //查询供应商详情
	 @RequestMapping("/Selxx")
	 @ResponseBody
	 public provider Selxx(String providerId) {
		 provider pro=service.Selxx(providerId);
		return pro;
	 }
	 
	//查询供应商名称是否重复
	@RequestMapping("/selectgysname")
	@ResponseBody
	public int selectgysname(@RequestBody provider pro) {
			int row =service.selectgysname(pro);
			return row;
		}
	 
	 //增加供应商
	 @RequestMapping("/addGYS")
	 @ResponseBody
	 public int addGYS(@RequestParam("providerId") String providerId,@RequestParam("providerName")  String providerName,@RequestParam("providerAddress") String providerAddress,
			@RequestParam("linkman") String linkman,@RequestParam("providerPhone") String providerPhone,@RequestParam("fid") int fid,@RequestParam("register") String register) {
		 int add=service.addGYS(providerId,providerName,providerAddress,linkman,fid,providerPhone,register);
		 return add;
	 }
	 
	//供应商审核查询
	@RequestMapping("/AllGYSFu")
	@ResponseBody
		public List<provider> AllGYSFu(){
		 List<provider> list=service.AllGYSFu("等待审核");
		return list;
	 }
	//供应商审核通过
	//@RequestMapping("/AllGYSFu")
	//@ResponseBody
	//public int AllGYSFuS(){
		//int upd=service.AllGYSFuS("");
	//	return upd;
	//}	
	 
}
