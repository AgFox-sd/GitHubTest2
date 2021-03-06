package com.teams.pojo;
/*供应商表*/
public class provider {

	private int id;//序号
	private String providerId;//供应商编号（格式：050100+当前年月日+6位随机数）
	private String providerName;//供应商名字
	private String providerAddress;//供应商地址
	private String linkman;//联系人
	private int  fid;//风险id
	private String providerPhone;//供应商电话
	private String register; //登记人',
	private String register_time; //登记时间',
	private String checker;//审核人
	private String check_tag;//审核标志
	private String check_time ;//审核时间
	private String changer;//变更人
	private String change_time;//变更时间
	private String change_tag ;//变更标志
	private String delete_tag ;//删除标志
	private String change_reason ;//变更原因
	private String check_reason ;//审核原因
	
	private String fname;
	private Double price;
	public provider() {
		super();
	}
	
	
	public provider(int id, String providerId, String providerName, String providerAddress, String linkman, int fid,
			String providerPhone, String register, String register_time, String checker, String check_tag,
			String check_time, String changer, String change_time, String change_tag, String delete_tag,String fname) {
		super();
		this.id = id;
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerAddress = providerAddress;
		this.linkman = linkman;
		this.fid = fid;
		this.providerPhone = providerPhone;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_tag = check_tag;
		this.check_time = check_time;
		this.changer = changer;
		this.change_time = change_time;
		this.change_tag = change_tag;
		this.delete_tag = delete_tag;
		this.fname = fname;
	}

    
	public provider(String providerId, String providerName, String linkman, String providerPhone,double price) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.linkman = linkman;
		this.providerPhone = providerPhone;
		this.price = price;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getProviderAddress() {
		return providerAddress;
	}
	public void setProviderAddress(String providerAddress) {
		this.providerAddress = providerAddress;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getProviderPhone() {
		return providerPhone;
	}
	public void setProviderPhone(String providerPhone) {
		this.providerPhone = providerPhone;
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
	public String getDelete_tag() {
		return delete_tag;
	}
	public void setDelete_tag(String delete_tag) {
		this.delete_tag = delete_tag;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getChange_reason() {
		return change_reason;
	}


	public void setChange_reason(String change_reason) {
		this.change_reason = change_reason;
	}


	public String getCheck_reason() {
		return check_reason;
	}


	public void setCheck_reason(String check_reason) {
		this.check_reason = check_reason;
	}


	public provider(int id, String providerId, String providerName, String providerAddress, String linkman, int fid,
			String providerPhone, String register, String register_time, String checker, String check_tag,
			String check_time, String changer, String change_time, String change_tag, String delete_tag,
			String change_reason, String check_reason, String fname) {
		super();
		this.id = id;
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerAddress = providerAddress;
		this.linkman = linkman;
		this.fid = fid;
		this.providerPhone = providerPhone;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_tag = check_tag;
		this.check_time = check_time;
		this.changer = changer;
		this.change_time = change_time;
		this.change_tag = change_tag;
		this.delete_tag = delete_tag;
		this.change_reason = change_reason;
		this.check_reason = check_reason;
		this.fname = fname;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
}
