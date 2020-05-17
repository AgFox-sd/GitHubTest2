package com.teams.pojo;
/*
 * 入库实体类
 */
public class S_gather {

	 private int  id;  //序号
	 private String gather_id; //入库单编号
	 private String storer;  //入库人
	 private String reason; //入库理由：R001-1: 生产入库，R001-2: 库存初始，R001-3: 赠送，R001-4: 内部归还，R001-5: 其他归还
	 private String reasonexact; //入库详细理由
	 private double amount_sum;//总件数
	 private double cost_price_sum; //总金额
	 private double gathered_amount_sum; //确认入库总件数
	 private String remark; //备注
	 private String register; //登记人
	 private String register_time; //登记时间
	 private String checker; //复核人
	 private String check_time; //复核时间
	 private String check_tag; //审核标志：S001-0: 等待审核，S001-1: 审核通过，S001-2: 审核不通过
	 private String attemper; //调度人
	 private String attemper_time; //调度时间
	 private String store_tag; //库存标志：K002-1: 已登记，K002-2: 已调度
	 
	 private String zsdbh;
	public S_gather() {
		super();
	}
	public S_gather(int id, String gather_id, String storer, String reason, String reasonexact, double amount_sum,
			double cost_price_sum, double gathered_amount_sum, String remark, String register, String register_time,
			String checker, String check_time, String check_tag, String attemper, String attemper_time,
			String store_tag,String zsdbh) {
		super();
		this.id = id;
		this.gather_id = gather_id;
		this.storer = storer;
		this.reason = reason;
		this.reasonexact = reasonexact;
		this.amount_sum = amount_sum;
		this.cost_price_sum = cost_price_sum;
		this.gathered_amount_sum = gathered_amount_sum;
		this.remark = remark;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_tag = check_tag;
		this.attemper = attemper;
		this.attemper_time = attemper_time;
		this.store_tag = store_tag;
		this.zsdbh = zsdbh;
	}
	public int getId() {
		return id;
	}
	public String getGather_id() {
		return gather_id;
	}
	public String getStorer() {
		return storer;
	}
	public String getReason() {
		return reason;
	}
	public String getReasonexact() {
		return reasonexact;
	}
	public double getAmount_sum() {
		return amount_sum;
	}
	public double getCost_price_sum() {
		return cost_price_sum;
	}
	public double getGathered_amount_sum() {
		return gathered_amount_sum;
	}
	public String getRemark() {
		return remark;
	}
	public String getRegister() {
		return register;
	}
	public String getRegister_time() {
		return register_time;
	}
	public String getChecker() {
		return checker;
	}
	public String getCheck_time() {
		return check_time;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public String getAttemper() {
		return attemper;
	}
	public String getAttemper_time() {
		return attemper_time;
	}
	public String getStore_tag() {
		return store_tag;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}
	public void setStorer(String storer) {
		this.storer = storer;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setReasonexact(String reasonexact) {
		this.reasonexact = reasonexact;
	}
	public void setAmount_sum(double amount_sum) {
		this.amount_sum = amount_sum;
	}
	public void setCost_price_sum(double cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
	}
	public void setGathered_amount_sum(double gathered_amount_sum) {
		this.gathered_amount_sum = gathered_amount_sum;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public void setAttemper(String attemper) {
		this.attemper = attemper;
	}
	public void setAttemper_time(String attemper_time) {
		this.attemper_time = attemper_time;
	}
	public void setStore_tag(String store_tag) {
		this.store_tag = store_tag;
	}
	public String getZsdbh() {
		return zsdbh;
	}
	public void setZsdbh(String zsdbh) {
		this.zsdbh = zsdbh;
	}
	
}
