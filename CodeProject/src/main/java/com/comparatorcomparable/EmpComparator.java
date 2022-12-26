package com.comparatorcomparable;

import java.util.Comparator;

public class EmpComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		int res = 0;
		res = o1.getAge()-o2.getAge();
		if(res==0) {
			res = o1.getName().compareTo(o2.getName());
		}
		return res;
	}
	
}
