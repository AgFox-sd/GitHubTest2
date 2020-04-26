package com.teams.pojo;
/*
 * 产品分类
 */
public class Feilei {

	private int fid;
	private String fname;
	public Feilei() {
		super();
	}
	public Feilei(int fid, String fname) {
		super();
		this.fid = fid;
		this.fname = fname;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int id) {
		this.fid = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	

}
