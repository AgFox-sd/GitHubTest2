package com.teams.pojo;

public class cgPlanXq {

	private int id; //序号
	private String cgPlanId;  //采购计划编号
	private String product_id;  //产品编号
	private String product_name; //产品名称
	private double amount; //采购数量
	private String amount_unit; //单位
	private double cost_price; //单价
	private String execute_tag; //执行状态 ：已执行   未执行
	public cgPlanXq() {
		super();
	}
	public cgPlanXq(int id, String cgPlanId, String product_id, String product_name, double amount, String amount_unit,
			double cost_price, String execute_tag) {
		super();
		this.id = id;
		this.cgPlanId = cgPlanId;
		this.product_id = product_id;
		this.product_name = product_name;
		this.amount = amount;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.execute_tag = execute_tag;
	}
	public int getId() {
		return id;
	}
	public String getCgPlanId() {
		return cgPlanId;
	}
	public String getProduct_id() {
		return product_id;
	}
	public String getProduct_name() {
		return product_name;
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
	public String getExecute_tag() {
		return execute_tag;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCgPlanId(String cgPlanId) {
		this.cgPlanId = cgPlanId;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
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
	public void setExecute_tag(String execute_tag) {
		this.execute_tag = execute_tag;
	}
	
	
	
	
}
