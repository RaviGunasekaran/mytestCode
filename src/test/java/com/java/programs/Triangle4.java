package com.java.programs;

public class Triangle4 {

	public static void main(String[] args) {
		int count = 7;
		for (int i = 0; i < count; i++) {
			String s = "";
			for (int j = i; j <= count; j++) {
				s = s + "X ";
			}
			if (!((i % 2) == 0)) {
				System.out.println(s);
			}
		}
		System.out.println("X");

	}

}
