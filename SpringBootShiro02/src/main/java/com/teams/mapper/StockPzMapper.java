package com.teams.mapper;

import java.util.List;

import com.teams.pojo.D_file;
import com.teams.pojo.s_cell;

public interface StockPzMapper {

	//查询库存配置未设计的产品和物料
	public List<D_file> selectWsj();

	//增加库存信息
	public int addkC(s_cell s_cell);

	//查询库存信息
	public s_cell selectKc(String product_id);

	//查看仓库编号是否存在
	public int selectCount(String product_id);
	
	//修改产品的库存设计为已设计
	public int updDfile(String product_id);

	//修改库存配置信息
	public int updKc(s_cell s_cell);

	//查询所有未审核的库存配置信息
	public List<s_cell> selectAll(String check_tag);

	//审核库存配置信息
	public int updfh(s_cell s_cell);

	//查询所有库存配置信息
	public List<s_cell> selectSy();

	//查询库存配置未设计的产品和物料数量
	public int selectZs();

	//查询所有未审核或审核通过的配置单数量
	public int selectAllCount(String check_tag);

	public List<s_cell> selectSycount1();

	public List<s_cell> selectSycount2();

	public List<s_cell> selectSycount3();

	//查询可变更的配置单总数
	public int selectAllKbg(String check_tag);

}
