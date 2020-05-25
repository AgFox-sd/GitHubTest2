package com.teams.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teams.pojo.D_file;
import com.teams.pojo.cgPlan;
import com.teams.pojo.cgPlanXq;
import com.teams.utils.Params;

public interface ProductCgMapper {

	//查询符合条件的产品档案
	List<D_file> selectCp(String check_tag);

	//查询符合条件的产品档案总数
	int selectCpsum(String check_tag);

	//点击添加查询选中的产品信息
	D_file selectCgcpxx(String product_id);

	//添加采购计划
	int addproductCg(String cgPlanId, String remark, String register, String check_tag);

	//添加采购详情计划
	void addcgPlanXq(String cgPlanId,@Param("product_id")String string,@Param("product_name")String string2,@Param("amount")double d,@Param("amount_unit")String string3,@Param("cost_price")double e,
			String execute_tag);

	//查询采购明细
	List<cgPlanXq> selectCgmx(String cgPlanId);

	//查询所有等待审核的采购计划单
	List<cgPlan> selectCgddsh(Params params);

	//查询所有等待审核的采购计划单总数
	int selectCgddshsum(String check_tag);

	//采购计划审核
	int updCgshtg(cgPlan cgPlan);

	//查询所有的采购计划单
	List<cgPlan> selectGetCg(Params params);

	//查询所有等待审核的采购计划单总数
	int selectGetCgsum();

	//查询不在采购计划的产品档案信息 ----修改采购计划
	List<D_file> selectXgCgcpda(String cgPlanId);

	//查询不在采购计划的产品档案信息总数 ----修改采购计划
	int selectXgCgcpdasum(String cgPlanId);

	//追加采购明细表产品
	void addcgjxmx(String cgPlanId,@Param("product_id")String string,@Param("product_name")String string2,@Param("amount_unit")String string3,@Param("cost_price")double d,String execute_tag);

	//点击删除采购计划详情产品
	int delcgjxmx(String cgPlanId, String product_id);

	//修改采购计划
	int updcgjh(String cgPlanId, String check_tag,String remark);
	
	//修改采购计划明细
	void updcgjhmx(String cgPlanId,@Param("product_id")String string,@Param("amount")Double double1);

	
    
	
	
	
	
	
	
	
	
}
