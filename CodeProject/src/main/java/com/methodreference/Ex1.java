package com.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {

	public static int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
	
	public static int compareByAge(Person a, Person b) {
		return a.getAge().compareTo(b.getAge());
	}
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		Person p1 = new Person("Vicky", 23);
		Person p2 = new Person("Shalini", 24);
		Person p3 = new Person("Rishi", 21);
		
		list.add(p1);list.add(p2);list.add(p3);
		
		Collections.sort(list, Ex1::compareByName);
		list.stream().map(t -> t.getName()).forEach(System.out::println);
		
	}

}
