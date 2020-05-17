package com.teams.service;

import java.util.List;

import com.teams.pojo.D_file;
import com.teams.pojo.cgPlan;
import com.teams.pojo.cgPlanXq;

public interface ProductCgService {

	//查询符合条件的产品档案
	List<D_file> selectCp(String check_tag);

	//查询符合条件的产品档案总数
	int selectCpsum(String check_tag);

	//点击添加查询选中的产品信息
	D_file selectCgcpxx(String product_id);

	//添加采购计划
	int addproductCg(String cgPlanId, String remark, String register, String check_tag);

	//添加采购详情计划
	void addcgPlanXq(String cgPlanId, String string, String string2, double d, String string3, double e,
			String execute_tag);

	//查询采购明细
	List<cgPlanXq> selectCgmx(String cgPlanId);

	//查询所有等待审核的采购计划单
	List<cgPlan> selectCgddsh(String check_tag);

	//查询所有等待审核的采购计划单总数
	int selectCgddshsum(String check_tag);

	//采购计划审核
	int updCgshtg(cgPlan cgPlan);

	//查询所有的采购计划单
	List<cgPlan> selectGetCg();

	//查询所有等待审核的采购计划单总数
	int selectGetCgsum();

	//查询不在采购计划的产品档案信息 ----修改采购计划
	List<D_file> selectXgCgcpda(String cgPlanId);

	//查询不在采购计划的产品档案信息总数 ----修改采购计划
	int selectXgCgcpdasum(String cgPlanId);

	//追加采购明细表产品
	void addcgjxmx(String cgPlanId, String string, String string2, String string3, double d, String execute_tag);

	//点击删除采购计划详情产品
	int delcgjxmx(String cgPlanId, String product_id);

	//修改采购计划
	int updcgjh(String cgPlanId, String check_tag,String remark);
	
	//修改采购计划明细
	void updcgjhmx(String cgPlanId, String string, Double double1);

	

	
	
}
