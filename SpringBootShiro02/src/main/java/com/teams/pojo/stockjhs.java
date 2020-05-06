package com.teams.pojo;

public class stockjhs {
	private int id; // 序号
	private String store_id; // 库存编号
	private String stock_name;// 库房名称
	private String product_type;// 产品类型
	private double min_amount; // 库存报警下限数
	private double max_amount; // 库存报警上限数
	private String address;//存储地址
	private double max_capacity_amount; // 最大存储量
	private double amount; // 当前存储量
	private String pay_id; //出库单编号
	private String product_id; //产品编号
	private String product_name; //产品名称
	private String product_describe; //描述
	private double amounts; //数量
	private String amount_unit;  //单位
	private double cost_price; //单价
	private double subtotal; //小计
	private double paid_amount; //确认出库件数
	public stockjhs() {
		super();
	}
	public stockjhs(int id, String store_id, String stock_name, String product_type, double min_amount,
			double max_amount, String address, double max_capacity_amount, double amount, String pay_id,
			String product_id, String product_name, String product_describe, double amounts, String amount_unit,
			double cost_price, double subtotal, double paid_amount) {
		super();
		this.id = id;
		this.store_id = store_id;
		this.stock_name = stock_name;
		this.product_type = product_type;
		this.min_amount = min_amount;
		this.max_amount = max_amount;
		this.address = address;
		this.max_capacity_amount = max_capacity_amount;
		this.amount = amount;
		this.pay_id = pay_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_describe = product_describe;
		this.amounts = amounts;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.paid_amount = paid_amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public double getMin_amount() {
		return min_amount;
	}
	public void setMin_amount(double min_amount) {
		this.min_amount = min_amount;
	}
	public double getMax_amount() {
		return max_amount;
	}
	public void setMax_amount(double max_amount) {
		this.max_amount = max_amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMax_capacity_amount() {
		return max_capacity_amount;
	}
	public void setMax_capacity_amount(double max_capacity_amount) {
		this.max_capacity_amount = max_capacity_amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
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
	public double getAmounts() {
		return amounts;
	}
	public void setAmounts(double amounts) {
		this.amounts = amounts;
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
	
	
}
