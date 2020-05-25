package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.mapper.ProviderSqDjMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.provider;
import com.teams.pojo.providerSq;
import com.teams.pojo.providerSqXq;
import com.teams.utils.Params;


@Service
@Transactional
public class ProviderSqDjServiceImpl implements ProviderSqDjService{

	@Autowired
	ProviderSqDjMapper mapper;

	@Override
	public PageInfo<provider> selprovider(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selprovider(params));
	}

	@Override

	public List<D_file> selD_file(String providerId) {
		return mapper.selD_file(providerId);
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
	public List<providerSqXq> selproviderSqXq(String providerSqId) {
		// TODO Auto-generated method stub
		return mapper.selproviderSqXq(providerSqId);
	}

	@Override
	public int updproviderSqXq(double price,String product_id,String product_name) {
		// TODO Auto-generated method stub
		return mapper.updproviderSqXq(price,product_id,product_name);
	}

	@Override
	public List<providerSqXq> selXq(String product_id, String product_name) {
		// TODO Auto-generated method stub
		return mapper.selXq(product_id, product_name);
	}

	@Override
	public PageInfo<providerSq> selproviderSq(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selproviderSq(params));
	}

	@Override
	public List<providerSqXq> selcxxq(String providerSqId) {
		// TODO Auto-generated method stub
		return mapper.selcxxq(providerSqId);
	}

	@Override
	public int updshzt(String check_tag, String checker,String change_tag, String shbz,String providerSqId, String providerName) {
		// TODO Auto-generated method stub
		return mapper.updshzt(check_tag, checker, change_tag,shbz,providerSqId, providerName);
	}

	@Override
	public PageInfo<providerSq> seldjsy(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
		.doSelectPageInfo(()->mapper.seldjsy(params));
	}

	@Override
	public List<providerSqXq> selshxq(String providerSqId) {
		// TODO Auto-generated method stub
		return mapper.selshxq(providerSqId);
	}

	@Override
	public PageInfo<providerSq> selsywbg(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selsywbg(params));
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
	public int updybg(String changer, String change_tag, String check_tag,String bgbz, String providerSqId, String providerId) {
		// TODO Auto-generated method stub
		return mapper.updybg(changer, change_tag, check_tag, bgbz,providerSqId, providerId);
	}

	@Override
	public int selectCount(String providerId) {
		// TODO Auto-generated method stub
		return mapper.selectCount(providerId);
	}



	
}
