package com.teams.pojo;

public class User {

	private int id;
	private String username;
	private String password;
	private String perms;
	
	private int rid;//角色编号
	private String name;//角色名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPerms() {
		return perms;
	}
	public void setPerms(String perms) {
		this.perms = perms;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		super();
	}
	public User(int id, String username, String password, String perms, int rid, String name) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.perms = perms;
		this.rid = rid;
		this.name = name;
	}
	
	
	
	public User(int id, String username, int rid) {
		super();
		this.id = id;
		this.username = username;
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", perms=" + perms + ", rid="
				+ rid + ", name=" + name + "]";
	}
	
	

	
	
	
	
}
