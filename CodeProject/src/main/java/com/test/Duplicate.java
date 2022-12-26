package com.test;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
	static void findDup(int [] arr, int n) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		map.entrySet().forEach(t -> {
			if(t.getValue()>1) {
				System.out.print(t.getKey());
			}
		});
	}
	public static void main(String[] args) {
		System.out.println(0.1*3 == 0.3);
		int [] arr = {1,2,3,2,5};
		int n = arr.length;
		findDup(arr,n);

	}

}
