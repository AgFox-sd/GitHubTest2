package com.teams.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teams.pojo.S_gather;
import com.teams.pojo.S_gather_details;
import com.teams.pojo.s_cell;
import com.teams.pojo.s_pay;
import com.teams.pojo.s_pay_details;
import com.teams.pojo.stockjh;
import com.teams.pojo.stockjhs;
import com.teams.utils.Params;

public interface StockDiaoduService {

	//查询所有入库单
	PageInfo<S_gather> selectoutStock(Params params);

	//查询所有出库单
	PageInfo<s_pay> selectoutStock1(Params params);
	
	//查询所有入库单详情
	List<S_gather_details> selectoutStockXq(String gather_id);

	//查询所有出库单详情
	List<s_pay_details> selectoutStockXq1(String pay_id);
	//查询有无可调度的安全配置库存
	int selectKdd(String product_id);

	//根据产品编号多表联查
	List<stockjh> selectoutStockCp(String product_id,String gather_id);

	//根据产品编号多表联查
	stockjhs selectoutStockCp1(String product_id,String pay_id);
	
	//修改库存
	void updKc(String gathered_amount, String product_id);

	int updDiaodu(String gathered_amount, String product_id,String gather_id);

	void updZb(String gathered_amount, String gather_id);

	//修改库存
	void updKc1(String paid_amount, String product_id);

	int updDiaodu1(String paid_amount, String product_id,String pay_id);

	void updZb1(String paid_amount, String pay_id);
	
	void updKc2(String paid_amount, String product_id);

	int updDiaodu3(String paid_amount,String check_yj, String product_id,String pay_id);


	//修改入库表为已调度
	int updZdiaodu(String attemper,String gather_id);

	//修改出库表为已调度
	int updZdiaodu1(String attemper,String pay_id);
	
	void updKcxq(String gather_id, String product_id);

	int updDdu(String attemper, String gather_id);

	void updKcxq1(String pay_id, String product_id);

	int updDdu1(String attemper, String pay_id);
	
	int updDiaodu2(String product_id,String paid_amount,String pay_id);
	
	int selectoutStockcount1();

	int selectoutStockcount2();

	int selectoutStockcount3();

	int selectoutStockcount4();
	
	int selectoutStockcount5();

	int selectoutStockcount6();
	
	int selectoutStockcount7();

	int selectoutStockcount8();

	//查询库存
	PageInfo<s_cell> selectscell(Params params);

	int selectscellcount1();
	
	int selectscellcount2();
	
	int selectscellcount3();
	
	int selectscellcount4();

	PageInfo<s_pay> selectAlloutStock(Params params);

	int selectAlloutStockcount1();

	int selectAlloutStockcount2();
	
	int selectAlloutStockcount3();

	int selectAlloutStockcount4();

	//查询所有出库单
	PageInfo<s_pay> selectGetCkd(Params params);
	
	PageInfo<s_pay> selectGetCkds(Params params);

	void updZb2(String paid_amount, String pay_id);

	int updZdiaodu2(String attemper, String pay_id);

	int updZdiaodu3(String attemper, String pay_id);

	PageInfo<s_pay> selectAllinStock(Params params);

	void updpg(String pg_id);

	void updzsd(String zsdbh);

	void updshyj(String check_yj, String pay_id);
}
