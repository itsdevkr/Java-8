package com.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Shiva", 111, "active", 2000.00));
		empList.add(new Employee(102, "Parvati", 222, "passive", 1100.00));
		empList.add(new Employee(103, "Ankit", 111, "active", 3000.00));
		empList.add(new Employee(104, "Bhola", 333, "passive", 2100.00));
		empList.add(new Employee(105, "Gautam", 444, "active", 2400.00));
		
		System.out.println(empList);
		System.out.println("---------------------Sorted Employee--------------");
		//1. Sort employee based on eid and ename
		Collections.sort(empList, new EmployeeComparator());
		System.out.println(empList);
		
		//2. Sort employee based on salary
		empList.sort((o1, o2) -> {
			if(o1.getSalary()<o2.getSalary()) {
				return -1;
			}else
				return 1;
		});
		
		empList.forEach(element -> {
			System.out.println(element);
		});
		

	}

}
