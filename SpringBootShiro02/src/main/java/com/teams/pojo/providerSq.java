package com.teams.pojo;

public class providerSq {
    private int id;//序号
    private String providerSqId;//申请编号（报价单编号  格式：050200+当前年月日+6位随机数）
    private String providerId;//供应商编号
    private String providerName;//供应商名称
    private String providerPhone;//供应商电话
    private String supply_time;//供货时间
    private String register;//登记人
    private String register_time;//登记时间
    private String checker;//审核人
    private String check_tag;//审核标志
    private String check_time;//审核时间
    private String changer;//变更人
    private String change_time;//变更时间
    private String change_tag;//变更标志
    
    private String providerSqXqId;
    
	public providerSq() {
		super();
	}

	public providerSq(int id, String providerSqId, String providerId, String providerName, String providerPhone,
			String supply_time, String register, String register_time, String checker, String check_tag,
			String check_time, String changer, String change_time, String change_tag, String providerSqXqId) {
		super();
		this.id = id;
		this.providerSqId = providerSqId;
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerPhone = providerPhone;
		this.supply_time = supply_time;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_tag = check_tag;
		this.check_time = check_time;
		this.changer = changer;
		this.change_time = change_time;
		this.change_tag = change_tag;
		this.providerSqXqId = providerSqXqId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProviderSqId() {
		return providerSqId;
	}

	public void setProviderSqId(String providerSqId) {
		this.providerSqId = providerSqId;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderPhone() {
		return providerPhone;
	}

	public void setProviderPhone(String providerPhone) {
		this.providerPhone = providerPhone;
	}

	public String getSupply_time() {
		return supply_time;
	}

	public void setSupply_time(String supply_time) {
		this.supply_time = supply_time;
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

	public String getCheck_tag() {
		return check_tag;
	}

	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}

	public String getCheck_time() {
		return check_time;
	}

	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}

	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public String getChange_time() {
		return change_time;
	}

	public void setChange_time(String change_time) {
		this.change_time = change_time;
	}

	public String getChange_tag() {
		return change_tag;
	}

	public void setChange_tag(String change_tag) {
		this.change_tag = change_tag;
	}

	public String getProviderSqXqId() {
		return providerSqXqId;
	}

	public void setProviderSqXqId(String providerSqXqId) {
		this.providerSqXqId = providerSqXqId;
	}

	@Override
	public String toString() {
		return "providerSq [id=" + id + ", providerSqId=" + providerSqId + ", providerId=" + providerId
				+ ", providerName=" + providerName + ", providerPhone=" + providerPhone + ", supply_time=" + supply_time
				+ ", register=" + register + ", register_time=" + register_time + ", checker=" + checker
				+ ", check_tag=" + check_tag + ", check_time=" + check_time + ", changer=" + changer + ", change_time="
				+ change_time + ", change_tag=" + change_tag + ", providerSqXqId=" + providerSqXqId + "]";
	}
	
}
