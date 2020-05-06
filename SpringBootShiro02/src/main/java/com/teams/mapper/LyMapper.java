package com.teams.mapper;

import java.util.List;

import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_djfh_xq;
import com.teams.pojo.m_pg;
import com.teams.pojo.M_sc;
import com.teams.pojo.m_procedure_module;

public interface LyMapper {
	// 查询登记
	List<m_pg> scdj(String check_tag, String pg_zt);

	// 根据产品编号查询工序
	List<M_design_procedure_details> scgx(String product_id);

	List<m_procedure_module> selectGxWl(String parent_id, String gongxu_name);

	String selectGongxu_id(String product_id);

	List<String> selectGongxu(String gongxu_id);

	int adddjfh(String scjh_id, String gongxu_id, String string);

	int selectCount(String gongxu_id);

	// 修改派工标为未审核
	void updm_pg(String check_tag, String pg_id);

	// 修改实际使用数量
	void updsjsysl(double subtotal_sj,String dj_jj, String procedure_name,String did);

	// 增加
	void add_xq(String did, String procedure_name, String product_id, String product_name, int amount,
			double cost_price, double subtotal_cbsj,String xq_sh);
	
	// 查询登记
	List<m_pg> scdjwfh(String check_tag);
	
	// 根据产品编号查询工序
	List<M_design_procedure_details> scgxfh(String product_id);
	
	List<M_djfh_xq> selectfhwl(String procedure_name,String did);
	
	//登记审核
	void djxq(String xq_sh,String procedure_name);
	
	void djfh(String dj_jj,String dj_sh,String procedure_name,String did);
	
	//交接审核
	void addsc(String design_id,String procedure_name,String did,int dj_tcsl,String dj_fh);
	
	void addnbsc(String did,String pg_id,String product_id,String product_name,int sc_unit, double zcb, double d);
	
	void upsjjfh(String dj_sh,String procedure_name,String did);
	
	//交接已审核
	void upd_sc(String dj_fh,String procedure_name,String did);
	
	void upsnb(String dj_sh,String procedure_name,String did);
	
	//查询工序数量
	List<M_sc> cxgxsl(String procedure_name,String did);

	double gszcb(String design_id);

	void xgxcct(String pg_id);

	double wlzcb(String design_id);
	
	//查询派工生产
	List<m_pg> cxpgsc();

	void xgzcb(double zcb, String product_id);

	void addsg(String gather_id, String storer, String reason, int sc_unit, double d, String string, String string2);

	void addsgxq(String gather_id, String product_id, String product_name, int sc_unit, double zcb, double d,
			String string);

	void addpayxq(String pay_id, String product_id, String product_name, int i, double d, double e, String string);

	void addpay(String pay_id, String storer, String reason, double zjs, double zcb, String string, String string2);
}
