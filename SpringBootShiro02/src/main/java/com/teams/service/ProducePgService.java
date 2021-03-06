package com.teams.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_apply;
import com.teams.pojo.m_pg;
import com.teams.pojo.m_procedure_module;
import com.teams.utils.Params;

public interface ProducePgService {
	
	//查询已通过审核并未派工的生产计划
	PageInfo<m_apply> SelectApply(Params params);

	//通过产品编号查询工序
	List<M_design_procedure_details> SelGx(String product_id);

	//查询工序物料
	List<m_procedure_module> SelWL(String design_id, String name);
	//提交派工单
	int addPg(m_pg pg);
	//修改生产计划表派工状态
	int updAySh(String product_id,String scbh);
	//查询信息范围为所有未审核的派工单
	List<m_pg> SelectPg(String check_tag);
	//查询当前等待审核的生产派工单总数SelSum
	int SelSum(String check_tag);
	//生产派工单审核通过
	int updPgtg(String  check_tag,String pg_id, String check_reason);

	//审核未通过,删除派工单 并修改派工标志
	void updPgbz(String product_id, String apply_id, String manufacture_tag);
	int delPgd(String pg_id);
	
	//生产派工单查询
	PageInfo<m_pg> SelectPG2(Params params);
	//查询符合条件的生产派工单总数
	int SelSum2(String check_tag);

	PageInfo<m_pg> SelectPgs(Params params);

}
