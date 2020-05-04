package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teams.mapper.ProducePgMapper;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_apply;
import com.teams.pojo.m_pg;
import com.teams.pojo.m_procedure_module;

@Service
public class ProducePgServiceimpl implements ProducePgService{

	@Autowired
	ProducePgMapper mapper;
	
	@Override
	public List<m_apply> SelectApply(String check_tag, String manufacture_tag) {
		// TODO Auto-generated method stub
		return mapper.SelectApply(check_tag,manufacture_tag);
	}

	@Override
	public List<M_design_procedure_details> SelGx(String product_id) {
		// TODO Auto-generated method stub
		return mapper.SelGx(product_id);
	}

	@Override
	public List<m_procedure_module> SelWL(String design_id, String name) {
		// TODO Auto-generated method stub
		return mapper.SelWL(design_id, name);
	}

	@Override
	public int addPg(m_pg pg) {
		// TODO Auto-generated method stub
		return mapper.addPg(pg);
	}

	@Override
	public int updAySh(String product_id,String scbh) {
		// TODO Auto-generated method stub
		return mapper.updAySh(product_id,scbh);
	}

	@Override
	public List<m_pg> SelectPg(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.SelectPg(check_tag);
	}

	@Override
	public int SelSum(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.SelSum(check_tag);
	}

	@Override
	public int updPgtg(String check_tag,String pg_id) {
		// TODO Auto-generated method stub
		return mapper.updPgtg(check_tag,pg_id);
	}

	//审核未通过,删除派工单 并修改派工标志
	@Override
	public void updPgbz(String product_id, String apply_id, String manufacture_tag) {
		mapper.updPgbz(product_id, apply_id, manufacture_tag);
	}

	@Override
	public int delPgd(String pg_id) {
		// TODO Auto-generated method stub
		return mapper.delPgd(pg_id);
	}

	@Override
	public List<m_pg> SelectPG2(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.SelectPG2(check_tag);
	}

	@Override
	public int SelSum2(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.SelSum2(check_tag);
	}





}
