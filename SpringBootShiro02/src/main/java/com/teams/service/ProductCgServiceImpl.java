package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teams.mapper.ProductCgMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.cgPlan;
import com.teams.pojo.cgPlanXq;

@Service
public class ProductCgServiceImpl implements ProductCgService{

	@Autowired
	ProductCgMapper mapper;

	//查询符合条件的产品档案
	@Override
	public List<D_file> selectCp(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectCp(check_tag);
	}

	//查询符合条件的产品档案总数
	@Override
	public int selectCpsum(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectCpsum(check_tag);
	}

	//点击添加查询选中的产品信息
	@Override
	public D_file selectCgcpxx(String product_id) {
		// TODO Auto-generated method stub
		return mapper.selectCgcpxx(product_id);
	}

	//添加采购计划
	@Override
	public int addproductCg(String cgPlanId, String remark, String register, String check_tag) {
		// TODO Auto-generated method stub
		return mapper.addproductCg(cgPlanId,remark,register,check_tag);
	}

	//添加采购详情计划
	@Override
	public void addcgPlanXq(String cgPlanId, String string, String string2, double d, String string3, double e,
			String execute_tag) {
		// TODO Auto-generated method stub
		mapper.addcgPlanXq(cgPlanId,string,string2,d,string3,e,execute_tag);
	}

	//查询采购明细
	@Override
	public List<cgPlanXq> selectCgmx(String cgPlanId) {
		// TODO Auto-generated method stub
		return mapper.selectCgmx(cgPlanId);
	}

	//查询所有等待审核的采购计划单
	@Override
	public List<cgPlan> selectCgddsh(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectCgddsh(check_tag);
	}

	//查询所有等待审核的采购计划单总数
	@Override
	public int selectCgddshsum(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectCgddshsum(check_tag);
	}

	//采购计划审核
	@Override
	public int updCgshtg(cgPlan cgPlan) {
		// TODO Auto-generated method stub
		return mapper.updCgshtg(cgPlan);
	}

	//查询所有的采购计划单
	@Override
	public List<cgPlan> selectGetCg() {
		// TODO Auto-generated method stub
		return mapper.selectGetCg();
	}

	//查询所有等待审核的采购计划单总数
	@Override
	public int selectGetCgsum() {
		// TODO Auto-generated method stub
		return mapper.selectGetCgsum();
	}

	//查询不在采购计划的产品档案信息 ----修改采购计划
	@Override
	public List<D_file> selectXgCgcpda(String cgPlanId) {
		// TODO Auto-generated method stub
		return mapper.selectXgCgcpda(cgPlanId);
	}

	//查询不在采购计划的产品档案信息总数 ----修改采购计划
	@Override
	public int selectXgCgcpdasum(String cgPlanId) {
		// TODO Auto-generated method stub
		return mapper.selectXgCgcpdasum(cgPlanId);
	}

	//追加采购明细表产品
	@Override
	public void addcgjxmx(String cgPlanId, String string, String string2, String string3, double d,
			String execute_tag) {
		// TODO Auto-generated method stub
		mapper.addcgjxmx(cgPlanId,string,string2,string3,d,execute_tag);
	}

	//点击删除采购计划详情产品
	@Override
	public int delcgjxmx(String cgPlanId, String product_id) {
		// TODO Auto-generated method stub
		return mapper.delcgjxmx(cgPlanId,product_id);
	}

	//修改采购计划
	@Override
	public int updcgjh(String cgPlanId, String check_tag,String remark) {
		// TODO Auto-generated method stub
		return mapper.updcgjh(cgPlanId,check_tag,remark);
	}
	
	//修改采购计划明细
	@Override
	public void updcgjhmx(String cgPlanId, String string, Double double1) {
		// TODO Auto-generated method stub
		mapper.updcgjhmx(cgPlanId,string,double1);
	}

	
	
	
	
	
	
	
	
}
