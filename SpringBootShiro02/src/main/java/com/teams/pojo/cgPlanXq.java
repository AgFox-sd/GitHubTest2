package com.teams.pojo;

public class cgPlanXq {

	private int id; //序号
	private String cgPlanId;  //采购计划编号
    private String cgPlanXqId; //采购计划详情编号
	private String product_id;  //产品编号
	private String product_name; //产品名称
	private Double amount; //采购数量
	private String execute_tag; //执行状态 ：已执行   未执行
	
	private String check_time;
	public cgPlanXq() {
		super();
	}
	public cgPlanXq(int id, String cgPlanId, String cgPlanXqId, String product_id, String product_name, Double amount,
			String execute_tag,String check_time) {
		super();
		this.id = id;
		this.cgPlanId = cgPlanId;
		this.cgPlanXqId = cgPlanXqId;
		this.product_id = product_id;
		this.product_name = product_name;
		this.amount = amount;
		this.execute_tag = execute_tag;
		this.check_time = check_time;
	}
	public int getId() {
		return id;
	}
	public String getCgPlanId() {
		return cgPlanId;
	}
	public String getCgPlanXqId() {
		return cgPlanXqId;
	}
	public String getProduct_id() {
		return product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public Double getAmount() {
		return amount;
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
	public void setCgPlanXqId(String cgPlanXqId) {
		this.cgPlanXqId = cgPlanXqId;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setExecute_tag(String execute_tag) {
		this.execute_tag = execute_tag;
	}
	public String getCheck_time() {
		return check_time;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	@Override
	public String toString() {
		return "cgPlanXq [id=" + id + ", cgPlanId=" + cgPlanId + ", cgPlanXqId=" + cgPlanXqId + ", product_id="
				+ product_id + ", product_name=" + product_name + ", amount=" + amount + ", execute_tag=" + execute_tag
				+ ", check_time=" + check_time + "]";
	}
	
	
}
