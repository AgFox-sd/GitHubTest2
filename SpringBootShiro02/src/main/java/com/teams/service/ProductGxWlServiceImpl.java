package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.mapper.ProductGxWlMapper;
import com.teams.pojo.D_module_details;
import com.teams.pojo.M_design_procedure;
import com.teams.pojo.M_design_procedure_details;
import com.teams.pojo.m_procedure_module;
import com.teams.utils.Params;

@Transactional
@Service
public class ProductGxWlServiceImpl implements ProductGxWlService {

	@Autowired
	ProductGxWlMapper mapper;
	
	//查询已设计完工序的产品信息
	@Override
	public PageInfo<M_design_procedure> productGxWl(Params param) {
		return PageHelper.startPage(param.getPageNum(),param.getPageSize())
				.doSelectPageInfo(()->mapper.productGxWl(param));
	}
	
	//查询设计完产品工序的工序信息
	@Override
	public List<M_design_procedure_details> productGxMx(String product_id) {
		return mapper.productGxMx(product_id);
	}
	
	//根据产品编号查询设计完产品工序所需的物料信息
	@Override
	public List<D_module_details> productGxWlSj(String proudct_id) {
		return mapper.productGxWlSj(proudct_id);
	}
	
	//修改产品工序的设计字段
	@Override
	public void updCpGx(double module_subtotal,String design_id, String gongxu_name) {
		mapper.updCpGx(module_subtotal,design_id, gongxu_name);
	}

	//添加物料工序表
	@Override
	public void addGxWl(String design_id,String procedure_name,
			String product_id,String product_name,int amount,String amount_unit,double cost_price,double subtotal){
		mapper.addGxWl(design_id,procedure_name,
				 product_id, product_name, amount, amount_unit, cost_price, subtotal);
	}

	//修改物料明细表的数量
	@Override
	public void updWlMx(int i, String string, String product_id) {
		mapper.updWlMx(i, string, product_id);
	}

	@Override
	public List<m_procedure_module> selectGxWl(String design_id, String gongxu_name) {
		return mapper.selectGxWl(design_id, gongxu_name);
	}

	@Override
	public void updWlZcb(double module_subtotal, String design_id) {
		mapper.updWlZcb(module_subtotal, design_id);
	}

	//修改产品工序表为已设计
	@Override
	public int updGxWlSj(String check_yj,String design_id,String design_module_tag) {
		return mapper.updGxWlSj(check_yj,design_id,design_module_tag);
	}
	
	//修改产品表为已设计
	@Override
	public void productGxSj(String design_module_tag,String real_cost_price,String design_id) {
		mapper.productGxSj(design_module_tag,real_cost_price,design_id);
	}

	@Override
	public PageInfo<M_design_procedure> productGxWlSh(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.productGxWlSh(params));
	}

	@Override
	public PageInfo<M_design_procedure> productGxWlSh2(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.productGxWlSh2(params));
	}

	//修改产品工序表为已审核
	@Override
	public int updateGxWlSh(String design_id) {
		return mapper.updateGxWlSh(design_id);
	}

	@Override
	public void updWlZcb2(String design_id) {
		mapper.updWlZcb2(design_id);
	}

	@Override
	public void updCpGx2(String design_id) {
		mapper.updCpGx2(design_id);
	}

	@Override
	public int updWlMx2(int amount, String product_id, String product_id2) {
		return mapper.updWlMx2(amount, product_id, product_id2);
	}

	//删除工序物料表
	@Override
	public void delete(String design_id) {
		mapper.delete(design_id);
	}

	//根据设计编号查询所有工序
	@Override
	public List<m_procedure_module> cxsygx(String design_id) {
		return mapper.cxsygx(design_id);
	}

	
	//查询已设计或已审核的产品
	@Override
	public PageInfo<M_design_procedure> productGxWlCx(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.productGxWlCx(params));
	}

	@Override
	public void updmpm(int slsl, double d,String product_id, String design_id) {
		mapper.updmpm(slsl, d,product_id, design_id);
	}

	@Override
	public void updmdp(double djdj, String design_id) {
		mapper.updmdp(djdj, design_id);
	}

	@Override
	public void updmdpd(double d, String design_id, String gongxu_name) {
		mapper.updmdpd(d, design_id, gongxu_name);
	}

	@Override
	public int upddmd(int ky, String product_id, String design_id) {
		return mapper.upddmd(ky, product_id, design_id);
	}

	@Override
	public void deletewlzc(String design_id, String gongxu_name, String string) {
		mapper.deletewlzc(design_id, gongxu_name, string);
	}

	@Override
	public void updzbzje(double zje, String design_id) {
		mapper.updzbzje(zje, design_id);
	}

	@Override
	public void updatewlzc(int i, String product_id, String string) {
		mapper.updatewlzc(i, product_id, string);
	}

	@Override
	public int updzje(String design_id, String gongxu_name) {
		return mapper.updzje(design_id, gongxu_name);
	}

	@Override
	public double selectwlzcb(String design_id) {
		return mapper.selectwlzcb(design_id);
	}

	@Override
	public int updwlbgyj(String wlbg_yj, String design_id) {
		return mapper.updwlbgyj(wlbg_yj, design_id);
	}

	@Override
	public int selectcf(String design_id) {
		return mapper.selectcf(design_id);
	}
}
