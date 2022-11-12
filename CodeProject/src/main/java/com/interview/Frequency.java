package com.interview;

import java.util.HashMap;

public class Frequency {

	public static void freq(String s) {

		char[] charArray = s.toCharArray();
		
		HashMap<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (!myMap.containsKey(charArray[i])) {
				myMap.put(charArray[i], 1);
			} else {
				myMap.put(charArray[i], myMap.get(charArray[i]) + 1);
			}
		}

		System.out.println(myMap);
	}

	public static void main(String[] args) {
		String s = "DevKumarIshaKumari";
		freq(s);
	}

}
