package com.teams.pojo;
/*
 * 产品生产计划明细实体类
 */
public class m_apply_mx {

	private int id; //序号
	private String apply_id; //生产计划编号
	private String product_id;//产品编号 
	private String product_name;//产品名称
	private String product_describe;// '产品描述',
	private int amount;  //数量
	private String personal_unit; //计量单位
	private double real_cost_price; //单价
	private String manufacture_tag; //派工标志，P001-0: 未派工，P001-1: 已派工
	
	private String check_time; //审核时间
	
	
	public m_apply_mx() {
		super();
	}

	public m_apply_mx(int id, String apply_id, String product_id, String product_name, String product_describe,
			int amount, String personal_unit, double real_cost_price, String manufacture_tag, String check_time) {
		super();
		this.id = id;
		this.apply_id = apply_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_describe = product_describe;
		this.amount = amount;
		this.personal_unit = personal_unit;
		this.real_cost_price = real_cost_price;
		this.manufacture_tag = manufacture_tag;
		this.check_time = check_time;
	}


	public int getId() {
		return id;
	}


	public String getApply_id() {
		return apply_id;
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


	public int getAmount() {
		return amount;
	}


	public String getPersonal_unit() {
		return personal_unit;
	}


	public double getReal_cost_price() {
		return real_cost_price;
	}


	public String getManufacture_tag() {
		return manufacture_tag;
	}


	public String getCheck_time() {
		return check_time;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
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


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public void setPersonal_unit(String personal_unit) {
		this.personal_unit = personal_unit;
	}


	public void setReal_cost_price(double real_cost_price) {
		this.real_cost_price = real_cost_price;
	}


	public void setManufacture_tag(String manufacture_tag) {
		this.manufacture_tag = manufacture_tag;
	}


	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}	
	
	
	
	
}
