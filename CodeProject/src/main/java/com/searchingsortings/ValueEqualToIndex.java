package com.searchingsortings;

import java.util.ArrayList;

public class ValueEqualToIndex {
	static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
        	if(arr[i]==i+1) {
        		list.add(arr[i]);
        	}
        }
		return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15, 2, 45, 12, 7};
		int n = arr.length;
		
		System.out.println(valueEqualToIndex(arr, n));
	}

}
