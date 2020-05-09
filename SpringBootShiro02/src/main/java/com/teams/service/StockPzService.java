package com.teams.service;

import java.util.List;

import com.teams.pojo.D_file;
import com.teams.pojo.s_cell;

public interface StockPzService {

	//查询库存配置未设计的产品和物料
	List<D_file> selectWsj();

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
	List<s_cell> selectAll(String check_tag);

	//审核库存配置信息
	int updfh(s_cell s_cell);

	//查询所有库存配置信息
	List<s_cell> selectSy();

	//查询库存配置未设计的产品和物料数量
	int selectZs();

	//查询所有未审核或审核通过的配置单数量
	int selectAllCount(String check_tag);

	List<s_cell> selectSycount1();

	List<s_cell> selectSycount2();

	List<s_cell> selectSycount3();

	//查询可变更的配置单总数
	int selectAllKbg(String check_tag);

}
