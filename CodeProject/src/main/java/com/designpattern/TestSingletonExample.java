package com.designpattern;

public class TestSingletonExample {

	public static void main(String[] args) {
		SingletonExample obj = null;
		obj = SingletonExample.getSingletonExample();
		System.out.println(obj);
		
		SingletonExample obj1 = null;
		obj1 = SingletonExample.getSingletonExample();
		System.out.println(obj1);
		
		System.out.println(obj.equals(obj1));

	}

}
