package com.teams.pojo;
//产品工序表
public class M_design_procedure {
	 private int id;	//序号
	 private String design_id;	//设计编号
	 private int fid; //'产品分类编号',
	  private String product_id;	//产品编号
	  private String product_name;	//产品名称
	  private String procedure_describe;//设计要求
	  private double cost_price_sum;	//工时总成本
	  private double module_cost_price_sum;	//物料总成本
	  private String designer;	//设计人
	  private String register;	//登记人
	  private String register_time;	//登记时间
	  private String checker;	//复核人
	  private String check_time;		//审核时间
	  private String check_suggestion;	//审核意见
	  private String check_tag;	//审核标志S001-0: 等待审核，S001-1: 审核通过，S001-2: 审核不通过
	  private String changer;	//变更人
	  private String change_time;	//变更时间
	  private String change_tag;	//变更标志B002-0: 未变更，B002-1: 已变更
	  private String design_module_tag;	//工序物料设计标志 G002-0: 未设计,G002-1: 已提交,G002-2: 已审核
	  private String design_module_change_tag; //工序物料变更标志 G003-0: 未变更,G003-1: 已变更
	  private String check_yj;
	  private String change_yj;
	  private String wlbg_yj;
	  public M_design_procedure() {
		super();
	  }
	public M_design_procedure(int id, String design_id, int fid, String product_id, String product_name,
			String procedure_describe, double cost_price_sum, double module_cost_price_sum, String designer,
			String register, String register_time, String checker, String check_time, String check_suggestion,
			String check_tag, String changer, String change_time, String change_tag, String design_module_tag,
			String design_module_change_tag, String check_yj, String change_yj,String wlbg_yj) {
		super();
		this.id = id;
		this.design_id = design_id;
		this.fid = fid;
		this.product_id = product_id;
		this.product_name = product_name;
		this.procedure_describe = procedure_describe;
		this.cost_price_sum = cost_price_sum;
		this.module_cost_price_sum = module_cost_price_sum;
		this.designer = designer;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_suggestion = check_suggestion;
		this.check_tag = check_tag;
		this.changer = changer;
		this.change_time = change_time;
		this.change_tag = change_tag;
		this.design_module_tag = design_module_tag;
		this.design_module_change_tag = design_module_change_tag;
		this.check_yj = check_yj;
		this.change_yj = change_yj;
		this.wlbg_yj = wlbg_yj;
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
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
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
	public String getProcedure_describe() {
		return procedure_describe;
	}
	public void setProcedure_describe(String procedure_describe) {
		this.procedure_describe = procedure_describe;
	}
	public double getCost_price_sum() {
		return cost_price_sum;
	}
	public void setCost_price_sum(double cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
	}
	public double getModule_cost_price_sum() {
		return module_cost_price_sum;
	}
	public void setModule_cost_price_sum(double module_cost_price_sum) {
		this.module_cost_price_sum = module_cost_price_sum;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
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
	public String getCheck_suggestion() {
		return check_suggestion;
	}
	public void setCheck_suggestion(String check_suggestion) {
		this.check_suggestion = check_suggestion;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
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
	public String getChange_tag() {
		return change_tag;
	}
	public void setChange_tag(String change_tag) {
		this.change_tag = change_tag;
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
	public String getWlbg_yj() {
		return wlbg_yj;
	}
	public void setWlbg_yj(String wlbg_yj) {
		this.wlbg_yj = wlbg_yj;
	}
	  
}
