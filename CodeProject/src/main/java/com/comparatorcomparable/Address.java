package com.comparatorcomparable;

public class Address implements Comparable<Address> {
	private String streetName;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String streetName, int pincode) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + "]";
	}

	@Override
	public int compareTo(Address o) {
		return this.pincode - o.pincode;
	}

}
