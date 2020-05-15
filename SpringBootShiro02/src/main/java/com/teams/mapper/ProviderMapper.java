package com.teams.mapper;

import java.util.List;

import com.teams.pojo.provider;

public interface ProviderMapper {

	//查询所有供应商
	List<provider> AllGYS();
	//查询供应商详情
	provider Selxx(String providerId);
	//增加供应商
	int addGYS(String providerId, String providerName, String providerAddress, String linkman, int fid,
			String providerPhone,String register);
	//查询供应商名称是否重复
	int selectgysname(provider pro);
	List<provider> AllGYSFu(String string);

}
