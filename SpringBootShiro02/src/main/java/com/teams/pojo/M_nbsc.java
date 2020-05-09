package com.teams.pojo;

public class M_nbsc {
    private int id;
    private String did;
    private String pg_id;
    private String product_name;
    private int sc_unit;
	public M_nbsc() {
		super();
	}
	public M_nbsc(int id, String did, String pg_id, String product_name, int sc_unit) {
		super();
		this.id = id;
		this.did = did;
		this.pg_id = pg_id;
		this.product_name = product_name;
		this.sc_unit = sc_unit;
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
	public String getPg_id() {
		return pg_id;
	}
	public void setPg_id(String pg_id) {
		this.pg_id = pg_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getSc_unit() {
		return sc_unit;
	}
	public void setSc_unit(int sc_unit) {
		this.sc_unit = sc_unit;
	}
	@Override
	public String toString() {
		return "M_nbsc [id=" + id + ", did=" + did + ", pg_id=" + pg_id + ", product_name=" + product_name
				+ ", sc_unit=" + sc_unit + "]";
	}
    
}
