package com.salary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSalary {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, 10000.98);
		Employee e2 = new Employee(4, 40000.98);
		Employee e3 = new Employee(2, 16500.98);
		Employee e4 = new Employee(3, 70000.98);
		Employee e5 = new Employee(5, 80000.98);

		List<Employee> list = new ArrayList<>();
		
		list.add(e5);list.add(e4);list.add(e3);list.add(e2);list.add(e1);
		
		//Sort Salary in descending order
		System.out.println("========Salary in descending order==========");
		List<Employee> empListDescBySalary = list.stream().sorted((o1, o2) -> (int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		empListDescBySalary.forEach(t -> System.out.println(t));
		
		//Get Top 3 salary
		System.out.println("========Top 3 Salary==========");
		List<Employee> top3salary = list.stream().sorted((o1, o2) -> (int)(o2.getSalary()-o1.getSalary())).limit(3).collect(Collectors.toList());
		top3salary.forEach(t -> System.out.println(t));
		
		//Get except Top 3 salary
		System.out.println("==========Except Top 3 Salary==========");
		List<Employee> exceptTop3Salary = list.stream().sorted((o1, o2) -> (int)(o2.getSalary()-o1.getSalary())).skip(3).collect(Collectors.toList());
		exceptTop3Salary.forEach(t -> System.out.println(t));
	
		//2nd highest salary
		System.out.println("=============2nd Highest Salary==========");
		Double secHighSalary = list.stream().sorted((o1, o2) -> (int)(o2.getSalary()-o1.getSalary())).skip(1).findFirst().get().getSalary();
		System.out.println(secHighSalary);
	}

}
