package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teams.mapper.StockPzMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.s_cell;
import com.teams.utils.Params;

@Transactional
@Service
public class StockPzServiceImpl implements StockPzService{
	
	@Autowired
	StockPzMapper mapper;

	//查询库存配置未设计的产品和物料
	@Override
	public PageInfo<D_file> selectWsj(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectWsj(params));
	}

	//增加库存信息
	@Override
	public int addkC(s_cell s_cell) {
		return mapper.addkC(s_cell);
	}

	//查询库存信息
	@Override
	public s_cell selectKc(String product_id) {
		return mapper.selectKc(product_id);
	}

	//查看仓库编号是否存在
	@Override
	public int selectCount(String product_id) {
		return mapper.selectCount(product_id);
	}

	//修改产品的库存设计为已设计
	@Override
	public int updDfile(String product_id) {
		return mapper.updDfile(product_id);
	}

	//修改库存配置信息
	@Override
	public int updKc(s_cell s_cell) {
		return mapper.updKc(s_cell);
	}

	//查询所有未审核的库存配置信息
	@Override
	public PageInfo<s_cell> selectAll(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectAll(params));
	}

	@Override
	public PageInfo<s_cell> selectAll1(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectAll1(params));
	}
	//审核库存配置信息
	@Override
	public int updfh(s_cell s_cell) {
		return mapper.updfh(s_cell);
	}

	@Override
	public int updfh1(s_cell s_cell) {
		return mapper.updfh1(s_cell);
	}
	
	//查询所有库存配置信息
	@Override
	public PageInfo<s_cell> selectSy(Params params) {
		return PageHelper.startPage(params.getPageNum(),params.getPageSize())
				.doSelectPageInfo(()->mapper.selectSy(params));
	}

	//查询库存配置未设计的产品和物料数量
	@Override
	public int selectZs() {
		return mapper.selectZs();
	}

	//查询所有未审核或审核通过的配置单数量
	@Override
	public int selectAllCount(String check_tag) {
		return mapper.selectAllCount(check_tag);
	}

	@Override
	public List<s_cell> selectSycount1() {
		return mapper.selectSycount1();
	}

	@Override
	public List<s_cell> selectSycount2() {
		return mapper.selectSycount2();
	}

	@Override
	public List<s_cell> selectSycount3() {
		return mapper.selectSycount3();
	}

	//查询可变更的配置单总数
	@Override
	public int selectAllKbg(String check_tag) {
		return mapper.selectAllKbg(check_tag);
	}
}
