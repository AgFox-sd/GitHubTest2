package com.teams.mapper;

import java.util.List;

import com.teams.pojo.D_module_details;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_procedure_module;
import com.teams.utils.Params;

public interface ProductGxWlMapper {

	//查询已设计完工序的产品信息
	public List<M_design_procedure> productGxWl(Params param);

	//查询设计完产品工序的工序信息
	public List<M_design_procedure_details> productGxMx(String product_id);
	
	//根据产品编号查询设计完产品工序所需的物料信息
	public List<D_module_details> productGxWlSj(String proudct_id);
	
	//修改产品工序的设计字段
	void updCpGx(double module_subtotal,String design_id, String gongxu_name);

	//添加物料工序表
	void addGxWl(String design_id,String procedure_name,
			String product_id,String product_name,int amount,String amount_unit,double cost_price,double subtotal);

	//修改物料明细表的数量
	void updWlMx(int i, String string, String product_id);

	//查询工序物料表
    List<m_procedure_module> selectGxWl(String design_id, String gongxu_name);

	//修改物料总成本
    void updWlZcb(double module_subtotal, String design_id);

	//修改产品工序表为已设计
	public int updGxWlSj(String check_yj,String design_module_tag,String design_id);

	//修改产品表为已设计
	public void productGxSj(String design_module_tag,String real_cost_price,String design_id);

	//查询已设计完物料工序的产品
	public List<M_design_procedure> productGxWlSh(Params params);

	//修改产品工序为已审核
	public int updateGxWlSh(String design_id);

	public void updWlZcb2(String design_id);

	public void updCpGx2(String design_id);

	public int updWlMx2(int amount, String product_id, String product_ids);
	
	//删除工序物料表
    void delete(String design_id);

    //根据设计编号查询所有工序
	public List<m_procedure_module> cxsygx(String design_id);

	//查询已设计或已审核的产品
	public List<M_design_procedure> productGxWlCx(Params params);

	void updmpm(int slsl, double d,String product_id, String design_id);

	void updmdp(double djdj, String design_id);

	void updmdpd(double d, String design_id, String gongxu_name);

	int upddmd(int ky, String product_id, String design_id);

	public List<M_design_procedure> productGxWlSh2(Params params);

	public void deletewlzc(String design_id, String gongxu_name, String string);

	public void updzbzje(double zje, String design_id);

	public void updatewlzc(int i, String product_id, String string);

	public int updzje(String design_id, String gongxu_name);

	public double selectwlzcb(String design_id);

	public int updwlbgyj(String wlbg_yj, String design_id);

	public int selectcf(String design_id);
}
