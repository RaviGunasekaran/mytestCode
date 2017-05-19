package com.java.programs;

public class Triangle5 {

	public static void main(String[] args) {
		print(5);

	}

	public static void print(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
