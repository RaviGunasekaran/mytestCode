package com.java.programs;

public class Triangle2 {

	public static void main(String[] args) {
		int l = 6;
		for (int i = 0; i < l; i++) {
			int c = i;
			for (int j = 0; j < i + 1; j++) {
				if ((c % 2) == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
				c++;
			}
			System.out.println();
		}
	}

}
