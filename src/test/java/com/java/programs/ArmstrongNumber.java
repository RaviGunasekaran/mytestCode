package com.java.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			Amstrong1(i);
		}

	}

	private static void Amstrong1(int n) {
		int tmp = n, rem, bal = 0, ams_value = 0;
		do {
			bal = n / 10;
			rem = n % 10;
			ams_value = ams_value + (rem * rem * rem);
			System.out.println("Ams Value :" + ams_value);
			n = bal;
		} while (bal != 0);
		if ((ams_value == tmp)) {
			System.out.println("Amstrong : YES : " + ams_value);
		} else
			System.out.println("Not Amstrong: " + ams_value);
	}
}
