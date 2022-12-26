package com.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, 29, "Tom", new Address("Stree1", 456));
		Emp e2 = new Emp(4, 12, "Nikhil", new Address("Rome", 856));
		Emp e3 = new Emp(2, 67, "Sobhitha", new Address("Gaya", 356));
		Emp e4 = new Emp(6, 20, "Shnehil", new Address("Patwatoli", 406));
		Emp e5 = new Emp(3, 99, "Bingo", new Address("Varanasi", 675));
		
		List<Emp> list = new ArrayList<>();
		list.add(e5);list.add(e4);list.add(e3);list.add(e2);list.add(e1);
		
		System.out.println("-----------------Unsorted employee list-------------");
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
		System.out.println("----------------Sorted employee list--------------------");
		Collections.sort(list, new EmpComparator());
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}

}
