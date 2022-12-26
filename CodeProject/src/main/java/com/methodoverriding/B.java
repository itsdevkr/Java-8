package com.methodoverriding;

class A{
	static void m1() {
		System.out.println("m1() method of A class");
	}
}
public class B extends A{
	static void m1() {
		System.out.println("m1() method of B class");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
