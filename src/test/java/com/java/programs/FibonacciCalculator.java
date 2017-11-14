package com.java.programs;

public class FibonacciCalculator {

	public static void main(String[] args) {
		int i, number = 12;
		{
			int fibo1 = 1, fibo2 = 1, fibonacci = 1;
			for (i = 3; i <= number; i++) {
				fibonacci = fibo1 + fibo2; // Fibonacci number is sum of
											// previous two Fibonacci number
				fibo1 = fibo2;
				fibo2 = fibonacci;
				System.out.print(" " + fibonacci);
			}
		}
	}

}
