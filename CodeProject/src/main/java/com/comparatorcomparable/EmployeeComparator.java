package com.comparatorcomparable;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int result = 0;
		result = o1.getEmpId().compareTo(o2.getEmpId());
		if(result == 0) {
			result = o1.getEmpName().compareTo(o2.getEmpName());
		}
		return result;
	}

	
}
