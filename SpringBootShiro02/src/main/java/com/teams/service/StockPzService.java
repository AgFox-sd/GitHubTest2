package com.teams.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.D_file;
import com.teams.pojo.s_cell;
import com.teams.utils.Params;

public interface StockPzService {

	//查询库存配置未设计的产品和物料
	PageInfo<D_file> selectWsj(Params params);

	//增加库存信息
	int addkC(s_cell s_cell);

	//查询库存信息
	s_cell selectKc(String product_id);

	//查看仓库编号是否存在
	int selectCount(String product_id);

	//修改产品的库存设计为已设计
	int updDfile(String product_id);

	//修改库存配置信息
	int updKc(s_cell s_cell);

	//查询所有未审核的库存配置信息
	PageInfo<s_cell> selectAll(Params params);
	
	PageInfo<s_cell> selectAll1(Params params);

	//审核库存配置信息
	int updfh(s_cell s_cell);

	//查询所有库存配置信息
	PageInfo<s_cell> selectSy(Params params);

	//查询库存配置未设计的产品和物料数量
	int selectZs();

	//查询所有未审核或审核通过的配置单数量
	int selectAllCount(String check_tag);

	List<s_cell> selectSycount1();

	List<s_cell> selectSycount2();

	List<s_cell> selectSycount3();

	//查询可变更的配置单总数
	int selectAllKbg(String check_tag);

	int updfh1(s_cell s_cell);

}
