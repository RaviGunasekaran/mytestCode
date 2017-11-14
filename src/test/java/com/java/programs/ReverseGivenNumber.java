package com.java.programs;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		int n = 778899;
		System.out.println("ORGINAL : " + n);
		System.out.println("Reversed : " + (reverse(n)));

	}

	public static int reverse(int number) {
		int reverse = 0;
		int remainder = 0;
		do {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;

		} while (number > 0);

		return reverse;
	}

}
