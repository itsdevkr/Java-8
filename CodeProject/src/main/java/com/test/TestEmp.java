package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEmp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Dev", 101);
		Employee e2 = new Employee("Ankit", 103);
		Employee e3 = new Employee("Zunaid", 102);
/*
		Map<String,Integer> map = new HashMap<>();
		map.put(e3.getEname(), e3.getEid());
		map.put(e1.getEname(), e1.getEid());
		map.put(e2.getEname(), e2.getEid());
*/
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e3);list.add(e1);list.add(e2);
		
		list.forEach(t -> {
			System.out.println(t);
		});
	 
		System.out.println("===============================");
		
		List<Employee> collect = list.stream().sorted().collect(Collectors.toList());
		collect.forEach(t -> {
			System.out.println(t);
		});
	}
}
