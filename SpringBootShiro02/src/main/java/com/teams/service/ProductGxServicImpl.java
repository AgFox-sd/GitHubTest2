package com.teams.service;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teams.mapper.ProductGxMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.M_gonxu;

@Service
public class ProductGxServicImpl implements ProductGxService{
@Autowired
	ProductGxMapper mapper;
	@Override
	public List<D_file> selecIds() {
		// TODO Auto-generated method stub
		return mapper.selecIds();
	}
	@Override
	public List<M_gonxu> selectbz() {
		// TODO Auto-generated method stub
		return mapper.selectbz();
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
	public List<M_design_procedure> selectcpgx(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectcpgx(check_tag);
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
	public int updsjd(String check_tag, String design_id) {
		// TODO Auto-generated method stub
		return mapper.updsjd(check_tag, design_id);
	}
	@Override
	public int delgxsj(String design_id) {
		// TODO Auto-generated method stub
		return mapper.delgxsj(design_id);
	}
	@Override
	public int delgxsjs(String parent_id) {
		// TODO Auto-generated method stub
		return mapper.delgxsjs(parent_id);
	}
	@Override
	public List<M_design_procedure> selectcpgxs() {
		// TODO Auto-generated method stub
		return mapper.selectcpgxs();
	}
	@Override
	public int updbg(double cost_price_sum, String design_id) {
		// TODO Auto-generated method stub
		return mapper.updbg(cost_price_sum, design_id);
	}
	@Override
	public int delgxbg(String parent_id) {
		// TODO Auto-generated method stub
		return mapper.delgxbg(parent_id);
	}


}
