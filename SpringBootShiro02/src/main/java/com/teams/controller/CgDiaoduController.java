package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.cgPlanXq;
import com.teams.service.CgDiaoduService;

@Controller
public class CgDiaoduController {

	@Autowired
	CgDiaoduService service;
	
	@RequestMapping("/selectcgPlanXq")
	@ResponseBody
	public List<cgPlanXq> selectcgPlanXq(){
		return service.selectcgPlanXq();
	}
	
	
}
