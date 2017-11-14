package com.java.programs;

public class SortAnIntergerArray2_WithoutPredefinedMethod {

	public static void main(String[] args) {
		int[] a = { 5, 4, 1, 78, 985, 4, 45454, 87 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[j];// System.out.println("T :"+t);
					a[j] = a[i];
					a[i] = t;
					t = 0;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println("Out : " + i + " " + a[i]);
		}

	}

}
