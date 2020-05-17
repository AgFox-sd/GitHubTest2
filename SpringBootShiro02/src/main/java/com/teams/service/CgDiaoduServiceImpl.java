package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.CgDiaoduMapper;
import com.teams.pojo.cgDiaodu;
import com.teams.pojo.cgDiaoduXq;
import com.teams.pojo.cgPlanXq;
import com.teams.pojo.provider;

@Service
@Transactional
public class CgDiaoduServiceImpl implements CgDiaoduService {
	
	@Autowired
	CgDiaoduMapper mapper;
	
	//查询采购计划明细
	@Override
	public List<cgPlanXq> selectcgPlanXq() {
		return mapper.selectcgPlanXq();
	}

	//查询产品推荐的供应商信息
	@Override
	public List<provider> selectCgGys(String product_id) {
		return mapper.selectCgGys(product_id);
	}

	@Override
	public void addCgZx(String cgDiaoduId, String cgPlanId, String product_id, String product_name, int zsl, double zje,
			String register) {
		mapper.addCgZx(cgDiaoduId, cgPlanId, product_id, product_name, zsl, zje, register);
	}

	@Override
	public void addCgZxXq(String cgDiaoduId, String string, String string2, String string3, String string4, int i,
			double d, double e) {
		mapper.addCgZxXq(cgDiaoduId, string, string2, string3, string4, i, d, e);
	}

	@Override
	public int updCgJhXq(String cgPlanId, String product_id) {
		return mapper.updCgJhXq(cgPlanId, product_id);
	}

	//查询数量
	@Override
	public int selectAllCgCount1() {
		return mapper.selectAllCgCount1();
	}

	@Override
	public int selectAllCgCount2() {
		return mapper.selectAllCgCount2();
	}
	
	public int selectAllCgCount3() {
		return mapper.selectAllCgCount3();
	}

	@Override
	public int selectAllCgCount4() {
		return mapper.selectAllCgCount4();
	}

	public int selectAllCgCount5() {
		return mapper.selectAllCgCount5();
	}

	@Override
	public int selectAllCgCount6() {
		return mapper.selectAllCgCount6();
	}
	
	public int selectAllCgCount7() {
		return mapper.selectAllCgCount7();
	}

	@Override
	public int selectAllCgCount8() {
		return mapper.selectAllCgCount8();
	}

	//查询所有采购调度单
	@Override
	public List<cgDiaodu> selectcgDiaodu() {
		return mapper.selectcgDiaodu();
	}

	@Override
	public List<cgDiaoduXq> selectcgDiaoduXq(String cgDiaoduId) {
		return mapper.selectcgDiaoduXq(cgDiaoduId);
	}

	//查询等待审核的采购调度单
	@Override
	public List<cgDiaodu> selectcgDiaoduDdsh() {
		return mapper.selectcgDiaoduDdsh();
	}

	//修改采购调度单为未审核 修改 采购计划单为未执行
	@Override
	public void updCgJhXq1(String cgPlanId, String product_id) {
		mapper.updCgJhXq1(cgPlanId, product_id);
	}

	@Override
	public int updateDiaodu(String  checker,String cgDiaoduId) {
		return mapper.updateDiaodu(checker,cgDiaoduId);
	}

	//修改采购调度单为审核通过
	@Override
	public int updDiaoduSh(String checker, String cgDiaoduId) {
		return mapper.updDiaoduSh(checker, cgDiaoduId);
	}
	
}
