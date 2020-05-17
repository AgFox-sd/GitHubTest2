package com.teams.pojo;

public class m_pg {
    private int id;
    private String jhdbh;
    private String pg_id;
    private String product_id;
    private String product_name;
    private String pg_ren;
    private String check_tag;
    private int amount;
    private int hgsl;
    private String pg_time;
    private String pg_zt;
    
    
    private int sc_unit;
    
    
	public m_pg() {
		super();
	}


	public m_pg(int id, String jhdbh, String pg_id, String product_id, String product_name, String pg_ren,
			String check_tag, int amount, int hgsl,String pg_time, String pg_zt, int sc_unit) {
		super();
		this.id = id;
		this.jhdbh = jhdbh;
		this.pg_id = pg_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.pg_ren = pg_ren;
		this.check_tag = check_tag;
		this.amount = amount;
		this.hgsl=hgsl;
		this.pg_time = pg_time;
		this.pg_zt = pg_zt;
		this.sc_unit = sc_unit;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getJhdbh() {
		return jhdbh;
	}


	public void setJhdbh(String jhdbh) {
		this.jhdbh = jhdbh;
	}


	public String getPg_id() {
		return pg_id;
	}


	public void setPg_id(String pg_id) {
		this.pg_id = pg_id;
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


	public String getPg_ren() {
		return pg_ren;
	}


	public void setPg_ren(String pg_ren) {
		this.pg_ren = pg_ren;
	}


	public String getCheck_tag() {
		return check_tag;
	}


	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getPg_time() {
		return pg_time;
	}


	public void setPg_time(String pg_time) {
		this.pg_time = pg_time;
	}


	public String getPg_zt() {
		return pg_zt;
	}


	public void setPg_zt(String pg_zt) {
		this.pg_zt = pg_zt;
	}


	public int getSc_unit() {
		return sc_unit;
	}


	public void setSc_unit(int sc_unit) {
		this.sc_unit = sc_unit;
	}


	public int getHgsl() {
		return hgsl;
	}


	public void setHgsl(int hgsl) {
		this.hgsl = hgsl;
	}


	@Override
	public String toString() {
		return "M_pg [id=" + id + ", jhdbh=" + jhdbh + ", pg_id=" + pg_id + ", product_id=" + product_id
				+ ", product_name=" + product_name + ", pg_ren=" + pg_ren + ", check_tag=" + check_tag + ", amount="
				+ amount + ", pg_time=" + pg_time + ", pg_zt=" + pg_zt + ", sc_unit=" + sc_unit + "]";
	}
	
    
}
