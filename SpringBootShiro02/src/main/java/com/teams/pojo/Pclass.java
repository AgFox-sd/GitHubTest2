package com.teams.pojo;
/*
 * 产品档次
 */
public class Pclass {

	private int pid;
	private String pname;
	public Pclass() {
		super();
	}
	public Pclass(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int id) {
		this.pid = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	

}
