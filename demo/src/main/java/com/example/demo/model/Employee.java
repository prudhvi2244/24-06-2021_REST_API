package com.example.demo.model;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer eid, String ename, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
	}

	
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	private Integer eid;
	private String ename;
	private String ecity;

}
