package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.teams.mapper.ZpMapper;
import com.teams.pojo.Roles;
import com.teams.pojo.User;
import com.teams.pojo.permissions;
import com.teams.pojo.permissions_role;
import com.teams.pojo.user_role;
import com.teams.utils.Params;

@Service
public class ZpServiceimpl implements ZpService{

	@Autowired
	ZpMapper mapper;
	
	@Override
	public List<User> AllUser() {
		// TODO Auto-generated method stub
		return mapper.AllUser();
	}

	@Override
	public int addUser(User us) {
		// TODO Auto-generated method stub
		return mapper.addUser(us);
	}

	@Override
	public List<Roles> selectAllrole() {
		// TODO Auto-generated method stub
		return mapper.selectAllrole();
	}

	@Override
	public int FuRoles(user_role ur) {
		// TODO Auto-generated method stub
		return mapper.FuRoles(ur);
	}

	@Override
	public int deluser(int id) {
		// TODO Auto-generated method stub
		return mapper.deluser(id);
	}

	@Override
	public void deluserRo(int id) {
		mapper.deluserRo(id);
	}

	@Override
	public User Select2(int id) {
		// TODO Auto-generated method stub
		return mapper.Select2(id);
	}

	@Override
	public List<Roles> Sel3(int id) {
		// TODO Auto-generated method stub
		return mapper.Sel3(id);
	}

	@Override
	public int upduser(User us) {
		// TODO Auto-generated method stub
		return mapper.upduser(us);
	}

	@Override
	public int upduR(user_role ur) {
		// TODO Auto-generated method stub
		return mapper.upduR(ur);
	}

	@Override
	public List<User> AllRoles() {
		// TODO Auto-generated method stub
		return mapper.AllRoles();
	}

	@Override
	public int addRoles(Roles ro) {
		// TODO Auto-generated method stub
		return mapper.addRoles(ro);
	}

	@Override
	public List<permissions> SelQu(int id) {
		// TODO Auto-generated method stub
		return mapper.SelQu(id);
	}

	@Override
	public int FuQX(int rid, int i) {
		// TODO Auto-generated method stub
		return mapper.FuQX(rid,i);
	}

	@Override
	public void delRoQx(int id) {
		// TODO Auto-generated method stub
		mapper.delRoQx(id);
	}

	@Override
	public int delRole(int id) {
		// TODO Auto-generated method stub
		return mapper.delRole(id);
	}

	@Override
	public int deluserRo11(int id) {
		// TODO Auto-generated method stub
		return mapper.deluserRo11(id);
	}

	@Override
	public PageInfo<permissions> AllQX(Params params) {
		// TODO Auto-generated method stub
		return mapper.AllQX(params);
	}

	@Override
	public int addQX(permissions per) {
		// TODO Auto-generated method stub
		return mapper.addQX(per);
	}

	@Override
	public List<permissions> SelFj(String f_ParentId) {
		// TODO Auto-generated method stub
		return mapper.SelFj(f_ParentId);
	}

	@Override
	public permissions SelidQ(int id) {
		// TODO Auto-generated method stub
		return mapper.SelidQ(id);
	}

	@Override
	public int updatePer(permissions per) {
		// TODO Auto-generated method stub
		return mapper.updatePer(per);
	}

	@Override
	public List<permissions_role> SelY22(int pid) {
		// TODO Auto-generated method stub
		return mapper.SelY22(pid);
	}

	@Override
	public int CxiaoRoleQ(int pid, int i) {
		// TODO Auto-generated method stub
		return mapper.CxiaoRoleQ(pid, i);
	}

	@Override
	public int delQx(int pid) {
		// TODO Auto-generated method stub
		return mapper.delQx(pid);
	}

	@Override
	public void delRoQx3(int pid) {
		// TODO Auto-generated method stub
		mapper.delRoQx3(pid);
	}

	@Override
	public int updRoles(int id,String name) {
		// TODO Auto-generated method stub
		return mapper.updRoles(id,name);
	}

	@Override
	public Roles selidRole(int id) {
		// TODO Auto-generated method stub
		return mapper.selidRole(id);
	}

	
	@Override
	public int wmznp(String djr) {
		return mapper.wmznp(djr);
	}

	



}
