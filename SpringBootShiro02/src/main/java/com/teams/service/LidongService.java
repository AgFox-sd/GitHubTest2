package com.teams.service;

import java.util.List;


import com.teams.pojo.D_file;
import com.teams.pojo.S_gather;
import com.teams.pojo.S_gather_details;
import com.teams.pojo.m_apply;
import com.teams.pojo.s_pay;
import com.teams.pojo.s_pay_details;
import com.teams.pojo.stockjh;

public interface LidongService {

	//添加产品  --查询符合条件的产品
	List<D_file> selectcp(String design_procedure_tag);
	
	//添加产品  --查询选中的产品信息
	D_file selectcpxx(String product_id);
	
	//添加生产计划
	int addSc(String apply_id, String remark, Double subtotal, String register, String check_tag);
    
	//添加生产计划产品明细
	void addScmx(String apply_id, String string, String string2, String string3, Integer integer, String string4,
			Double double1,String manufacture_tag);
    
	//查询生产计划明细
	List<D_file> selectscmx(String apply_id);

	//查询所有等待审核的生产计划
	List<m_apply> selectShcx(String check_tag);

	//查询所有等待审核的生产计划总数
	int selectShcxsum(String check_tag);

	//生产计划审核通过
	int updShjh(m_apply apply);

	//生产计划审核不通过
	int delShjh(String apply_id);

	//生产计划审核不通过 --删除生产计划明细
	void delShjhmx(String apply_id);

	//查询所有生产计划
	List<m_apply> selectShjh();

	//查询所有通过审核的产品档案信息
	List<D_file> selectShtg(String check_tag);

	//添加入库单
	int addRk(String gather_id, String storer, String reason, Integer amount_sum, Double cost_price_sum, String remark,
			String register, String check_tag, String store_tag);

	//添加入库单产品明细
	void addRkmx(String gather_id, String string, String string2, String string3, Integer integer, String string4,
			Double double1,Double subtotal);

	//查询入库单明细
	List<S_gather_details> selectRkmx(String gather_id);

	//查询所有等待审核的入库申请单  --不为生产入库
	List<S_gather> selectRkddsh(String check_tag,String reason);

	//查询所有等待审核的入库申请单总数
	int selectRkddshsum(String check_tag,String reason);

	//入库申请单审核
	int updRksqdsh(S_gather s_gather);

	//查询所有的入库申请单  --不为生产入库
	List<S_gather> selectGetRksqd(String reason);

	
	/*
	 * 入库管理
	 */
	
	//查询所有入库单
	List<S_gather> selectGetRkd(String reason, String store_tag,String check_tag);

	//查询入库单总数
	int selectGetRkdsum(String check_tag, String reason, String store_tag);

	//查询入库单详细
	List<stockjh> selectGetRkdxx(String gather_id);

	//入库登记   -修改入库表
	int updGetRkddj(String gather_id, String store_tag, Integer gathered_amount, String register);

	//入库登记   -修改入库明细表  --入库单复核通过修改明细引用此方法
	void updGetRkmx(String gather_id, Integer gathered_amount, String store_tag);

	//判断产品是否安全配置
	int selectGetRkpd(String gather_id);

	//入库单复核通过   --修改入库表
	int updGetRkdfhtg(String gather_id, String store_tag, Integer gathered_amount, String checker, String check_tag);

	//入库单复核通过   --修改安全库存配置表
	void updGets_cell(String gather_id, Integer gathered_amount);

	
	
	/*
	 * 出库申请单
	 */
	//添加出库申请单
	int addCk(String pay_id, String storer, String reason, Integer amount_sum, Double cost_price_sum, String remark,
			String register, String check_tag, String store_tag);
	//添加出库申请明细表
	void addCkmx(String pay_id, String string, String string2, String string3, Integer integer, String string4,
			Double double1, double subtotal);

	//查询出库申请单明细
	List<s_pay_details> selectCkmx(String pay_id);

	//查询所有等待审核的出库申请单  --不为生产领料的
	List<s_pay> selectCkddsh(String check_tag, String reason);

	//查询所有审核状态的出库申请单总数    --审核状态
	int selectCkddshsum(String check_tag, String reason);

	//出库申请单审核
	int updCksqdsh(s_pay s);

	//查询所有的出库申请单  --不为生产领料
	List<s_pay> selectGetCksqd(String reason);
    
	
}
