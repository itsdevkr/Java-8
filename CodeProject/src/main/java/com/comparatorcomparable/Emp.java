package com.comparatorcomparable;

public class Emp {
	private int id;
	private int age;
	private String name;
	private Address address;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, int age, String name, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
