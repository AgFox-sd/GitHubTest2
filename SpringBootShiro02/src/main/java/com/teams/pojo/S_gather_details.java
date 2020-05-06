package com.teams.pojo;

public class S_gather_details {

	private int id; //序号
	private String gather_id; //入库单编号
	private String product_id; //产品编号
	private String product_name; //产品名称
	private String product_describe; //描述
	private double amount; //数量
	private String amount_unit;  //单位
	private double cost_price; //单价
	private double subtotal; //小计
	private double gathered_amount; //确认入库件数
	private String gather_tag;//入库标志:K002-1: 已登记,K002-2: 已调度
	public S_gather_details() {
		super();
	}
	public S_gather_details(int id, String gather_id, String product_id, String product_name, String product_describe,
			double amount, String amount_unit, double cost_price, double subtotal, double gathered_amount,
			String gather_tag) {
		super();
		this.id = id;
		this.gather_id = gather_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_describe = product_describe;
		this.amount = amount;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.gathered_amount = gathered_amount;
		this.gather_tag = gather_tag;
	}
	public int getId() {
		return id;
	}
	public String getGather_id() {
		return gather_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public String getProduct_describe() {
		return product_describe;
	}
	public double getAmount() {
		return amount;
	}
	public String getAmount_unit() {
		return amount_unit;
	}
	public double getCost_price() {
		return cost_price;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public double getGathered_amount() {
		return gathered_amount;
	}
	public String getGather_tag() {
		return gather_tag;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public void setProduct_describe(String product_describe) {
		this.product_describe = product_describe;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setAmount_unit(String amount_unit) {
		this.amount_unit = amount_unit;
	}
	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public void setGathered_amount(double gathered_amount) {
		this.gathered_amount = gathered_amount;
	}
	public void setGather_tag(String gather_tag) {
		this.gather_tag = gather_tag;
	} 
	
	
	
}
