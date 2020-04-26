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
	
}
