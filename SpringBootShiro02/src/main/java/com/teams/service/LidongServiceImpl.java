package com.teams.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.LidongMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.m_apply;

@Service
@Transactional
public class LidongServiceImpl implements LidongService{

	@Autowired
	LidongMapper mapper;
	
	//添加产品  --查询符合条件的产品
	@Override
	public List<D_file> selectcp(@Param("design_procedure_tag")String design_procedure_tag) {
		// TODO Auto-generated method stub
		return mapper.selectcp(design_procedure_tag);
	}

	//添加产品  --查询选中的产品信息
	@Override
	public D_file selectcpxx(@Param("product_id")String product_id) {
		// TODO Auto-generated method stub
		return mapper.selectcpxx(product_id);
	}

	//添加生产计划
	@Override
	public int addSc(@Param("apply_id")String apply_id,@Param("remark")String remark,@Param("subtotal")Double subtotal,@Param("register")String register,@Param("check_tag")String check_tag) {
		// TODO Auto-generated method stub
		return mapper.addSc(apply_id,remark,subtotal,register,check_tag);
	}
	
	//添加生产计划产品明细
	@Override
	public void addScmx(String apply_id,String string,String string2,String string3,Integer integer, String string4,
			Double double1,@Param("manufacture_tag")String manufacture_tag) {
		// TODO Auto-generated method stub
		mapper.addScmx(apply_id,string,string2,string3,integer,string4,double1,manufacture_tag);
	}

	//查询生产计划明细
	@Override
	public List<D_file> selectscmx(String apply_id) {
		// TODO Auto-generated method stub
		return mapper.selectscmx(apply_id);
	}

	//查询所有等待审核的生产计划
	@Override
	public List<m_apply> selectShcx(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectShcx(check_tag);
	}

	//查询所有等待审核的生产计划总数
	@Override
	public int selectShcxsum(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectShcxsum(check_tag);
	}

	//生产计划审核通过
	@Override
	public int updShjh(m_apply apply) {
		// TODO Auto-generated method stub
		return mapper.updShjh(apply);
	}

	//生产计划审核不通过
	@Override
	public int delShjh(String apply_id) {
		// TODO Auto-generated method stub
		return mapper.delShjh(apply_id);
	}

	//生产计划审核不通过 --删除生产计划明细
	@Override
	public void delShjhmx(String apply_id) {
		// TODO Auto-generated method stub
		mapper.delShjhmx(apply_id);
	}

	//查询所有生产计划
	@Override
	public List<m_apply> selectShjh() {
		// TODO Auto-generated method stub
		return mapper.selectShjh();
	}



	
	
	
}
