package com.teams.service;

import java.util.List;


import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_module_details;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_procedure_module;
import com.teams.utils.Params;

public interface ProductGxWlService {

	//查询已设计完工序的产品信息
	PageInfo<M_design_procedure> productGxWl(Params param);

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
	int updGxWlSj(String check_yj,String design_id,String design_module_tag);

	//修改产品表为已设计
	void productGxSj(String design_module_tag,String real_cost_price,String design_id);

	//查询已设计完物料工序的产品
	PageInfo<M_design_procedure> productGxWlSh(Params params);

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
	PageInfo<M_design_procedure> productGxWlCx(Params param);

	void updmpm(int slsl,double d, String product_id, String design_id);

	void updmdp(double djdj, String design_id);

	void updmdpd(double d, String design_id, String gongxu_name);

	int upddmd(int ky, String product_id, String design_id);

	PageInfo<M_design_procedure> productGxWlSh2(Params param);

	void deletewlzc(String design_id, String gongxu_name, String string);

	void updzbzje(double zje, String design_id);

	void updatewlzc(int i, String product_id, String string);

	int updzje(String design_id, String gongxu_name);

	double selectwlzcb(String design_id);

	int updwlbgyj(String wlbg_yj, String design_id);

	int selectcf(String design_id);

}
