package com.teams.pojo;

public class M_djfh {
    private int id;
    private String did;
    private String design_id;
    private String procedure_name;
    private double subtotal_sj;
    private String dj_jj;
    private String dj_sh;
	public M_djfh() {
		super();
	}
	public M_djfh(int id, String did, String design_id, String procedure_name, double subtotal_sj, String dj_jj,
			String dj_sh) {
		super();
		this.id = id;
		this.did = did;
		this.design_id = design_id;
		this.procedure_name = procedure_name;
		this.subtotal_sj = subtotal_sj;
		this.dj_jj = dj_jj;
		this.dj_sh = dj_sh;
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
	public String getDesign_id() {
		return design_id;
	}
	public void setDesign_id(String design_id) {
		this.design_id = design_id;
	}
	public String getProcedure_name() {
		return procedure_name;
	}
	public void setProcedure_name(String procedure_name) {
		this.procedure_name = procedure_name;
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
	@Override
	public String toString() {
		return "M_djfh [id=" + id + ", did=" + did + ", design_id=" + design_id + ", procedure_name=" + procedure_name
				+ ", subtotal_sj=" + subtotal_sj + ", dj_jj=" + dj_jj + ", dj_sh=" + dj_sh + "]";
	}
    
}
