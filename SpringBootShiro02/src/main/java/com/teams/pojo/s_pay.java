package com.teams.pojo;

public class s_pay {
	
	 private int  id;  //序号
	 private String pay_id; //出库单编号
	 private String storer;  //出库人
	 private String reason; //出库理由：C002-1: 生产领料，C002-2: 赠送，C002-3: 内部借领，C002-4: 其他借领
	 private String reasonexact; //出库详细理由
	 private double amount_sum;//总件数
	 private double cost_price_sum; //总金额
	 private double paid_amount_sum; //确认出库总件数
	 private String remark; //备注
	 private String register; //登记人
	 private String register_time; //登记时间
	 private String checker; //复核人
	 private String check_time; //复核时间
	 private String check_tag; //审核标志：S001-0: 等待审核，S001-1: 审核通过，S001-2: 审核不通过
	 private String attemper; //调度人
	 private String attemper_time; //调度时间
	 private String store_tag; //库存标志：K002-1: 已登记，K002-2: 已调度
	 private String sjbh;
	 private String check_yj;
	public s_pay() {
		super();
	}
	public s_pay(int id, String pay_id, String storer, String reason, String reasonexact, double amount_sum,
			double cost_price_sum, double paid_amount_sum, String remark, String register, String register_time,
			String checker, String check_time, String check_tag, String attemper, String attemper_time,
			String store_tag,String sjbh,String check_yj) {
		super();
		this.id = id;
		this.pay_id = pay_id;
		this.storer = storer;
		this.reason = reason;
		this.reasonexact = reasonexact;
		this.amount_sum = amount_sum;
		this.cost_price_sum = cost_price_sum;
		this.paid_amount_sum = paid_amount_sum;
		this.remark = remark;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_tag = check_tag;
		this.attemper = attemper;
		this.attemper_time = attemper_time;
		this.store_tag = store_tag;
		this.sjbh = sjbh;
		this.check_yj=check_yj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPay_id() {
		return pay_id;
	}
	public void setPay_id(String pay_id) {
		this.pay_id = pay_id;
	}
	public String getStorer() {
		return storer;
	}
	public void setStorer(String storer) {
		this.storer = storer;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReasonexact() {
		return reasonexact;
	}
	public void setReasonexact(String reasonexact) {
		this.reasonexact = reasonexact;
	}
	public double getAmount_sum() {
		return amount_sum;
	}
	public void setAmount_sum(double amount_sum) {
		this.amount_sum = amount_sum;
	}
	public double getCost_price_sum() {
		return cost_price_sum;
	}
	public void setCost_price_sum(double cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
	}
	public double getPaid_amount_sum() {
		return paid_amount_sum;
	}
	public void setPaid_amount_sum(double paid_amount_sum) {
		this.paid_amount_sum = paid_amount_sum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getCheck_time() {
		return check_time;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public String getAttemper() {
		return attemper;
	}
	public void setAttemper(String attemper) {
		this.attemper = attemper;
	}
	public String getAttemper_time() {
		return attemper_time;
	}
	public void setAttemper_time(String attemper_time) {
		this.attemper_time = attemper_time;
	}
	public String getStore_tag() {
		return store_tag;
	}
	public void setStore_tag(String store_tag) {
		this.store_tag = store_tag;
	}
	public String getSjbh() {
		return sjbh;
	}
	public void setSjbh(String sjbh) {
		this.sjbh = sjbh;
	}
	public String getCheck_yj() {
		return check_yj;
	}
	public void setCheck_yj(String check_yj) {
		this.check_yj = check_yj;
	}
	 
	 
}
