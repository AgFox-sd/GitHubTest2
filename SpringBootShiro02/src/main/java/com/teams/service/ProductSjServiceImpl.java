package com.teams.service;

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
}
