package com.teams.pojo;

public class s_pay_details {
	
	private int id; //序号
	private String pay_id; //出库单编号
	private String product_id; //产品编号
	private String product_name; //产品名称
	private String product_describe; //描述
	private double amount; //数量
	private String amount_unit;  //单位
	private double cost_price; //单价
	private double subtotal; //小计
	private double paid_amount; //确认出库件数
	private String pay_tag;//出库标志:K002-1: 已登记,K002-2: 已调度
	public s_pay_details() {
		super();
	}
	public s_pay_details(int id, String pay_id, String product_id, String product_name, String product_describe,
			double amount, String amount_unit, double cost_price, double subtotal, double paid_amount, String pay_tag) {
		super();
		this.id = id;
		this.pay_id = pay_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_describe = product_describe;
		this.amount = amount;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.paid_amount = paid_amount;
		this.pay_tag = pay_tag;
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
	public String getProduct_describe() {
		return product_describe;
	}
	public void setProduct_describe(String product_describe) {
		this.product_describe = product_describe;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAmount_unit() {
		return amount_unit;
	}
	public void setAmount_unit(String amount_unit) {
		this.amount_unit = amount_unit;
	}
	public double getCost_price() {
		return cost_price;
	}
	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(double paid_amount) {
		this.paid_amount = paid_amount;
	}
	public String getPay_tag() {
		return pay_tag;
	}
	public void setPay_tag(String pay_tag) {
		this.pay_tag = pay_tag;
	}
	
	
}
