package com.teams.pojo;

public class permission {
	private int id;
	private String F_ModuleId;
	private String F_ParentId;
	private String F_FullName;
	private String F_UrlAddress;
	private int type;
	
	public permission() {
		super();
	}

	public permission(int id, String f_ModuleId, String f_ParentId, String f_FullName, String f_UrlAddress, int type) {
		super();
		this.id = id;
		F_ModuleId = f_ModuleId;
		F_ParentId = f_ParentId;
		F_FullName = f_FullName;
		F_UrlAddress = f_UrlAddress;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_ModuleId() {
		return F_ModuleId;
	}

	public void setF_ModuleId(String f_ModuleId) {
		F_ModuleId = f_ModuleId;
	}

	public String getF_ParentId() {
		return F_ParentId;
	}

	public void setF_ParentId(String f_ParentId) {
		F_ParentId = f_ParentId;
	}

	public String getF_FullName() {
		return F_FullName;
	}

	public void setF_FullName(String f_FullName) {
		F_FullName = f_FullName;
	}

	public String getF_UrlAddress() {
		return F_UrlAddress;
	}

	public void setF_UrlAddress(String f_UrlAddress) {
		F_UrlAddress = f_UrlAddress;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "permission [id=" + id + ", F_ModuleId=" + F_ModuleId + ", F_ParentId=" + F_ParentId + ", F_FullName="
				+ F_FullName + ", F_UrlAddress=" + F_UrlAddress + ", type=" + type + "]";
	}
	
}
