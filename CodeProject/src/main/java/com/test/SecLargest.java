package com.test;

import java.util.PriorityQueue;

public class SecLargest {

	static int test(int [] arr, int n) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<2; i++) {
			pq.add(arr[i]);
		}
		
		for(int i=2; i<n; i++) {
			if(pq.peek()<arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		
		return pq.peek();
		
	}
	public static void main(String[] args) {
		int [] arr = {3,6,1,2,0,5}; //o/p => 5
		int n = arr.length;
		
		System.out.println(test(arr,n));
	}

}
