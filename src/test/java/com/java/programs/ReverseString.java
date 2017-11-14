package com.java.programs;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println("Reversed : " + (re(s)));
		System.out.println("Reversed : " + (reverse(s)));
		System.out.println("Reversed : " + (reverse_me(s)));
	}

	// Logic3: (Good One)
	static String reverse_me(String s) {
		int l = s.length();
		String rev = "";
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;

	}

	// Logic1 :
	public static StringBuffer re(String s) {
		return (new StringBuffer(s).reverse());
	}

	// Logic2 :
	public static StringBuffer reverse(String s) {
		StringBuffer sout = new StringBuffer("hello").reverse();
		return sout;
	}

}