package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.mapper.ProductGxMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_gonxu;
import com.teams.utils.Params;

@Service
public class ProductGxServicImpl implements ProductGxService{
@Autowired
	ProductGxMapper mapper;
	@Override
	public PageInfo<D_file> selecIds(Params param) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(param.getPageNum(),param.getPageSize())
				.doSelectPageInfo(()->mapper.selecIds(param));
	}
	@Override
	public List<M_gonxu> selectbz(String parent_id) {
		// TODO Auto-generated method stub
		return mapper.selectbz(parent_id);
	}
	@Override
	public int addgx(String design_id, String product_id, String product_name, Double cost_price_sum, String designer,
			String register) {
		// TODO Auto-generated method stub
		return mapper.addgx(design_id, product_id, product_name, cost_price_sum, designer, register);
	}
	@Override
	public int addgxmx(String parent_id, String procedure_id, Double labour_hour_amount, String amount_unit,
			Double cost_price, Double subtotal, String register) {
		// TODO Auto-generated method stub
		return mapper.addgxmx(parent_id, procedure_id, labour_hour_amount, amount_unit, cost_price, subtotal, register);
	}
	@Override
	public PageInfo<M_design_procedure> selectcpgx(Params param) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(param.getPageNum(),param.getPageSize())
				.doSelectPageInfo(()->mapper.selectcpgx(param));
	}
	@Override
	public int updsj(String design_procedure_tag,String product_id) {
		// TODO Auto-generated method stub
		return mapper.updsj(design_procedure_tag,product_id);
	}
	@Override
	public List<M_design_procedure_details> selectcpmxb(String parent_id) {
		// TODO Auto-generated method stub
		return mapper.selectcpmxb(parent_id);
	}
	@Override
	public int updsjd(String check_tag,String checker, String design_id) {
		// TODO Auto-generated method stub
		return mapper.updsjd(check_tag,checker, design_id);
	}
	@Override
	public int delgxsj(String check_yj,String design_id) {
		// TODO Auto-generated method stub
		return mapper.delgxsj(check_yj,design_id);
	}
	@Override
	public int delgxsjs(String parent_id) {
		// TODO Auto-generated method stub
		return mapper.delgxsjs(parent_id);
	}
	@Override
	public PageInfo<M_design_procedure> selectcpgxs(Params param) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(param.getPageNum(),param.getPageSize())
				.doSelectPageInfo(()->mapper.selectcpgxs(param));
	}
	@Override
	public int updbg(String design_id,String change_yj) {
		// TODO Auto-generated method stub
		return mapper.updbg(design_id,change_yj);
	}
	@Override
	public int delgxbg(String parent_id) {
		// TODO Auto-generated method stub
		return mapper.delgxbg(parent_id);
	}
	@Override
	public int updGx(String design_procedure_tag,String design_id) {
	  return  mapper.updGx(design_procedure_tag,design_id);
	}
	@Override
	public PageInfo<M_design_procedure> selectcpgxss(Params param) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(param.getPageNum(),param.getPageSize())
				.doSelectPageInfo(()->mapper.selectcpgxss(param));
	}
	@Override
	public void delgxsjd(int id, String parent_id) {
		mapper.delgxsjd(id, parent_id);
	}
	@Override
	public void updgxsjd(double xj, String parent_id) {
		// TODO Auto-generated method stub
		mapper.updgxsjd(xj, parent_id);
	}
	@Override
	public int selectcount(String sjdh) {
		// TODO Auto-generated method stub
		return mapper.selectcount(sjdh);
	}
	@Override
	public void updzje(double zje, String sjdh) {
		// TODO Auto-generated method stub
		mapper.updzje(zje, sjdh);
	}


}
