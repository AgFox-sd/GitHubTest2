package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.LyMapper;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_djfh_xq;
import com.teams.pojo.M_nbsc;
import com.teams.pojo.m_pg;
import com.teams.pojo.M_sc;
import com.teams.pojo.m_procedure_module;

@Transactional
@Service
public class LyServiceImpl implements LyService {
	@Autowired
	LyMapper mapper;

	// 查询登记
	@Override
	public List<m_pg> scdj(String check_tag, String pg_zt) {
		// TODO Auto-generated method stub
		return mapper.scdj(check_tag, pg_zt);
	}

	// 根据产品编号查询工序
	@Override
	public List<M_design_procedure_details> scgx(String parent_id) {
		// TODO Auto-generated method stub
		return mapper.scgx(parent_id);
	}

	@Override
	public List<m_procedure_module> selectGxWl(String parent_id, String gongxu_name) {
		// TODO Auto-generated method stub
		return mapper.selectGxWl(parent_id, gongxu_name);
	}

	@Override
	public String selectGongxu_id(String product_id) {
		// TODO Auto-generated method stub
		return mapper.selectGongxu_id(product_id);
	}

	@Override
	public List<String> selectGongxu(String gongxu_id) {
		// TODO Auto-generated method stub
		return mapper.selectGongxu(gongxu_id);
	}

	@Override
	public int adddjfh(String scjh_id, String gongxu_id, String string) {
		// TODO Auto-generated method stub
		return mapper.adddjfh(scjh_id, gongxu_id, string);
	}

	@Override
	public int selectCount(String gongxu_id) {
		// TODO Auto-generated method stub
		return mapper.selectCount(gongxu_id);
	}

///////////
	@Override
	public void updm_pg(String check_tag, String pg_id) {
		// TODO Auto-generated method stub
		mapper.updm_pg(check_tag, pg_id);
	}

	@Override
	public void updsjsysl(double subtotal_sj,String dj_jj,String procedure_name,String did) {
		// TODO Auto-generated method stub
		mapper.updsjsysl(subtotal_sj,dj_jj,procedure_name,did);
	}

	@Override
	public void add_xq(String did, String procedure_name, String product_id, String product_name, int amount,
			double cost_price, double subtotal_cbsj,String xq_sh) {
		// TODO Auto-generated method stub
		mapper.add_xq(did, procedure_name, product_id, product_name, amount, cost_price, subtotal_cbsj,xq_sh);
	}

	@Override
	public List<m_pg> scdjwfh(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.scdjwfh(check_tag);
	}

	@Override
	public List<M_design_procedure_details> scgxfh(String product_id) {
		// TODO Auto-generated method stub
		return mapper.scgxfh(product_id);
	}

	@Override
	public List<M_djfh_xq> selectfhwl(String procedure_name,String did) {
		// TODO Auto-generated method stub
		return mapper.selectfhwl(procedure_name, did);
	}

	@Override
	public void djxq(String xq_sh, String procedure_name) {
		// TODO Auto-generated method stub
		mapper.djxq(xq_sh, procedure_name);
	}

	@Override
	public void djfh(String dj_jj, String dj_sh, String procedure_name,String did) {
		// TODO Auto-generated method stub
		mapper.djfh(dj_jj, dj_sh, procedure_name,did);
	}

	@Override
	public void addsc(String design_id, String procedure_name, String did, int dj_tcsl, String dj_fh) {
		// TODO Auto-generated method stub
		mapper.addsc(design_id, procedure_name, did, dj_tcsl, dj_fh);
	}


	@Override
	public void upsjjfh(String dj_sh, String procedure_name,String did) {
		// TODO Auto-generated method stub
		mapper.upsjjfh(dj_sh, procedure_name,did);
	}

	@Override
	public void upd_sc(String dj_fh, String procedure_name,String did) {
		// TODO Auto-generated method stub
		mapper.upd_sc(dj_fh, procedure_name,did);
	}

	@Override
	public void upsnb(String dj_sh, String procedure_name,String did) {
		// TODO Auto-generated method stub
		mapper.upsnb(dj_sh, procedure_name,did);
	}

	@Override
	public List<M_sc> cxgxsl(String procedure_name,String did) {
		// TODO Auto-generated method stub
		return mapper.cxgxsl(procedure_name,did);
	}

	@Override
	public void addnbsc(String did, String pg_id, String product_id, String product_name, int sc_unit, double zcb,
			double d) {
		// TODO Auto-generated method stub
		mapper.addnbsc(did, pg_id, product_id, product_name, sc_unit,zcb,d);
	}

	@Override
	public double gszcb(String design_id) {
		// TODO Auto-generated method stub
		return mapper.gszcb(design_id);
	}

	@Override
	public double wlzcb(String design_id) {
		// TODO Auto-generated method stub
		return mapper.wlzcb(design_id);
	}

	@Override
	public void xgscct(String pg_id) {
		// TODO Auto-generated method stub
		mapper.xgxcct(pg_id);
	}

	@Override
	public List<m_pg> cxpgsc() {
		// TODO Auto-generated method stub
		return mapper.cxpgsc();
	}

	@Override
	public void xgzcb(double zcb, String product_id) {
		mapper.xgzcb(zcb, product_id);
	}

	@Override
	public void addsg(String gather_id, String storer, String reason, int sc_unit, double d, String string,
			String string2,String cgDiaoduId) {
		mapper.addsg(gather_id, storer, reason, sc_unit, d, string, string2,cgDiaoduId);
	}

	@Override
	public void addsgxq(String gather_id, String product_id, String product_name, int sc_unit, double zcb, double d,
			String string) {
		// TODO Auto-generated method stub
		mapper.addsgxq(gather_id, product_id, product_name, sc_unit, zcb, d, string);
	}

	@Override
	public void addpayxq(String pay_id, String product_id, String product_name, int i, double d, double e,
			String string) {
		mapper.addpayxq(pay_id, product_id, product_name, i, d, e, string);
	}

	@Override
	public void addpay(String pay_id, String storer, String reason, double zjs, double zcb, String string,
			String string2,String pg_id) {
		// TODO Auto-generated method stub
		mapper.addpay(pay_id, storer, reason, zjs, zcb, string, string2,pg_id);
	}

	@Override
	public List<M_nbsc> scxqsl(String pg_id) {
		// TODO Auto-generated method stub
		return mapper.scxqsl(pg_id);
	}

}
