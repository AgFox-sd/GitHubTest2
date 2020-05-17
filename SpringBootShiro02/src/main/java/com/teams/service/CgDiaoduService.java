package com.teams.service;

import java.util.List;

import com.teams.pojo.cgDiaodu;
import com.teams.pojo.cgDiaoduXq;
import com.teams.pojo.cgPlanXq;
import com.teams.pojo.provider;

public interface CgDiaoduService {

	//查询采购计划明细
	List<cgPlanXq> selectcgPlanXq();

	//查询产品推荐的供应商信息
	List<provider> selectCgGys(String product_id);

	//添加采购信息
	void addCgZx(String cgDiaoduId, String cgPlanId, String product_id, String product_name, int zsl, double zje,
			String register);

	void addCgZxXq(String cgDiaoduId, String string, String string2, String string3, String string4, int i, double d,
			double e);

	int updCgJhXq(String cgPlanId, String product_id);

	//查询数量
	int selectAllCgCount1();

	int selectAllCgCount2();
	
	int selectAllCgCount3();

	int selectAllCgCount4();

	int selectAllCgCount5();

	int selectAllCgCount6();
	
	int selectAllCgCount7();

	int selectAllCgCount8();

	//查询所有采购调度单
	List<cgDiaodu> selectcgDiaodu();

	//根据编号查询采购调度单详情
	List<cgDiaoduXq> selectcgDiaoduXq(String cgDiaoduId);

	//查询等待审核的采购调度单
	List<cgDiaodu> selectcgDiaoduDdsh();
	
	//修改采购调度单为未审核 修改 采购计划单为未执行
	void updCgJhXq1(String cgPlanId, String product_id);

	int updateDiaodu(String checker,String cgDiaoduId);

	//修改采购调度单为审核通过
	int updDiaoduSh(String checker, String cgDiaoduId);

}
