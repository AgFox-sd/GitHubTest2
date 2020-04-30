package com.teams.mapper;

import java.util.List;

import com.teams.pojo.D_file;
import com.teams.pojo.m_apply;
import com.teams.pojo.m_apply_mx;

public interface LidongMapper {

	//添加产品  --查询符合条件的产品
	List<D_file> selectcp(String design_procedure_tag);
	
	//添加产品  --查询选中的产品信息
	D_file selectcpxx(String product_id);

	//添加生产计划
	int addSc(String apply_id, String remark, Double subtotal, String register, String check_tag);

	//添加生产计划产品明细
	void addScmx(String apply_id, String product_id, String product_name, String product_describe, Integer amount, String personal_unit,
			Double real_cost_price,String manufacture_tag);
    
	//查询生产计划明细
	List<D_file> selectscmx(String apply_id);

	//查询所有等待审核的生产计划
	List<m_apply> selectShcx(String check_tag);

	//查询所有生产计划总数   --审核通过与不通过
	int selectShcxsum(String check_tag);

	//生产计划审核通过
	int updShjh(m_apply apply);

	//生产计划审核不通过
	int delShjh(String apply_id);

	//生产计划审核不通过 --删除生产计划明细
	void delShjhmx(String apply_id);

	//查询所有生产计划
	List<m_apply> selectShjh();



	
	
}
