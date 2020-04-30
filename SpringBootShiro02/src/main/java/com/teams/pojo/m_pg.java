package com.teams.pojo;

//生产派工单计划表
public class m_pg {
	
	private int id;//编号
	private String  pg_id;   //派工单编号
	private String product_id;//产品编号 
	private String product_name;//产品名称
	private String pg_ren;//工单制定人 
	private String check_tag;//审核标志   
	private int amount;//数量
	private String pg_time;//派工时间
	private String  pg_zt;//生产状态
	
	private String jhdbh;

	public m_pg() {
		super();
	}

	public m_pg(int id, String pg_id, String product_id, String product_name, String pg_ren, String check_tag,
			int amount, String pg_time, String pg_zt, String jhdbh) {
		super();
		this.id = id;
		this.pg_id = pg_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.pg_ren = pg_ren;
		this.check_tag = check_tag;
		this.amount = amount;
		this.pg_time = pg_time;
		this.pg_zt = pg_zt;
		this.jhdbh = jhdbh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getJhdbh() {
		return jhdbh;
	}

	public void setJhdbh(String jhdbh) {
		this.jhdbh = jhdbh;
	}
	
	
	
}