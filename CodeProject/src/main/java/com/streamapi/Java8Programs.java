package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Programs {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Shiva", 111, "active", 2000));
		empList.add(new Employee(102, "Parvati", 222, "passive", 1100));
		empList.add(new Employee(103, "Ankit", 111, "active", 3000));
		empList.add(new Employee(104, "Bhola", 333, "passive", 2100));
		empList.add(new Employee(105, "Gautam", 444, "active", 2400));
		
		
		//To print employee details based on department
		empList.stream().collect(Collectors.groupingBy(Employee::getDeptId)).
				forEach((t, u) ->System.out.println("DeptId->"+t+"empDep"+u) );
		
		//Employee count working in each department
		System.out.println("Department wise count of Employee");
		Map<Integer, Long> empCountDeptWise = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
		empCountDeptWise.entrySet().forEach(emp -> {
			System.out.println("DeptId: "+emp.getKey()+","+emp.getValue());
		});
		
		//Employee with 2nd highest salary
		Map<Integer, List<Employee>> SecHighest = empList.stream().collect(Collectors.groupingBy(Employee::getSalary)).forEach((t, u) -> {
			System.out.print(t.get);
		});;

	}
}
