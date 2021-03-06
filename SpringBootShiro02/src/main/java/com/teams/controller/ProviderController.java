package com.teams.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.provider;
import com.teams.service.ProviderService;
import com.teams.utils.Params;

@Controller
public class ProviderController {
	
	@Autowired
	ProviderService service;
	
	//查询所有供应商
	@RequestMapping("/AllGYS")
	@ResponseBody
	 public PageInfo<provider> AllGYS(@RequestBody Params params){
		 PageInfo<provider> list=service.AllGYS(params);
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
		public PageInfo<provider> AllGYSFu(@RequestBody Params params){
			PageInfo<provider> list=service.AllGYSFu(params);
		return list;
	 }
 

	@RequestMapping("/AllGYSFu1")
	@ResponseBody
	public PageInfo<provider> AllGYSFu1(@RequestBody Params params){
		PageInfo<provider> list=service.AllGYSFu1(params);
	return list;
    }
	//供应商审核通过
	@RequestMapping("/updGYSFuS")
	@ResponseBody
	public String updGYSFuS(@RequestParam("providerId") String providerId,@RequestParam("checker") String checker,@RequestParam("check_tag") String check_tag,@RequestParam("check_reason") String check_reason){
		int upd=service.updGYSFuS("未变更", providerId,checker,check_tag,check_reason);
		return upd>0?"成功":"失败";
	}	
	
	//供应商删除
	@RequestMapping("/delGYS")
	@ResponseBody
	public String delGYS(@RequestParam("providerId") String providerId) {
		int del=service.delGYS(providerId);
		return del>0?"成功":"失败";
	}
	
	//查询未变更的供应商
	@RequestMapping("/selWBG")
	@ResponseBody 
	public PageInfo<provider> selWBG(@RequestBody Params params){
		PageInfo<provider> list=service.selWBG(params);
		return list;
	}
	
	//提交变更(修改)
	@RequestMapping("/updGYSBG")
	@ResponseBody
	public String updGYSBG(@RequestBody provider pro) {
			 int upd=service.updGYSBG(pro);
			 return upd>0?"成功":"失败";
	 }
}
