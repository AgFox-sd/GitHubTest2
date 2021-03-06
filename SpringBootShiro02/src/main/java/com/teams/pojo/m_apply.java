package com.teams.pojo;
/*
 * #产品生产计划实体类
 */
public class m_apply {

	private int id;  //序号
	private String apply_id; //生产计划编号
	private String remark;  //备注
	private double subtotal; //计划总成本 -- 加
	private String register;  //登记人
	private String register_time;  //登记时间
	private String checker; //复核人
	private String check_suggestion; //审核意见
	private String check_time; //审核时间
	private String check_tag; //审核标志  S001-0: 等待审核 ，S001-1: 审核通过，S001-2: 审核不通过
	
	
	public m_apply() {
		super();
	}

	public m_apply(int id, String apply_id, String remark, double subtotal, String register, String register_time,
			String checker, String check_suggestion, String check_time, String check_tag) {
		super();
		this.id = id;
		this.apply_id = apply_id;
		this.remark = remark;
		this.subtotal = subtotal;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_suggestion = check_suggestion;
		this.check_time = check_time;
		this.check_tag = check_tag;
	}

	public int getId() {
		return id;
	}

	public String getApply_id() {
		return apply_id;
	}

	public String getRemark() {
		return remark;
	}

	public double getSubtotal() {
		return subtotal;
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

	public String getCheck_suggestion() {
		return check_suggestion;
	}

	public String getCheck_time() {
		return check_time;
	}

	public String getCheck_tag() {
		return check_tag;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
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

	public void setCheck_suggestion(String check_suggestion) {
		this.check_suggestion = check_suggestion;
	}

	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}

	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	
	
	
	
	
	
	
}
