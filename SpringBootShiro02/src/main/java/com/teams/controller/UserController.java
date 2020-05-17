package com.teams.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
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

	//路径是什么 就跳转到对应的页面
    @RequestMapping("{page}")
	public String page(@PathVariable String page,HttpServletRequest res) {
       res.setAttribute("sjdh",Dindan());
       System.out.println(Dindan());
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
	
	//生成订单编号
	public String Dindan() {
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String batchno=format.format(new Date());
		int num=(int)((Math.random()*9+1)*100000);
		return 200+batchno+num;
	}
	
	
	/*
	 *  * 登录逻辑处理
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
			session.setAttribute("username", username);
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
