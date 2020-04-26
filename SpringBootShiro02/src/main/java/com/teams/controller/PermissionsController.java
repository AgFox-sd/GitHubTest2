package com.teams.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teams.pojo.permission;
import com.teams.service.PermissionsService;

@Controller
public class PermissionsController {

	@Autowired
	PermissionsService service ;
	
	@RequestMapping("/selectPermission")
	@ResponseBody
	public List<permission> selectPermission(HttpSession session){
		String username = (String) session.getAttribute("username");
		List<permission> list = service.selectPermission(username);
		System.out.println(list);
		return list;
	}
}
