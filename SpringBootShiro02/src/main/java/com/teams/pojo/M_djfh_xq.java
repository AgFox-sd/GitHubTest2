package com.teams.pojo;

public class M_djfh_xq {
    private int id;
    private String did;
    private String procedure_name;
    private String product_id;
    private String product_name;
    private int amount;
    private double cost_price;
    private double subtotal_cbsj;
    
    private int sl;
    
	public M_djfh_xq() {
		super();
	}

	public M_djfh_xq(int id, String did, String procedure_name, String product_id, String product_name, int amount,
			double cost_price, double subtotal_cbsj, int sl) {
		super();
		this.id = id;
		this.did = did;
		this.procedure_name = procedure_name;
		this.product_id = product_id;
		this.product_name = product_name;
		this.amount = amount;
		this.cost_price = cost_price;
		this.subtotal_cbsj = subtotal_cbsj;
		this.sl = sl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getCost_price() {
		return cost_price;
	}

	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}

	public double getSubtotal_cbsj() {
		return subtotal_cbsj;
	}

	public void setSubtotal_cbsj(double subtotal_cbsj) {
		this.subtotal_cbsj = subtotal_cbsj;
	}

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	@Override
	public String toString() {
		return "M_djfh_xq [id=" + id + ", did=" + did + ", procedure_name=" + procedure_name + ", product_id="
				+ product_id + ", product_name=" + product_name + ", amount=" + amount + ", cost_price=" + cost_price
				+ ", subtotal_cbsj=" + subtotal_cbsj + ", sl=" + sl + "]";
	}
	
}
