package com.strings;

public class ReverseSentence {

	static String rev(String s) {
		int length = s.length();
		String res = "";
		for (int i = length - 1; i >= 0; i--) {
			res = res + s.charAt(i);
		}
		return res;
	}

	static String reverse(String s) {

		String[] split = s.split(" ");

		String result = "";
		for (String string : split) {
			result = result + rev(string) + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen = "This is hello world..!!";
		System.out.println(reverse(sen));

	}

}
