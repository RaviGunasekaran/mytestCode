package com.java.programs;

public class Triangle1 {

	public static void main(String[] args) {
		// STAR Triangle - ORDER ONE
		int no = 5;
		for (int i = 0; i < no; i++) {
			String s2 = "";
			for (int j = 0; j < i + 1; j++) {
				s2 = s2 + "*";
			}
			System.out.println(s2);
		}

	}

}
