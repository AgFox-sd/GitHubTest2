package com.teams.pojo;

public class cgPlan {

	private int id; //序号
	private String cgPlanId;  //采购计划编号
	private String remark; //备注
	private String check_suggestion; //审核意见
	private String register; //登记人
	private String register_time; //登记时间
	private String checker; //审核人
	private String check_tag; //审核标志:S001-0: 等待审核,S001-1: 审核通过,S001-2: 审核不通过
	private String check_time; //审核时间
	public cgPlan() {
		super();
	}
	public cgPlan(int id, String cgPlanId, String remark, String check_suggestion, String register,
			String register_time, String checker, String check_tag, String check_time) {
		super();
		this.id = id;
		this.cgPlanId = cgPlanId;
		this.remark = remark;
		this.check_suggestion = check_suggestion;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_tag = check_tag;
		this.check_time = check_time;
	}
	public int getId() {
		return id;
	}
	public String getCgPlanId() {
		return cgPlanId;
	}
	public String getRemark() {
		return remark;
	}
	public String getCheck_suggestion() {
		return check_suggestion;
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
	public String getCheck_tag() {
		return check_tag;
	}
	public String getCheck_time() {
		return check_time;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCgPlanId(String cgPlanId) {
		this.cgPlanId = cgPlanId;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setCheck_suggestion(String check_suggestion) {
		this.check_suggestion = check_suggestion;
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
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	
	
	
	
	
}
