package com.java.programs;

public class ThrowException {

	public static void main(String[] args) {
		int i = 500;
		if (i <= 0 | i > 100) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			System.out.println(" Output : I => " + i);
		}
	}

}
