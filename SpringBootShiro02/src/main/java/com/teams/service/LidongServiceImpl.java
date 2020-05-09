package com.teams.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teams.mapper.LidongMapper;
import com.teams.pojo.D_file;
import com.teams.pojo.S_gather;
import com.teams.pojo.S_gather_details;
import com.teams.pojo.m_apply;
import com.teams.pojo.s_pay;
import com.teams.pojo.s_pay_details;
import com.teams.pojo.stockjh;

@Service
@Transactional
public class LidongServiceImpl implements LidongService{

	@Autowired
	LidongMapper mapper;
	
	//添加产品  --查询符合条件的产品
	@Override
	public List<D_file> selectcp(@Param("design_procedure_tag")String design_procedure_tag) {
		// TODO Auto-generated method stub
		return mapper.selectcp(design_procedure_tag);
	}

	//添加产品  --查询选中的产品信息
	@Override
	public D_file selectcpxx(@Param("product_id")String product_id) {
		// TODO Auto-generated method stub
		return mapper.selectcpxx(product_id);
	}

	//添加生产计划
	@Override
	public int addSc(@Param("apply_id")String apply_id,@Param("remark")String remark,@Param("subtotal")Double subtotal,@Param("register")String register,@Param("check_tag")String check_tag) {
		// TODO Auto-generated method stub
		return mapper.addSc(apply_id,remark,subtotal,register,check_tag);
	}
	
	//添加生产计划产品明细
	@Override
	public void addScmx(String apply_id,String string,String string2,String string3,Integer integer, String string4,
			Double double1,@Param("manufacture_tag")String manufacture_tag) {
		// TODO Auto-generated method stub
		mapper.addScmx(apply_id,string,string2,string3,integer,string4,double1,manufacture_tag);
	}

	//查询生产计划明细
	@Override
	public List<D_file> selectscmx(String apply_id) {
		// TODO Auto-generated method stub
		return mapper.selectscmx(apply_id);
	}

	//查询所有等待审核的生产计划
	@Override
	public List<m_apply> selectShcx(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectShcx(check_tag);
	}

	//查询所有等待审核的生产计划总数
	@Override
	public int selectShcxsum(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectShcxsum(check_tag);
	}

	//生产计划审核通过
	@Override
	public int updShjh(m_apply apply) {
		// TODO Auto-generated method stub
		return mapper.updShjh(apply);
	}

	//生产计划审核不通过
	@Override
	public int delShjh(String apply_id) {
		// TODO Auto-generated method stub
		return mapper.delShjh(apply_id);
	}

	//生产计划审核不通过 --删除生产计划明细
	@Override
	public void delShjhmx(String apply_id) {
		// TODO Auto-generated method stub
		mapper.delShjhmx(apply_id);
	}

	//查询所有生产计划
	@Override
	public List<m_apply> selectShjh() {
		// TODO Auto-generated method stub
		return mapper.selectShjh();
	}

	//查询所有通过审核的产品档案信息
	@Override
	public List<D_file> selectShtg(String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectShtg(check_tag);
	}
	
	//添加入库单
	@Override
	public int addRk(String gather_id, String storer, String reason, Integer amount_sum, Double cost_price_sum,
			String remark, String register, String check_tag, String store_tag) {
		// TODO Auto-generated method stub
		return mapper.addRk(gather_id,storer,reason,amount_sum,cost_price_sum,remark,register,check_tag,store_tag);
	}

	@Override
	public void addRkmx(String gather_id, String string, String string2, String string3, Integer integer,
			String string4, Double double1, Double subtotal) {
		// TODO Auto-generated method stub
		mapper.addRkmx(gather_id,string,string2,string3,integer,string4,double1,subtotal);
	}

	//查询入库单明细
	@Override
	public List<S_gather_details> selectRkmx(String gather_id) {
		// TODO Auto-generated method stub
		return mapper.selectRkmx(gather_id);
	}

	//查询所有等待审核的入库申请单  --不为生产入库
	@Override
	public List<S_gather> selectRkddsh(String check_tag,String reason) {
		// TODO Auto-generated method stub
		return mapper.selectRkddsh(check_tag,reason);
	}

	//查询所有等待审核的入库申请单总数
	@Override
	public int selectRkddshsum(String check_tag,String reason) {
		// TODO Auto-generated method stub
		return mapper.selectRkddshsum(check_tag,reason);
	}

