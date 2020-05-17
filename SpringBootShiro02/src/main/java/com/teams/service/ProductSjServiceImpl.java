package com.teams.service;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.pojo.D_file;
import com.teams.pojo.D_module;
import com.teams.pojo.D_module_details;
import com.teams.pojo.Feilei;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;
import com.teams.mapper.ProductSjMapper;

@Transactional
@Service
public class ProductSjServiceImpl implements ProductSjService{
	@Autowired
	ProductSjMapper mapper;

	//查询审核通过的产品信息
	@Override
	public List<D_file> selectProduct(String check_tag) {
		return mapper.selectProduct(check_tag);
	}

	//删除和恢复审核通过的产品信息
	@Override
	public int updDelete_tag(String product_id, String delete_tag) {
		return mapper.updDelete_tag(product_id, delete_tag);
	}

	//永久删除审核通过的产品信息
	@Override
	public int yjDeleteProduct(String product_id) {
		return mapper.yjDeleteProduct(product_id);
	}
	@Override
	public List<D_file> selectcpdash(@Param("check_tag")String check_tag) {
		
		return mapper.selectcpdash(check_tag);
	}

	@Override
	public int updfh(D_file d_file) {
		// TODO Auto-generated method stub
		return mapper.updfh(d_file);
	}

	@Override
	public int selectddfh(@Param("check_tag")String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectddfh(check_tag);
	}

	@Override
	public int selecttgfh(@Param("check_tag")String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selecttgfh(check_tag);
	}

	
	
	
	/*/
	 * 产品物料设计单查询
	 */
	@Override
	public List<D_module> selectwusjsh(@Param("check_tag")String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectwusjsh(check_tag);
	}

	@Override
	public int selectwuddshsum(@Param("check_tag")String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectwuddshsum(check_tag);
	}

	@Override
	public List<D_module_details> selectwlmx(@Param("design_id")String design_id) {
		// TODO Auto-generated method stub
		return mapper.selectwlmx(design_id);
	}

	@Override
	public int updatewlsh(D_module d_module) {
		// TODO Auto-generated method stub
		return mapper.updatewlsh(d_module);
	}

	@Override
	public void delwlsjmx(@Param("design_id")String design_id) {
		// TODO Auto-generated method stub
		mapper.delwlsjmx(design_id);
	}

	@Override
	public void updcpdnwlsj(@Param("product_id")String product_id,@Param("design_module_tag")String design_module_tag) {
		// TODO Auto-generated method stub
		mapper.updcpdnwlsj(product_id,design_module_tag);
	}

	@Override
	public int delwlsj(@Param("design_id")String design_id) {
		// TODO Auto-generated method stub
		return mapper.delwlsj(design_id);
	}

	@Override
	public List<D_file> selectId2(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectId2(check_tag);
	}

	@Override
	public D_file Selidxx(String product_id) {
		// TODO Auto-generated method stub
		return mapper.Selidxx(product_id);
	}

	@Override
	public int updBG(D_file file) {
		// TODO Auto-generated method stub
		return mapper.updBG(file);
	}

	@Override
	public List<D_file> Selad(String check_tag,String design_module_tag, int tid) {
		// TODO Auto-generated method stub
		return mapper.Selad(check_tag,design_module_tag,tid);
	}

	@Override
	public void productWlZc(String sjdh, String product_id, String product_name, String sjr, double d) {
		mapper.productWlZc(sjdh, product_id, product_name, sjr, d);
	}

	@Override
	public void wlZcMx(String sjdh, String string, String string2, String string3, int i, double d, double e) {
		mapper.wlZcMx(sjdh, string, string2, string3, i, d, e);
	}

	@Override
	public void updWlSj(String product_id, String design_module_tag) {
		mapper.updWlSj(product_id, design_module_tag);
	}

	@Override
	public int addda(D_file file) {
		// TODO Auto-generated method stub
		return mapper.addda(file);
	}

	@Override
	public List<Type> selecttype() {
		// TODO Auto-generated method stub
		return mapper.selecttype();
	}

	@Override
	public List<Feilei> selectfeilei() {
		// TODO Auto-generated method stub
		return mapper.selectfeilei();
	}

	@Override
	public List<Pclass> selectpclass() {
		// TODO Auto-generated method stub
		return mapper.selectpclass();
	}
	
	@Override
	public List<D_file> selecId() {
		// TODO Auto-generated method stub
		return mapper.selecId();
	}

	@Override
	public List<D_module> selD_module() {
		// TODO Auto-generated method stub
		return mapper.selD_module();
	}

	@Override
	public List<D_module_details> selD_MODULE_DETAILS(String design_id) {
		// TODO Auto-generated method stub
		return mapper.selD_MODULE_DETAILS(design_id);
	}

	@Override
	public int selectname(D_file file) {
		// TODO Auto-generated method stub
		return mapper.selectname(file);
	}

	@Override
	public int delid(int id) {
		// TODO Auto-generated method stub
		return mapper.delid(id);
	}

	@Override
	public List<D_file> selwl() {
		// TODO Auto-generated method stub
		return mapper.selwl();
	}

	@Override
	public int updzje(double d, String spid,String spmc) {
		// TODO Auto-generated method stub
		return mapper.updzje(d, spid,spmc);
	}

	@Override
	public int upzjq(double jq, String product_id, String product_name) {
		// TODO Auto-generated method stub
		return mapper.upzjq(jq, product_id, product_name);
	}

	@Override
	public int upgwsh(String check_tag, String change_tag, String product_id, String product_name) {
		// TODO Auto-generated method stub
		return mapper.upgwsh(check_tag, change_tag, product_id, product_name);
	}

	@Override
	public void zjwl(String design_id, String product_id, String product_name, String amount_unit, int amount,
			double residual_amount, double cost_price,double subtotal) {
		// TODO Auto-generated method stub
		mapper.zjwl(design_id, product_id, product_name, amount_unit, amount, residual_amount, cost_price,subtotal);
	}

	@Override
	public List<D_module> selD_moduleS() {
		// TODO Auto-generated method stub
		return mapper.selD_moduleS();
	}

	
}
