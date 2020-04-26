package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.pojo.D_file;
import com.teams.mapper.ProductSjMapper;
@Transactional
@Service
public class ProductSjServiceImpl implements ProductSjService{
	@Autowired
	ProductSjMapper mapper;

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

}
