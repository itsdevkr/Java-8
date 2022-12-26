package com.test;


//We have employee name, id -> Map
//Sort based on names -> Default sorting -> Comparable
public class Employee implements Comparable<Employee>{

	private String ename;
	private Integer eid;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String ename, Integer eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getEname().compareTo(o.getEname());
	}

	
}
