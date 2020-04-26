package com.teams.service;

import java.util.List;

import com.teams.pojo.permission;

public interface PermissionsService {

	List<permission> selectPermission(String username);

}
