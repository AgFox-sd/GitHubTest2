package com.teams.pojo;

public class user_role {

	private int urid;
	private int uid;
	private int rid;
	public int getUrid() {
		return urid;
	}
	public void setUrid(int urid) {
		this.urid = urid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public user_role() {
		super();
	}
	public user_role(int urid, int uid, int rid) {
		super();
		this.urid = urid;
		this.uid = uid;
		this.rid = rid;
	}
	
	
	public user_role(int uid, int rid) {
		super();
		this.uid = uid;
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "user_role [urid=" + urid + ", uid=" + uid + ", rid=" + rid + "]";
	}
	
	
}
