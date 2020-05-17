package com.teams.pojo;

public class recommendXq {
	private int id;//#序号	
	private String recommendId;// #推荐单编号
	private String recommendIdXq;//#推荐单详情编号 （格式：050400+当前年月日+6位随机数）
	private String providerId;//#供应商编号
	private String providerName;// #供应商名字
	private String providerPhone;//#供应商电话
	private String linkman;//#联系人
	public recommendXq() {
		super();
	}
	public recommendXq(int id, String recommendId, String recommendIdXq, String providerId, String providerName,
			String providerPhone, String linkman) {
		super();
		this.id = id;
		this.recommendId = recommendId;
		this.recommendIdXq = recommendIdXq;
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerPhone = providerPhone;
		this.linkman = linkman;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRecommendId() {
		return recommendId;
	}
	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendIdXq() {
		return recommendIdXq;
	}
	public void setRecommendIdXq(String recommendIdXq) {
		this.recommendIdXq = recommendIdXq;
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
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	
	
}
