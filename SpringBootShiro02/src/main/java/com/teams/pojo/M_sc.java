package com.teams.pojo;

public class M_sc {
     private int id;
     private String design_id;
     private String procedure_name;
     private String did;
     private int dj_tcsl;
     private String dj_sh;
	public M_sc() {
		super();
	}
	public M_sc(int id, String design_id, String procedure_name, String did, int dj_tcsl, String dj_sh) {
		super();
		this.id = id;
		this.design_id = design_id;
		this.procedure_name = procedure_name;
		this.did = did;
		this.dj_tcsl = dj_tcsl;
		this.dj_sh = dj_sh;
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
	public String getProcedure_name() {
		return procedure_name;
	}
	public void setProcedure_name(String procedure_name) {
		this.procedure_name = procedure_name;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public int getDj_tcsl() {
		return dj_tcsl;
	}
	public void setDj_tcsl(int dj_tcsl) {
		this.dj_tcsl = dj_tcsl;
	}
	public String getDj_sh() {
		return dj_sh;
	}
	public void setDj_sh(String dj_sh) {
		this.dj_sh = dj_sh;
	}
	@Override
	public String toString() {
		return "M_sc [id=" + id + ", design_id=" + design_id + ", procedure_name=" + procedure_name + ", did=" + did
				+ ", dj_tcsl=" + dj_tcsl + ", dj_sh=" + dj_sh + "]";
	}
	
}
