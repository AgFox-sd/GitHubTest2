package com.teams.pojo;

public class brand {
	private int id;
	private String name;
	private String ctime;
	public brand() {
		super();
	}
	public brand(int id, String name, String ctime) {
		super();
		this.id = id;
		this.name = name;
		this.ctime = ctime;
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
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
}
