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

	//查询审核通过的产品信息
	@Override
	public List<D_file> selectProduct(String check_tag) {
		return mapper.selectProduct(check_tag);
	}

	//删除和恢复审核通过的产品信息
	@Override
	public int updDelete_tag(int product_id, String delete_tag) {
		return mapper.updDelete_tag(product_id, delete_tag);
	}

	//永久删除审核通过的产品信息
	@Override
	public int yjDeleteProduct(int product_id) {
		return mapper.yjDeleteProduct(product_id);
	}
}
