package com.strings;

public class Pallindrome {

	static boolean isPallindrome(String s) {
		char [] temp = s.toCharArray();
		String rev = "";
		for(int i=temp.length-1; i>=0; i--) {
			rev = rev+temp[i];
		}
		
		if(s.equals(rev)) {
			return true;
		}else
			return false;
		
	}
	public static void main(String[] args) {
		String s = "racecar";
		System.out.println(isPallindrome(s));
	}

}
