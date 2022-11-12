package com.designpattern;

public class SingletonExample {
	private static SingletonExample singleton;
	private SingletonExample() {
		
	}
	
	public static SingletonExample getSingletonExample() {
		if(singleton == null) {
			singleton = new SingletonExample();
		}
		return singleton;
	}
}

/*
	FLAVOURS OF SINGLETON
	1. Normal
	2. Using Synchronized so that only one thread can access the obj at a time.
	   (Not fully synchronized) -> Clone can take place
	   During threading process more obj can be created in different thread.
	3. Using Double Check Locking.
*/