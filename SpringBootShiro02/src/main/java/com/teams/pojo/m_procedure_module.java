package com.teams.pojo;

public class m_procedure_module {
	private  int id;	//序号
	private  String   design_id  ;	//工序单编号
	private  String   procedure_name  ;	//工序名称
	private  String   product_id;//物料编号
	private  String   product_name;//物料名称
	private  String   product_describe;//描述
	private  int  amount  ;	//本工序数量
	private  String   amount_unit;//单位
	private  double  cost_price;//物料单价
	private  double  subtotal;//物料成本小计
	public m_procedure_module() {
		super();
	}
	
	public m_procedure_module(String design_id, String procedure_name, String product_id, String product_name, int amount, String amount_unit, double cost_price, double subtotal) {
		super();
		this.design_id = design_id;
		this.procedure_name = procedure_name;
		this.product_id = product_id;
		this.product_name = product_name;
		this.amount = amount;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
	}

	public m_procedure_module(int id, String design_id, String procedure_name, String product_id, String product_name,
			String product_describe, int amount, String amount_unit, double cost_price, double subtotal) {
		super();
		this.id = id;
		this.design_id = design_id;
		this.procedure_name = procedure_name;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_describe = product_describe;
		this.amount = amount;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
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
	public String getProcedure_name() {
		return procedure_name;
	}
	public void setProcedure_name(String procedure_name) {
		this.procedure_name = procedure_name;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
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
}
