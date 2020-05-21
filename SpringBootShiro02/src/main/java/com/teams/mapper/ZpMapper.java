package com.teams.mapper;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.Roles;
import com.teams.pojo.User;
import com.teams.pojo.permissions;
import com.teams.pojo.permissions_role;
import com.teams.pojo.user_role;
import com.teams.utils.Params;

public interface ZpMapper {

	//查询所有用户
	List<User> AllUser();
	//新增用户
	int addUser(User us);
	//查询所有角色
	List<Roles> selectAllrole();
	//给用户赋予角色
	int FuRoles(user_role ur);
	//删除用户
	int deluser(int id);
	//删除用户角色
	void deluserRo(int id);
	//通过id查询用户信息
	User Select2(int id);
	//查询出这个用户没有的角色
	List<Roles> Sel3(int id);
	//修改用户信息
	int upduser(User us);
	//修改用户角色信息
	int upduR(user_role ur);
	//查询所有角色
	List<User> AllRoles();
	//增加角色
	int addRoles(Roles ro);
	//查询角色没有的权限
	List<permissions> SelQu(int id);
	//赋予角色权限
	int FuQX(int rid, int i);
	//删除角色权限
	void delRoQx(int id);
	//删除角色
	int delRole(int id);
	//删除用户角色
	int deluserRo11(int id);
	//查询所有的权限
	PageInfo<permissions> AllQX(Params params);
	//增加权限
	int addQX(permissions per);
	//查询父级菜单
	List<permissions> SelFj(String f_ParentId);
	//通过id查询权限信息
	permissions SelidQ(int id);
	//修改权限信息
	int updatePer(permissions per);
	//查询这个权限有哪些角色是赋予了
	List<permissions_role> SelY22(int pid);
	permissions SelY2(int id);
	//撤销角色权限
	int CxiaoRoleQ(int pid, int i);
	//删除权限
	int delQx(int pid);
	//删除角色权限通过pid
	void delRoQx3(int pid);
	//修改角色
	int updRoles(int id,String name);
	//通过id查询角色信息
	Roles selidRole(int id);
	//查询角色id
	int wmznp(String djr);
}
