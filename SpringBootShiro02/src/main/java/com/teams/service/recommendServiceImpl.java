package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.mapper.recommendMapper;
import com.teams.pojo.provider;
import com.teams.pojo.recommend;
import com.teams.pojo.recommendXq;
import com.teams.utils.Params;

@Service
public class recommendServiceImpl implements recommendService{
    @Autowired
	recommendMapper mapper;

	@Override
	public PageInfo<recommend> selectrec(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectrec(params));
	}

	@Override
	public List<provider> selectgys(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.selectgys(recommendId);
	}

	@Override
	public int addgys(String recommendId, String product_id, String product_name, String recommender) {
		// TODO Auto-generated method stub
		return mapper.addgys(recommendId, product_id, product_name, recommender);
	}

	@Override
	public int addgysmx(String recommendId, String providerId, String providerName) {
		// TODO Auto-generated method stub
		return mapper.addgysmx(recommendId, providerId, providerName);
	}

	@Override
	public int updtj(String product_id) {
		// TODO Auto-generated method stub
		return mapper.updtj(product_id);
	}

	@Override
	public PageInfo<recommend> selectfname(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectfname(params));
	}

	@Override
	public List<recommendXq> selectmxb(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.selectmxb(recommendId);
	}

	@Override
	public int updsh(String check_yj,String recommendId) {
		// TODO Auto-generated method stub
		return mapper.updsh(check_yj,recommendId);
	}

	@Override
	public int updshs(String check_yj,String recommendId) {
		// TODO Auto-generated method stub
		return mapper.updshs(check_yj,recommendId);
	}

	@Override
	public PageInfo<recommend> selectreco(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectreco(params));
	}

	@Override
	public List<recommendXq> selectgymx(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.selectgymx(recommendId);
	}

	@Override
	public PageInfo<recommend> selectwbg(Params params) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectwbg(params));
	}

	@Override
	public int delbgs(String id) {
		// TODO Auto-generated method stub
		return mapper.delbgs(id);
	}

	@Override
	public int updbgs(String change_yj,String recommendId) {
		// TODO Auto-generated method stub
		return mapper.updbgs(change_yj,recommendId);
	}


}
