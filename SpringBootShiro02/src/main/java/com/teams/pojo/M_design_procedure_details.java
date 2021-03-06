package com.teams.pojo;
//产品工序明细表
public class M_design_procedure_details {
	  private int id;//序号
	  private String parent_id;//m_design_procedure序号
	  private String procedure_id;//工序编号
	  private double labour_hour_amount;//工时数
	  private String procedure_describe;//工序描述
	  private String amount_unit;//单位
	  private double cost_price;//单位工时成本
	  private double subtotal;//工时成本小计
	  private double module_subtotal;//物料成本小计
	  private String register;//登记人
	  private String register_time;//登记时间
	  private String design_module_tag;//当前工序物料标志 D002-0: 未设计,D002-1: 已设计
	  private String design_module_change_tag;//当前工序物料变更标志  D003-0: 未变更,D003-0: 已变更
	  
	  private String  name;//工序名称
	  
	  private double subtotal_sj;
	  private String dj_jj;
	  private String dj_sh;
	  private String did;
	  
	  
	public M_design_procedure_details() {
		super();
	}


	public M_design_procedure_details(int id, String parent_id, String procedure_id, double labour_hour_amount,
			String procedure_describe, String amount_unit, double cost_price, double subtotal, double module_subtotal,
			String register, String register_time, String design_module_tag, String design_module_change_tag,
			String name, double subtotal_sj, String dj_jj, String dj_sh, String did) {
		super();
		this.id = id;
		this.parent_id = parent_id;
		this.procedure_id = procedure_id;
		this.labour_hour_amount = labour_hour_amount;
		this.procedure_describe = procedure_describe;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.module_subtotal = module_subtotal;
		this.register = register;
		this.register_time = register_time;
		this.design_module_tag = design_module_tag;
		this.design_module_change_tag = design_module_change_tag;
		this.name = name;
		this.subtotal_sj = subtotal_sj;
		this.dj_jj = dj_jj;
		this.dj_sh = dj_sh;
		this.did = did;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getParent_id() {
		return parent_id;
	}


	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}


	public String getProcedure_id() {
		return procedure_id;
	}


	public void setProcedure_id(String procedure_id) {
		this.procedure_id = procedure_id;
	}


	public double getLabour_hour_amount() {
		return labour_hour_amount;
	}


	public void setLabour_hour_amount(double labour_hour_amount) {
		this.labour_hour_amount = labour_hour_amount;
	}


	public String getProcedure_describe() {
		return procedure_describe;
	}


	public void setProcedure_describe(String procedure_describe) {
		this.procedure_describe = procedure_describe;
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


	public double getModule_subtotal() {
		return module_subtotal;
	}


	public void setModule_subtotal(double module_subtotal) {
		this.module_subtotal = module_subtotal;
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


	public String getDesign_module_tag() {
		return design_module_tag;
	}


	public void setDesign_module_tag(String design_module_tag) {
		this.design_module_tag = design_module_tag;
	}


	public String getDesign_module_change_tag() {
		return design_module_change_tag;
	}


	public void setDesign_module_change_tag(String design_module_change_tag) {
		this.design_module_change_tag = design_module_change_tag;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSubtotal_sj() {
		return subtotal_sj;
	}


	public void setSubtotal_sj(double subtotal_sj) {
		this.subtotal_sj = subtotal_sj;
	}


	public String getDj_jj() {
		return dj_jj;
	}


	public void setDj_jj(String dj_jj) {
		this.dj_jj = dj_jj;
	}


	public String getDj_sh() {
		return dj_sh;
	}


	public void setDj_sh(String dj_sh) {
		this.dj_sh = dj_sh;
	}


	public String getDid() {
		return did;
	}


	public void setDid(String did) {
		this.did = did;
	}
	
	
}
