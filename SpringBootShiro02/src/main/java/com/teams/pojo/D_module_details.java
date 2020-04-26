package com.teams.pojo;
/*
 * 产品物料组成明细表
 * */
public class D_module_details {

	private int id;//'序号',
	private String design_id;//设计编号',
	private String product_id;//物料编号',
	private String product_name;//物料名称',
	private String product_describe;//描述
	private String amount_unit;//单位
	private int amount;//数量',
	private int residual_amount;//可用数量',
	private double cost_price;//'单价',
	private double subtotal;//'小计'
	
	private String lx;//用途类型
	private String dc;
	
	public D_module_details() {
		super();
	}

	public D_module_details(String product_id, String product_name, String amount_unit, int amount, double cost_price,
			double subtotal, String lx,String dc) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.amount_unit = amount_unit;
		this.amount = amount;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.lx = lx;
		this.dc = dc;
	}
	public D_module_details(int id, String design_id, String product_id, String product_name, String product_describe,
			String amount_unit, int amount, int residual_amount, double cost_price, double subtotal, String lx,
			String dc) {
		super();
		this.id = id;
		this.design_id = design_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_describe = product_describe;
		this.amount_unit = amount_unit;
		this.amount = amount;
		this.residual_amount = residual_amount;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.lx = lx;
		this.dc = dc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getDesign_id() {
		return design_id;
	}



	public void setDesign_id(String design_id) {
		this.design_id = design_id;
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

	public String getAmount_unit() {
		return amount_unit;
	}

	public void setAmount_unit(String amount_unit) {
		this.amount_unit = amount_unit;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getResidual_amount() {
		return residual_amount;
	}

	public void setResidual_amount(int residual_amount) {
		this.residual_amount = residual_amount;
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

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	
	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	@Override
	public String toString() {
		return "D_module_details [id=" + id + ", design_id=" + design_id + ", product_id=" + product_id
				+ ", product_name=" + product_name + ", product_describe=" + product_describe + ", amount_unit="
				+ amount_unit + ", amount=" + amount + ", residual_amount=" + residual_amount + ", cost_price="
				+ cost_price + ", subtotal=" + subtotal + ", lx=" + lx + "]";
	}
	
	
	
	
}
