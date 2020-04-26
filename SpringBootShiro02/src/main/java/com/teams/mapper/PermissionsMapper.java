package com.teams.mapper;

import java.util.List;

import com.teams.pojo.permission;

public interface PermissionsMapper {

	public List<permission> selectPermission(String username);

}
