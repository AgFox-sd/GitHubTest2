package com.teams.service;

import java.util.List;

import com.teams.pojo.provider;

public interface ProviderService {

	//查询所有供应商
	List<provider> AllGYS();
	//查询供应商详情
	provider Selxx(String providerId);
	//增加供应商
	int addGYS(String providerId, String providerName, String providerAddress, String linkman, int fid,
			String providerPhone,String register);
	//查询供应商名称是否重复
	int selectgysname(provider pro);
	//查询等待审核的供应商信息
	List<provider> AllGYSFu(String string);
	//供应商审核通过,审核通过后把变更标志改为未变更
	int updGYSFuS( String string2, String providerId, String checkerString,String check_tag, String check_reason);
	//供应商删除
	int delGYS(String providerId);
	//查询未变更的供应商
	List<provider> selWBG(String string);
	//提交变更(修改)
	int updGYSBG(provider pro);

}
