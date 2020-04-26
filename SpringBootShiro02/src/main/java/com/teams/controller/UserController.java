package com.teams.controller;


import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {

	@RequestMapping("{page}")
	public String Page(@PathVariable String page) {
		return page;
	}
	
	/*
	 * 无权限者
	 */
	@RequestMapping("/noAuth")
	public String noAuth() {
		System.out.println("noAuth...");
		return "/noAuth";
	}
	
	@RequestMapping("/toLogin")
	public String login() {
		return "/login";
	}
	
	/*
	 * 登录逻辑处理
	 * */
	
	@RequestMapping("/Login")
	public String login(String username,String password,Model model,HttpSession session) {	
		
		//使用shiro编写认证操作
		//1:获取Subject
		Subject subject=SecurityUtils.getSubject();
		//2：封装用户数据
		UsernamePasswordToken token=new UsernamePasswordToken(username,password);
		
		//3：执行登录方法
		try {
			subject.login(token);
			session.setAttribute("username", username);
			//登录成功
			//跳转到index.html
			return "redirect:/index";
		} catch (UnknownAccountException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//登录失败:用户名不存在
			model.addAttribute("msg", "用户名不存在");
			return "Login";
		}catch (IncorrectCredentialsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//登录失败:密码错误
			model.addAttribute("msg", "密码错误");
			return "Login";
		}
		
	}
}
