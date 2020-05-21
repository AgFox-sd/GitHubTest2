package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.ProviderMapper;
import com.teams.pojo.provider;

@Service
@Transactional
public class ProviderServiceimpl implements ProviderService{

	@Autowired
	ProviderMapper mapper;
	
	@Override
	public List<provider> AllGYS() {
		// TODO Auto-generated method stub
		return mapper.AllGYS();
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
	public List<provider> AllGYSFu(String string) {
		// TODO Auto-generated method stub
		return mapper.AllGYSFu(string);
	}

	

	@Override
	public int delGYS(String providerId) {
		// TODO Auto-generated method stub
		return mapper.delGYS(providerId);
	}

	@Override
	public List<provider> selWBG(String string) {
		// TODO Auto-generated method stub
		return mapper.selWBG(string);
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
