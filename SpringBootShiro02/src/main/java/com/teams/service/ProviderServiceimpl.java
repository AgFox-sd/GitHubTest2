package com.teams.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.mapper.ProviderMapper;
import com.teams.pojo.provider;
import com.teams.utils.Params;

@Service
@Transactional
public class ProviderServiceimpl implements ProviderService{

	@Autowired
	ProviderMapper mapper;
	
	@Override
	public PageInfo<provider> AllGYS(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.AllGYS(params));
	}

	@Override
	public provider Selxx(String providerId) {
		// TODO Auto-generated method stub
		return mapper.Selxx(providerId);
	}



	@Override
	public int selectgysname(provider pro) {
		// TODO Auto-generated method stub
		return mapper.selectgysname(pro);
	}



	@Override
	public int addGYS(String providerId, String providerName, String providerAddress, String linkman, int fid,
			String providerPhone, String register) {
		// TODO Auto-generated method stub
		return mapper.addGYS(providerId, providerName, providerAddress, linkman, fid, providerPhone, register);
	}

	@Override
	public PageInfo<provider> AllGYSFu(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.AllGYSFu(params));
	}

	@Override
	public PageInfo<provider> AllGYSFu1(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.AllGYSFu1(params));
	}

	@Override
	public int delGYS(String providerId) {
		// TODO Auto-generated method stub
		return mapper.delGYS(providerId);
	}

	@Override
	public PageInfo<provider> selWBG(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selWBG(params));
	}

	@Override
	public int updGYSBG(provider pro) {
		// TODO Auto-generated method stub
		return mapper.updGYSBG(pro);
	}

	@Override
	public int updGYSFuS(String string2, String providerId, String checkerString, String check_tag,
			String check_reason) {
		// TODO Auto-generated method stub
		return mapper.updGYSFuS(string2, providerId, checkerString, check_tag, check_reason);
	}











}
