package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.ProviderSqDjMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.provider;
import com.teams.pojo.providerSq;
import com.teams.pojo.providerSqXq;


@Service
@Transactional
public class ProviderSqDjServiceImpl implements ProviderSqDjService{

	@Autowired
	ProviderSqDjMapper mapper;

	@Override
	public List<provider> selprovider() {
		// TODO Auto-generated method stub
		return mapper.selprovider();
	}

	@Override
	public List<D_file> selD_file() {
		// TODO Auto-generated method stub
		return mapper.selD_file();
	}

	@Override
	public int addproviderSq(String providerSqId, String providerId, String providerName, String providerPhone,String register) {
		// TODO Auto-generated method stub
		return mapper.addproviderSq(providerSqId, providerId, providerName, providerPhone,register);
	}

	@Override
	public int addproviderSqXq(String providerSqId, String providerSqXqId, String product_id, String product_name,
			String unit, double price,double subtotal) {
		// TODO Auto-generated method stub
		return mapper.addproviderSqXq(providerSqId, providerSqXqId, product_id, product_name,unit, price,subtotal);
	}

	@Override
	public List<providerSqXq> selproviderSqXq(String providerId) {
		// TODO Auto-generated method stub
		return mapper.selproviderSqXq(providerId);
	}

	@Override
	public int updproviderSqXq(int amount, double price, double subtotal,String product_id,String product_name) {
		// TODO Auto-generated method stub
		return mapper.updproviderSqXq(amount, price, subtotal,product_id,product_name);
	}

	@Override
	public List<providerSqXq> selXq(String product_id, String product_name) {
		// TODO Auto-generated method stub
		return mapper.selXq(product_id, product_name);
	}

	@Override
	public List<providerSq> selproviderSq() {
		// TODO Auto-generated method stub
		return mapper.selproviderSq();
	}

	@Override
	public List<providerSqXq> selcxxq(String providerSqId) {
		// TODO Auto-generated method stub
		return mapper.selcxxq(providerSqId);
	}

	@Override
	public int updshzt(String check_tag, String checker,String change_tag, String providerSqId, String providerName) {
		// TODO Auto-generated method stub
		return mapper.updshzt(check_tag, checker, change_tag,providerSqId, providerName);
	}

	@Override
	public List<providerSq> seldjsy() {
		// TODO Auto-generated method stub
		return mapper.seldjsy();
	}

	@Override
	public List<providerSqXq> selshxq(String providerSqId) {
		// TODO Auto-generated method stub
		return mapper.selshxq(providerSqId);
	}

	@Override
	public List<providerSq> selsywbg(String change_tag) {
		// TODO Auto-generated method stub
		return mapper.selsywbg(change_tag);
	}

	@Override
	public List<D_file> selspbg(String providerSqId) {
		// TODO Auto-generated method stub
		return mapper.selspbg(providerSqId);
	}

	@Override
	public int delid(int id, String product_id, String product_name) {
		// TODO Auto-generated method stub
		return mapper.delid(id, product_id, product_name);
	}

	@Override
	public int updybg(String changer, String change_tag, String check_tag, String providerSqId, String providerId) {
		// TODO Auto-generated method stub
		return mapper.updybg(changer, change_tag, check_tag, providerSqId, providerId);
	}



	
}
