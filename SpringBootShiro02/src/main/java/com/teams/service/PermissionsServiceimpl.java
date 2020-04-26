package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.PermissionsMapper;
import com.teams.pojo.permission;

@Transactional
@Service
public class PermissionsServiceimpl implements PermissionsService {

	@Autowired
	PermissionsMapper mapper;

	@Override
	public List<permission> selectPermission(String username) {
		return mapper.selectPermission(username);
	}
}
