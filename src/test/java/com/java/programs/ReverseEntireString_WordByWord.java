package com.java.programs;

public class ReverseEntireString_WordByWord {

	public static void main(String[] args) {
		ReverseEntireString_WordByWord o = new ReverseEntireString_WordByWord();
		System.out.println(o.reverse_me("hello"));

		String s = "This is test";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(o.reverse_me(s1[i]) + " ");
		}

	}

	String reverse_me(String s) {
		int l = s.length();
		String rev = "";
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
