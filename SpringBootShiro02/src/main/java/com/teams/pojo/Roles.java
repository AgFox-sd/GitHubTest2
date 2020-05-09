package com.teams.pojo;

public class Roles {

	private int id;//角色编号
	private String name;//角色名称
	
	private int rid;//角色编号
	private String  F_ModuleId;//序号
	private String  F_FullName;//权限名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getF_ModuleId() {
		return F_ModuleId;
	}
	public void setF_ModuleId(String f_ModuleId) {
		F_ModuleId = f_ModuleId;
	}
	public String getF_FullName() {
		return F_FullName;
	}
	public void setF_FullName(String f_FullName) {
		F_FullName = f_FullName;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	public Roles() {
		super();
	}
	public Roles(int id, String name, int rid, String f_ModuleId, String f_FullName) {
		super();
		this.id = id;
		this.name = name;
		this.rid = rid;
		F_ModuleId = f_ModuleId;
		F_FullName = f_FullName;
	}
	@Override
	public String toString() {
		return "Roles [id=" + id + ", name=" + name + ", rid=" + rid + ", F_ModuleId=" + F_ModuleId + ", F_FullName="
				+ F_FullName + "]";
	}
	

	
	
	
	
	
	
}
