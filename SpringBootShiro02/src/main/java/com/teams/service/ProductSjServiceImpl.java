package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.pojo.D_file;
import com.teams.pojo.Feilei;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;
import com.teams.mapper.ProductSjMapper;
@Transactional
@Service
public class ProductSjServiceImpl implements ProductSjService{
	@Autowired
	ProductSjMapper mapper;

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
}
