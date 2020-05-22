package com.teams.pojo;

/*
 * 产品物料组成表
 * */
public class D_module {

	private int id;//'序号',
	private String design_id;//设计编号',
	private String product_id;//'产品编号',
	private String product_name;//产品名称',
	private String designer;//'设计人',
	private String module_describe;//设计要求',
	private double cost_price_sum;//物料总成本',
	private String  register;	// 登记人',
	private String register_time;//'登记时间',
	private String checker;	// ''复核人',
	private String check_time;//复核时间',
	private String changer;// '变更人',
	private String change_time;//'变更时间',
	private String check_tag;//审核标志
	private String change_tag;//变更标志
	
	private String check_yj;//审核意见
	private String change_yj;//变更意见
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
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getModule_describe() {
		return module_describe;
	}
	public void setModule_describe(String module_describe) {
		this.module_describe = module_describe;
	}
	public double getCost_price_sum() {
		return cost_price_sum;
	}
	public void setCost_price_sum(double cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
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
	public String getCheck_time() {
		return check_time;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	public String getChange_time() {
		return change_time;
	}
	public void setChange_time(String change_time) {
		this.change_time = change_time;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public String getChange_tag() {
		return change_tag;
	}
	public void setChange_tag(String change_tag) {
		this.change_tag = change_tag;
	}
	
	public String getCheck_yj() {
		return check_yj;
	}
	public void setCheck_yj(String check_yj) {
		this.check_yj = check_yj;
	}
	public String getChange_yj() {
		return change_yj;
	}
	public void setChange_yj(String change_yj) {
		this.change_yj = change_yj;
	}
	public D_module() {
		super();
	}
	public D_module(int id, String design_id, String product_id, String product_name, String designer,
			String module_describe, double cost_price_sum, String register, String register_time, String checker,
			String check_time, String changer, String change_time, String check_tag, String change_tag, String check_yj,
			String change_yj) {
		super();
		this.id = id;
		this.design_id = design_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.designer = designer;
		this.module_describe = module_describe;
		this.cost_price_sum = cost_price_sum;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.changer = changer;
		this.change_time = change_time;
		this.check_tag = check_tag;
		this.change_tag = change_tag;
		this.check_yj = check_yj;
		this.change_yj = change_yj;
	}
	@Override
	public String toString() {
		return "D_module [id=" + id + ", design_id=" + design_id + ", product_id=" + product_id + ", product_name="
				+ product_name + ", designer=" + designer + ", module_describe=" + module_describe + ", cost_price_sum="
				+ cost_price_sum + ", register=" + register + ", register_time=" + register_time + ", checker="
				+ checker + ", check_time=" + check_time + ", changer=" + changer + ", change_time=" + change_time
				+ ", check_tag=" + check_tag + ", change_tag=" + change_tag + ", check_yj=" + check_yj + ", change_yj="
				+ change_yj + "]";
	}
	
	
	
}
