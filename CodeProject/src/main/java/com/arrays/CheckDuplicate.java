package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicate {

	static boolean checkDup(int [] arr, int n) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr[i])) { 
				return true;
			}
			map.put(arr[i], null);	
		}
		return false;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,1};
		System.out.println(checkDup(arr, arr.length));
	}

}
