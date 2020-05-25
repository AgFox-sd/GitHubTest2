package com.teams.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teams.pojo.provider;
import com.teams.pojo.recommend;
import com.teams.pojo.recommendXq;
import com.teams.utils.Params;

public interface recommendMapper {
List<recommend> selectrec(Params params);
List<provider> selectgys(String recommendId);
int addgys(@Param("recommendId")String recommendId,@Param("product_id")String product_id,@Param("product_name")String product_name,@Param("recommender")String recommender);
int addgysmx(@Param("recommendId")String recommendId,@Param("providerId")String providerId,@Param("providerName")String providerName);
int updtj(@Param("product_id")String product_id);
List<recommend> selectfname(Params params);
List<recommendXq> selectmxb(@Param("recommendId") String recommendId);
int updsh(String check_yj,@Param("recommendId") String recommendId);
int updshs(String check_yj,@Param("recommendId")String recommendId);
List<recommend> selectreco(Params params);
List<recommendXq> selectgymx(@Param("recommendId")String recommendId);
List<recommend> selectwbg(Params params);
int delbgs(@Param("id") String id);
int updbgs(String change_yj,@Param("recommendId") String recommendId);
}
