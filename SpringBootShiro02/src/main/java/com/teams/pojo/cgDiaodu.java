package com.teams.pojo;

public class cgDiaodu {
	private int id;//序号
	private String cgDiaoduId;//采购执行编号（格式：050700+当前年月日+6位随机数）
	private String cgPlanId;//采购计划编号（格式：050500+当前年月日+6位随机数）
	private String product_id;//产品编号
	private String product_name;//产品名称
	private int amount_sum;//采购总数量
	private double price_sun ;//采购总价
	private String register ;//登记人
	private String register_time ;//登记时间
	private String checker ;//审核人
	private String check_tag;//审核标志 
	private String check_time;//审核时间
	private String onstock_tag ;//入库状态
	private String check_yj;
	public cgDiaodu() {
		super();
	}
	public cgDiaodu(int id, String cgDiaoduId, String cgPlanId, String product_id, String product_name, int amount_sum,
			double price_sun, String register, String register_time, String checker, String check_tag,
			String check_time, String onstock_tag,String check_yj) {
		super();
		this.id = id;
		this.cgDiaoduId = cgDiaoduId;
		this.cgPlanId = cgPlanId;
		this.product_id = product_id;
		this.product_name = product_name;
		this.amount_sum = amount_sum;
		this.price_sun = price_sun;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_tag = check_tag;
		this.check_time = check_time;
		this.onstock_tag = onstock_tag;
		this.check_yj=check_yj;
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
	public String getCgPlanId() {
		return cgPlanId;
	}
	public void setCgPlanId(String cgPlanId) {
		this.cgPlanId = cgPlanId;
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
	public int getAmount_sum() {
		return amount_sum;
	}
	public void setAmount_sum(int amount_sum) {
		this.amount_sum = amount_sum;
	}
	public double getPrice_sun() {
		return price_sun;
	}
	public void setPrice_sun(double price_sun) {
		this.price_sun = price_sun;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public String getCheck_time() {
		return check_time;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	public String getOnstock_tag() {
		return onstock_tag;
	}
	public void setOnstock_tag(String onstock_tag) {
		this.onstock_tag = onstock_tag;
	}
	
	
	public String getCheck_yj() {
		return check_yj;
	}
	public void setCheck_yj(String check_yj) {
		this.check_yj = check_yj;
	}
	@Override
	public String toString() {
		return "cgDiaodu [id=" + id + ", cgDiaoduId=" + cgDiaoduId + ", cgPlanId=" + cgPlanId + ", product_id="
				+ product_id + ", product_name=" + product_name + ", amount_sum=" + amount_sum + ", price_sun="
				+ price_sun + ", register=" + register + ", register_time=" + register_time + ", checker=" + checker
				+ ", check_tag=" + check_tag + ", check_time=" + check_time + ", onstock_tag=" + onstock_tag + "]";
	}

	
}
