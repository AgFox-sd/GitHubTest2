package com.teams.mapper;

import java.util.List;

import com.teams.pojo.S_gather;
import com.teams.pojo.S_gather_details;
import com.teams.pojo.s_cell;
import com.teams.pojo.s_pay;
import com.teams.pojo.s_pay_details;
import com.teams.pojo.stockjh;
import com.teams.pojo.stockjhs;

public interface StockDiaoduMapper {

	//查询所有入库单
	List<S_gather> selectoutStock();

	//查询所有出库单
	List<s_pay> selectoutStock1();
	
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

	int supdDiaodu(String gathered_amount, String product_id,String gather_id);

	void updZb(String gathered_amount, String gather_id);

	//修改库存
	void updKc1(String paid_amount, String product_id);

	int updDiaodu1(String paid_amount, String product_id,String pay_id);

	void updZb1(String paid_amount, String pay_id);
	
	//修改入库表为已调度
	int updZdiaodu(String attemper,String gather_id);

	//修改出库表为已调度
	int updZdiaodu1(String attemper,String pay_id);
	
	void updKcxq(String gather_id, String product_id);

	int updDdu(String attemper, String gather_id);

	void updKcxq1(String pay_id, String product_id);

	int updDdu1(String attemper, String pay_id);
	
	int selectoutStockcount1();

	int selectoutStockcount2();
	
	int selectoutStockcount3();

	int selectoutStockcount4();

	//查询库存
	List<s_cell> selectscell();

	int selectscellcount1();
	
	int selectscellcount2();
	
	int selectscellcount3();
	
	int selectscellcount4();

	List<S_gather> selectAlloutStock();

	int selectAlloutStockcount1();

	int selectAlloutStockcount2();
	
	int selectAlloutStockcount3();

	int selectAlloutStockcount4();

	int selectoutStockcount5();

	int selectoutStockcount6();
	
	int selectoutStockcount7();

	int selectoutStockcount8();
	//查询所有出库单
	List<s_pay> selectGetCkd(String reason, String store_tag, String check_tag);

	int updZb2(String paid_amount, String pay_id);

	int updDiaodu2(String product_id,String paid_amount,String pay_id);

	int updZdiaodu2(String attemper, String pay_id);
	
	void updKc2(String paid_amount, String product_id);

	int updDiaodu3(String paid_amount, String product_id,String pay_id);

	int updZdiaodu3(String attemper, String pay_id);

	List<s_pay> selectAllinStock();
}
