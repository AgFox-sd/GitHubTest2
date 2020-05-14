package com.teams.pojo;

public class cgDiaoduXq {
	private int id;//序号
	private String cgDiaoduId;//采购执行编号
	private String cgDiaoduXqId;//采购执行详情编号(格式：050800+当前年月日+6位随机数）
	private String providerId;//供应商编号
	private String providerName;//供应商名字
	private String providerPhone;//供应商电话
	private String linkman;//联系人
	private int amount;//采购数量
	private double price ;//单价
	private double subtotal;//小计
	private String onstocks_tag;//入库状态
	public cgDiaoduXq() {
		super();
	}
	public cgDiaoduXq(int id, String cgDiaoduId, String cgDiaoduXqId, String providerId, String providerName,
			String providerPhone, String linkman, int amount, double price, double subtotal, String onstocks_tag) {
		super();
		this.id = id;
		this.cgDiaoduId = cgDiaoduId;
		this.cgDiaoduXqId = cgDiaoduXqId;
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerPhone = providerPhone;
		this.linkman = linkman;
		this.amount = amount;
		this.price = price;
		this.subtotal = subtotal;
		this.onstocks_tag = onstocks_tag;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCgDiaoduId() {
		return cgDiaoduId;
	}
	public void setCgDiaoduId(String cgDiaoduId) {
		this.cgDiaoduId = cgDiaoduId;
	}
	public String getCgDiaoduXqId() {
		return cgDiaoduXqId;
	}
	public void setCgDiaoduXqId(String cgDiaoduXqId) {
		this.cgDiaoduXqId = cgDiaoduXqId;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public String getOnstocks_tag() {
		return onstocks_tag;
	}
	public void setOnstocks_tag(String onstocks_tag) {
		this.onstocks_tag = onstocks_tag;
	}
	@Override
	public String toString() {
		return "cgDiaoduXq [id=" + id + ", cgDiaoduId=" + cgDiaoduId + ", cgDiaoduXqId=" + cgDiaoduXqId
				+ ", providerId=" + providerId + ", providerName=" + providerName + ", providerPhone=" + providerPhone
				+ ", linkman=" + linkman + ", amount=" + amount + ", price=" + price + ", subtotal=" + subtotal
				+ ", onstocks_tag=" + onstocks_tag + "]";
	}
	
	
}
