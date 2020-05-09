package com.teams.pojo;

public class permissions_role {

	
	private int rpid;
	private int rid;
	private int pid;
	
	private int id;//角色id
	private String name;//角色名
	
	public int getRpid() {
		return rpid;
	}
	public void setRpid(int rpid) {
		this.rpid = rpid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
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
	public permissions_role() {
		super();
	}
	public permissions_role(int rpid, int rid, int pid, int id, String name) {
		super();
		this.rpid = rpid;
		this.rid = rid;
		this.pid = pid;
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "permissions_role [rpid=" + rpid + ", rid=" + rid + ", pid=" + pid + ", id=" + id + ", name=" + name
				+ "]";
	}


	
	
	
}
