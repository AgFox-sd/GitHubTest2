package com.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.StockDiaoduMapper;
import com.teams.pojo.S_gather;
import com.teams.pojo.S_gather_details;
import com.teams.pojo.s_cell;
import com.teams.pojo.s_pay;
import com.teams.pojo.s_pay_details;
import com.teams.pojo.stockjh;
import com.teams.pojo.stockjhs;

@Service
@Transactional
public class StockDiaoduServiceImpl implements StockDiaoduService {

	@Autowired
	StockDiaoduMapper mapper;

	//查询所有入库单
	@Override
	public List<S_gather> selectoutStock() {
		return mapper.selectoutStock();
	}

	//查询所有出库单
	@Override
	public List<s_pay> selectoutStock1() {
		return mapper.selectoutStock1();
	}
	
	//查询所有入库单详情
	@Override
	public List<S_gather_details> selectoutStockXq(String gather_id) {
		return mapper.selectoutStockXq(gather_id);
	}

	//查询所有出库单详情
	@Override
	public List<s_pay_details> selectoutStockXq1(String pay_id) {
		return mapper.selectoutStockXq1(pay_id);
	}

	//查询有无可调度的安全配置库存
	@Override
	public int selectKdd(String product_id) {
		return mapper.selectKdd(product_id);
	}

	//根据产品编号多表联查
	@Override
	public List<stockjh> selectoutStockCp(String product_id,String gather_id) {
		return mapper.selectoutStockCp(product_id,gather_id);
	}

	//根据产品编号多表联查
	@Override
	public stockjhs selectoutStockCp1(String product_id,String pay_id) {
		return mapper.selectoutStockCp1(product_id,pay_id);
	}

	//修改库存
	@Override
	public void updKc(String gathered_amount, String product_id) {
		mapper.updKc(gathered_amount, product_id);
	}

	@Override
	public int updDiaodu(String gathered_amount, String product_id,String gather_id) {
		return mapper.supdDiaodu(gathered_amount, product_id, gather_id);
	}

	@Override
	public void updZb(String gathered_amount, String gather_id) {
		mapper.updZb(gathered_amount, gather_id);
	}

	//修改库存
	@Override
	public void updKc1(String paid_amount, String product_id) {
		mapper.updKc1(paid_amount, product_id);
	}

	@Override
	public int updDiaodu1(String paid_amount, String product_id,String pay_id) {
		return mapper.updDiaodu1(paid_amount, product_id, pay_id);
	}

	@Override
	public void updZb1(String paid_amount, String pay_id) {
		mapper.updZb1(paid_amount, pay_id);
	}

	@Override
	public void updKc2(String paid_amount, String product_id) {
		mapper.updKc2(paid_amount, product_id);
	}

	@Override
	public int updDiaodu3(String paid_amount, String product_id,String pay_id) {
		return mapper.updDiaodu3(paid_amount, product_id, pay_id);
	}

	@Override
	public int updZdiaodu3(String attemper, String pay_id) {
		return mapper.updZdiaodu3(attemper, pay_id);
	}
	@Override
	public void updZb2(String paid_amount, String pay_id) {
		mapper.updZb2(paid_amount, pay_id);
	}
	//修改入库表为已调度
	@Override
	public int updZdiaodu(String attemper,String gather_id) {
		return mapper.updZdiaodu(attemper,gather_id);
	}

	//修改出库表为已调度
	@Override
	public int updZdiaodu1(String attemper,String pay_id) {
		return mapper.updZdiaodu1(attemper,pay_id);
	}

	@Override
	public int updZdiaodu2(String attemper,String pay_id) {
		return mapper.updZdiaodu2(attemper,pay_id);
	}
	
	@Override
	public int updDiaodu2(String product_id,String paid_amount,String pay_id) {
		return mapper.updDiaodu2(product_id, paid_amount, pay_id);
	}

	@Override
	public void updKcxq(String gather_id, String product_id) {
		mapper.updKcxq(gather_id, product_id);
	}

	@Override
	public int updDdu(String attemper, String gather_id) {
		return mapper.updDdu(attemper, gather_id);
	}
	
	@Override
	public void updKcxq1(String pay_id, String product_id) {
		mapper.updKcxq1(pay_id, product_id);
	}

	@Override
	public int updDdu1(String attemper, String pay_id) {
		return mapper.updDdu1(attemper, pay_id);
	}
	
	@Override
	public int selectoutStockcount1() {
		return mapper.selectoutStockcount1();
	}

	@Override
	public int selectoutStockcount2() {
		return mapper.selectoutStockcount2();
	}
	
	@Override
	public int selectoutStockcount3() {
		return mapper.selectoutStockcount3();
	}

	@Override
	public int selectoutStockcount4() {
		return mapper.selectoutStockcount4();
	}

	@Override
	public int selectoutStockcount5() {
		return mapper.selectoutStockcount5();
	}

	@Override
	public int selectoutStockcount6() {
		return mapper.selectoutStockcount6();
	}
	
	@Override
	public int selectoutStockcount7() {
		return mapper.selectoutStockcount7();
	}

	@Override
	public int selectoutStockcount8() {
		return mapper.selectoutStockcount8();
	}
	//查询库存
	@Override
	public List<s_cell> selectscell() {
		return mapper.selectscell();
	}

	@Override
	public int selectscellcount1() {
		return mapper.selectscellcount1();
	}

	@Override
	public int selectscellcount2() {
		return mapper.selectscellcount2();
	}

	@Override
	public int selectscellcount3() {
		return mapper.selectscellcount3();
	}

	@Override
	public int selectscellcount4() {
		return mapper.selectscellcount4();
	}

	@Override
	public List<S_gather> selectAlloutStock() {
		return mapper.selectAlloutStock();
	}

	@Override
	public int selectAlloutStockcount1() {
		return mapper.selectAlloutStockcount1();
	}

	@Override
	public int selectAlloutStockcount2() {
		return mapper.selectAlloutStockcount2();
	}

	@Override
	public int selectAlloutStockcount3() {
		return mapper.selectAlloutStockcount3();
	}

	@Override
	public int selectAlloutStockcount4() {
		return mapper.selectAlloutStockcount4();
	}
	//查询所有出库单
	@Override
	public List<s_pay> selectGetCkd(String reason, String store_tag, String check_tag) {
		return mapper.selectGetCkd(reason, store_tag, check_tag);
	}

	@Override
	public List<s_pay> selectAllinStock() {
		return mapper.selectAllinStock();
	}

	@Override
	public void updpg(String pg_id) {
		mapper.updpg(pg_id);
	}

}
