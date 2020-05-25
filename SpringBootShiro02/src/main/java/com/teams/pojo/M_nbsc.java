package com.teams.pojo;

public class M_nbsc {
    private int id;
    private String did;
    private String pg_id;
    private String product_name;
    private int sc_unit;
    private String product_id;
    private double sc_dj;
    private double sc_zj;
    
	public M_nbsc() {
		super();
	}

	public M_nbsc(int id, String did, String pg_id, String product_name, int sc_unit, String product_id, double sc_dj,
			double sc_zj) {
		super();
		this.id = id;
		this.did = did;
		this.pg_id = pg_id;
		this.product_name = product_name;
		this.sc_unit = sc_unit;
		this.product_id = product_id;
		this.sc_dj = sc_dj;
		this.sc_zj = sc_zj;
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

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public double getSc_dj() {
		return sc_dj;
	}

	public void setSc_dj(double sc_dj) {
		this.sc_dj = sc_dj;
	}

	public double getSc_zj() {
		return sc_zj;
	}

	public void setSc_zj(double sc_zj) {
		this.sc_zj = sc_zj;
	}
	
    
}
