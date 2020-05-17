package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teams.mapper.recommendMapper;
import com.teams.pojo.provider;
import com.teams.pojo.recommend;
import com.teams.pojo.recommendXq;

@Service
public class recommendServiceImpl implements recommendService{
    @Autowired
	recommendMapper mapper;

	@Override
	public List<recommend> selectrec() {
		// TODO Auto-generated method stub
		return mapper.selectrec();
	}

	@Override
	public List<provider> selectgys() {
		// TODO Auto-generated method stub
		return mapper.selectgys();
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
	public List<recommend> selectfname() {
		// TODO Auto-generated method stub
		return mapper.selectfname();
	}

	@Override
	public List<recommendXq> selectmxb(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.selectmxb(recommendId);
	}

	@Override
	public int updsh(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.updsh(recommendId);
	}

	@Override
	public int updshs(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.updshs(recommendId);
	}

	@Override
	public List<recommend> selectreco() {
		// TODO Auto-generated method stub
		return mapper.selectreco();
	}

	@Override
	public List<recommendXq> selectgymx(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.selectgymx(recommendId);
	}

	@Override
	public List<recommend> selectwbg() {
		// TODO Auto-generated method stub
		return mapper.selectwbg();
	}

	@Override
	public int delbgs(String id) {
		// TODO Auto-generated method stub
		return mapper.delbgs(id);
	}

	@Override
	public int updbgs(String recommendId) {
		// TODO Auto-generated method stub
		return mapper.updbgs(recommendId);
	}


}