	//入库申请单审核
	@Override
	public int updRksqdsh(S_gather s_gather) {
		// TODO Auto-generated method stub
		return mapper.updRksqdsh(s_gather);
	}

	//查询所有的入库申请单  --不为生产入库
	@Override
	public List<S_gather> selectGetRksqd(String reason) {
		// TODO Auto-generated method stub
		return mapper.selectGetRksqd(reason);
	}

	//查询所有入库单
	@Override
	public List<S_gather> selectGetRkd(String reason, String store_tag,String check_tag) {
		// TODO Auto-generated method stub
		return mapper.selectGetRkd(reason,store_tag,check_tag);
	}

	//查询入库单总数
	@Override
	public int selectGetRkdsum(String check_tag, String reason, String store_tag) {
		// TODO Auto-generated method stub
		return mapper.selectGetRkdsum(check_tag,reason,store_tag);
	}

	//查询入库单详细
	@Override
	public List<stockjh> selectGetRkdxx(String gather_id) {
		// TODO Auto-generated method stub
		return mapper.selectGetRkdxx(gather_id);
	}

	//入库登记   -修改入库表
	@Override
	public int updGetRkddj(String gather_id, String store_tag, Integer gathered_amount, String register) {
		// TODO Auto-generated method stub
		return mapper.updGetRkddj(gather_id,store_tag,gathered_amount,register);
	}

	//入库登记   -修改入库明细表
	@Override
	public void updGetRkmx(String gather_id, Integer gathered_amount, String store_tag) {
		// TODO Auto-generated method stub
		mapper.updGetRkmx(gather_id,gathered_amount,store_tag);
	}

	//判断产品是否安全配置
	@Override
	public int selectGetRkpd(String gather_id) {
		// TODO Auto-generated method stub
		return mapper.selectGetRkpd(gather_id);
	}

	//入库单复核通过   --修改入库表
	@Override
	public int updGetRkdfhtg(String gather_id, String store_tag, Integer gathered_amount, String checker,
			String check_tag) {
		// TODO Auto-generated method stub
		return mapper.updGetRkdfhtg(gather_id,store_tag,gathered_amount,checker,check_tag);
	}

	//入库单复核通过   --修改安全库存配置表
	@Override
	public void updGets_cell(String gather_id, Integer gathered_amount) {
		// TODO Auto-generated method stub
		mapper.updGets_cell(gather_id,gathered_amount);
	}

	
	
	
	/*
	 * 出库申请管理
	 */
	//添加出库申请单
	@Override
	public int addCk(String pay_id, String storer, String reason, Integer amount_sum, Double cost_price_sum,
			String remark, String register, String check_tag, String store_tag) {
		// TODO Auto-generated method stub
		return mapper.addCk(pay_id,storer,reason,amount_sum,cost_price_sum,remark,register,check_tag,store_tag);
	}
	//添加出库申请明细表
	@Override
	public void addCkmx(String pay_id, String string, String string2, String string3, Integer integer, String string4,
			Double double1, double subtotal) {
		// TODO Auto-generated method stub
		mapper.addCkmx(pay_id,string,string2,string3,integer,string4,double1,subtotal);
	}

	//查询出库申请单明细
	@Override
	public List<s_pay_details> selectCkmx(String pay_id) {
		// TODO Auto-generated method stub
		return mapper.selectCkmx(pay_id);
	}

	//查询所有等待审核的出库申请单  --不为生产领料的
	@Override
	public List<s_pay> selectCkddsh(String check_tag, String reason) {
		// TODO Auto-generated method stub
		return mapper.selectCkddsh(check_tag,reason);
	}

	//查询所有审核状态的出库申请单总数    --审核状态
	@Override
	public int selectCkddshsum(String check_tag, String reason) {
		// TODO Auto-generated method stub
		return mapper.selectCkddshsum(check_tag,reason);
	}

	//出库申请单审核
	@Override
	public int updCksqdsh(s_pay s) {
		// TODO Auto-generated method stub
		return mapper.updCksqdsh(s);
	}

	//查询所有的出库申请单  --不为生产领料
	@Override
	public List<s_pay> selectGetCksqd(String reason) {
		// TODO Auto-generated method stub
		return mapper.selectGetCksqd(reason);
	}

	



	
	
	
}
