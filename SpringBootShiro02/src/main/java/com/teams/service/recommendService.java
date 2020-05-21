package com.teams.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teams.pojo.provider;
import com.teams.pojo.recommend;
import com.teams.pojo.recommendXq;

public interface recommendService {
	List<recommend> selectrec();
	List<provider> selectgys(String recommendId);
	int addgys(@Param("recommendId")String recommendId,@Param("product_id")String product_id,@Param("product_name")String product_name,@Param("recommender")String recommender);
	int addgysmx(@Param("recommendId")String recommendId,@Param("providerId")String providerId,@Param("providerName")String providerName);
	int updtj(@Param("product_id")String product_id);
	List<recommend> selectfname();
	List<recommendXq> selectmxb(@Param("recommendId") String recommendId);
	int updsh(@Param("recommendId") String recommendId);
	int updshs(@Param("recommendId")String recommendId);
	List<recommend> selectreco();
	List<recommendXq> selectgymx(String recommendId);
	List<recommend> selectwbg();
	int delbgs(@Param("id") String id);
	int updbgs(@Param("recommendId") String recommendId);

}