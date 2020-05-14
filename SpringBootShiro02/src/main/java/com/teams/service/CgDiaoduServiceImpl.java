package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.CgDiaoduMapper;
import com.teams.pojo.cgPlanXq;

@Service
@Transactional
public class CgDiaoduServiceImpl implements CgDiaoduService {
	
	@Autowired
	CgDiaoduMapper mapper;

	@Override
	public List<cgPlanXq> selectcgPlanXq() {
		return mapper.selectcgPlanXq();
	}
	
}
