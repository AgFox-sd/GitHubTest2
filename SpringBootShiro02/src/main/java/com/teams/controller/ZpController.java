package com.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.Roles;
import com.teams.pojo.User;
import com.teams.pojo.permissions;
import com.teams.pojo.permissions_role;
import com.teams.pojo.user_role;
import com.teams.service.ZpService;

@Controller
public class ZpController {

	@Autowired
	ZpService service;
	
	//查询所有用户
	@RequestMapping("/AllUser")
	@ResponseBody
	public List<User> AllUser() {
			List<User> list=service.AllUser();
			return list;
	}
	
	
	
	//新增用户
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(@RequestBody User us) {
		int add=service.addUser(us);
		return add>0?"成功":"失败";
	}
	
	//查询所有角色信息
	@RequestMapping("/selectAllrole")
	@ResponseBody
	public List<Roles> selectAllrole() {
		List<Roles> rolist =service.selectAllrole();
		return rolist;
	}
	
	//给用户赋予角色
	@RequestMapping("/FuRoles")
	@ResponseBody
	public String FuRoles(@RequestBody user_role ur) {
		int add=service.FuRoles(ur);
		return add>0?"成功":"失败";
	}
	
	//删除用户同时删除用户角色
	@RequestMapping("/delUser")
	@ResponseBody
	public String delUser(int id) {
		int del=service.deluser(id);
			service.deluserRo(id);
		return del>0?"成功":"失败";
	}
	
	//通过id查询用户信息
    @RequestMapping("/Select2")
    @ResponseBody
    public User Select2(int id){
	   	User us=service.Select2(id);
	   	return us;
    }
    
    //通过id查询用户没有的角色service.Sel3(id);//查询出这个用户没有的角色
    @RequestMapping("/Sel3")
    @ResponseBody
    public List<Roles> Sel3(int id){
    	List<Roles> role=service.Sel3(id);
	   	return role;
    }
    
    //修改用户信息
	@RequestMapping("/updateUser")
	@ResponseBody
	public String updateUser(int uid,String username,int rid) {
		int upd=service.upduser(new User(uid,username,rid));
		int upd2=service.upduR(new user_role(uid,rid));//修改用户权限
		if(upd>0&&upd2>0) {
			return "成功";
		}else {
			return "失败";
		}
	}
	
	//查询所有的角色
	@RequestMapping("/AllRoles")
	@ResponseBody
	public List<User> AllRoles() {
			List<User> list=service.AllRoles();
			return list;
	}
	
	//增加角色
	@RequestMapping("/addRoles")
	@ResponseBody
	public String addRoles(@RequestBody Roles ro) {
		int add=service.addRoles(ro);
		return add>0?"成功":"失败";
	}
	
	//查询所有角色没有权限信息
	 @RequestMapping("/SelQu")
	 @ResponseBody
	 public List<permissions> SelQu(int id){
	    	List<permissions> role=service.SelQu(id);
		   	return role;
	 }
	 
	 //给角色赋予权限
	@RequestMapping("/FuQX")
	@ResponseBody
	public String FuQX(int rid,@RequestParam("pid") int[] pid) {
		int add = 0;
		for (int i = 0; i < pid.length; i++) {
			add=service.FuQX(rid,pid[i]);
		}
		return add>0?"成功":"失败";
	}
	
	//删除角色同时删除角色权限,用户角色
	@RequestMapping("/delRole")
	@ResponseBody
	public String delRole(int id) {
		int del=service.delRole(id);
			service.delRoQx(id);
			service.deluserRo11(id);
		return del>0?"成功":"失败";
	}
	
	//查询所有的权限
	@RequestMapping("/AllQX")
	@ResponseBody
	public PageInfo<permissions> AllQX(@RequestBody com.teams.utils.Params params) {
		PageInfo<permissions> permisPageInfo=service.AllQX(params);
		System.out.println(1111);
	    return permisPageInfo;
	}
	
	//增加权限
	@RequestMapping("/addQX")
	@ResponseBody
	public String addQX(@RequestBody permissions per) {
		int add=service.addQX(per);
		return add>0?"成功":"失败";
	}
	
	//查询父级菜单
	@RequestMapping("/SelFj")
	@ResponseBody
	public List<permissions> SelFj(String f_ParentId) {
			List<permissions> list=service.SelFj("0");
			return list;
	}
	
	//通过id查询权限信息
    @RequestMapping("/SelidQ")
    @ResponseBody
    public permissions SelidQ(int id){
    	permissions per=service.SelidQ(id);
	   	return per;
    }
    
    //修改权限信息
 	@RequestMapping("/updatePer")
 	@ResponseBody
 	public String updatePer(permissions per) {
 		int upd=service.updatePer(per);
 		return upd>0?"成功":"失败";
 	}
	
 	//查询这个权限有哪些角色是赋予了
 	@RequestMapping("/SelidQs")
    @ResponseBody
    public List<permissions_role> SelidQs(int id){		
 		return service.SelY22(id);
    }
    
    
    //撤销权限，获取角色id，删除角色权限表数据
    @RequestMapping("/CxiaoRoleQ")
    @ResponseBody
    public String CxiaoRoleQ(int pid,@RequestParam("rid") int[] je) {
		int del = 0;
		for (int i = 0; i < je.length; i++) {
			del=service.CxiaoRoleQ(pid,je[i]);
		}
		return del>0?"成功":"失败";
	}
    
    
    //删除权限
    @RequestMapping("/delQx")
    @ResponseBody
	public String delQx(int pid) {
		int del=service.delQx(pid);//删除权限
			service.delRoQx3(pid);//删除角色权限
		return del>0?"成功":"失败";
	}
    
    //通过id查询角色信息
    @RequestMapping("/selidRole")
    @ResponseBody
    public Roles selidRole(int id){
    	Roles roles=service.selidRole(id);
	   	return roles;
    }
    
    //修改角色
    @RequestMapping("/updRoles")
    @ResponseBody
    public String updRoles(int id,String name) {
    	int upd=service.updRoles(id,name);
    	return upd>0?"成功":"失败";
    }
    
    //查询角色id
    @RequestMapping("/wmznp")
    @ResponseBody
    public int wmznp(String djr) {
        return service.wmznp(djr);	
    }
}
