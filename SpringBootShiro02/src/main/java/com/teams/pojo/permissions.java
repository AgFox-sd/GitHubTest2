package com.teams.pojo;

public class permissions {

	private int id;
	private String f_ModuleId;
	private String f_ParentId;
	private String f_fullName;
	private String f_UrlAddress;
	private int type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getf_ModuleId() {
		return f_ModuleId;
	}
	public void setf_ModuleId(String f_ModuleId) {
		this.f_ModuleId = f_ModuleId;
	}
	public String getf_ParentId() {
		return f_ParentId;
	}
	public void setf_ParentId(String f_ParentId) {
		this.f_ParentId = f_ParentId;
	}
	public String getf_fullName() {
		return f_fullName;
	}
	public void setf_fullName(String f_fullName) {
		this.f_fullName = f_fullName;
	}
	public String getf_UrlAddress() {
		return f_UrlAddress;
	}
	public void setf_UrlAddress(String f_UrlAddress) {
		this.f_UrlAddress = f_UrlAddress;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public permissions() {
		super();
	}
	public permissions(int id, String f_ModuleId, String f_ParentId, String f_fullName, String f_UrlAddress, int type) {
		super();
		this.id = id;
		this.f_ModuleId = f_ModuleId;
		this.f_ParentId = f_ParentId;
		this.f_fullName = f_fullName;
		this.f_UrlAddress = f_UrlAddress;
		this.type = type;
	}
	@Override
	public String toString() {
		return "permissions [id=" + id + ", f_ModuleId=" + f_ModuleId + ", f_ParentId=" + f_ParentId + ", f_fullName="
				+ f_fullName + ", f_UrlAddress=" + f_UrlAddress + ", type=" + type + "]";
	}
	
	
}
