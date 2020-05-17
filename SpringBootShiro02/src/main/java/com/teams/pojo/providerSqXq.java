package com.teams.pojo;

public class providerSqXq {
   private int id;//序号
   private String providerSqId;//申请编号
   private String providerSqXqId;//申请编号详情
   private String product_id;//产品编号
   private String product_name;//产品名称
   private int amount;//申请数量
   private String unit;//单位
   private double price;//单价
   private double subtotal;//小计
public providerSqXq() {
	super();
}
public providerSqXq(int id, String providerSqId, String providerSqXqId, String product_id, String product_name,
		int amount, String unit, double price, double subtotal) {
	super();
	this.id = id;
	this.providerSqId = providerSqId;
	this.providerSqXqId = providerSqXqId;
	this.product_id = product_id;
	this.product_name = product_name;
	this.amount = amount;
	this.unit = unit;
	this.price = price;
	this.subtotal = subtotal;
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
public String getProviderSqXqId() {
	return providerSqXqId;
}
public void setProviderSqXqId(String providerSqXqId) {
	this.providerSqXqId = providerSqXqId;
}
public String getProduct_id() {
	return product_id;
}
public void setProduct_id(String product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
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
@Override
public String toString() {
	return "providerSqXq [id=" + id + ", providerSqId=" + providerSqId + ", providerSqXqId=" + providerSqXqId
			+ ", product_id=" + product_id + ", product_name=" + product_name + ", amount=" + amount + ", unit=" + unit
			+ ", price=" + price + ", subtotal=" + subtotal + "]";
}
   
}
