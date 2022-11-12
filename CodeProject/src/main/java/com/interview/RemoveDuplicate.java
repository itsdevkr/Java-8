package com.interview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	static String removeDup(String s) {
		Set<Character> set = new HashSet<>();
		for(int i=0; i<s.length(); i++)
		set.add(s.charAt(i));
		
		
	}
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(removeDup(s));
	}

}
