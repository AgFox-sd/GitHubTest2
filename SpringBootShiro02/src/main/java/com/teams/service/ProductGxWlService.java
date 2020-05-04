package com.teams.service;

import java.util.List;

import com.teams.pojo.D_module_details;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_procedure_module;

public interface ProductGxWlService {

	//查询已设计完工序的产品信息
	List<M_design_procedure> productGxWl();

	//查询设计完产品工序的工序信息
	List<M_design_procedure_details> productGxMx(String product_id);

	//根据产品编号查询设计完产品工序所需的物料信息
	List<D_module_details> productGxWlSj(String proudct_id);

	//修改产品工序的设计字段
	void updCpGx(double module_subtotal,String design_id, String gongxu_name);

	//添加物料工序表
	void addGxWl(String design_id,String procedure_name,
			String product_id,String product_name,int amount,String amount_unit,double cost_price,double subtotal);

	//修改物料明细表的数量
	void updWlMx(int i, String string, String product_id);

	//查询工序物料
	List<m_procedure_module> selectGxWl(String design_id, String gongxu_name);

	//修改物料成本
	void updWlZcb(double module_subtotal, String design_id);

	//修改产品工序表为已设计	
	int updGxWlSj(String design_id,String design_module_tag);

	//修改产品表为已设计
	void productGxSj(String design_module_tag,String real_cost_price,String design_id);

	//查询已设计完物料工序的产品
	List<M_design_procedure> productGxWlSh(String design_module_tag);

	//修改产品工序表为已审核
	int updateGxWlSh(String design_id);

	void updWlZcb2(String design_id);

	void updCpGx2(String design_id);

	int updWlMx2(int amount, String product_id, String product_id2);

	//删除工序物料表
	void delete(String design_id);

	//根据设计编号查询所有工序
	List<m_procedure_module> cxsygx(String design_id);

	//查询已设计或已审核的产品
	List<M_design_procedure> productGxWlCx();

}
