package com.java.programs;

public class Triangle3 {

	public static void main(String[] args) {
		int no = 5;
		// STAR Triangle - ORDER TWO (Reverse Order)
		for (int i = 0; i < no; i++) {
			String s1 = "";
			for (int j = i; j < no; j++) {
				s1 = s1 + "*";
			}
			System.out.println(s1);
		}
	}

}
