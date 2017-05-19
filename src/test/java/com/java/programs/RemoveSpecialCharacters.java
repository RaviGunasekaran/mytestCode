package com.java.programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		char check1 = '@';
		char check2 = '.';
		String email = "test123@acusis.com";
		System.out.println("email = " + email);
		char[] c = email.toCharArray();
		String cout = "";
		for (char c1 : c) {
			if ((c1 != check1) && (c1 != check2)) {
				cout = cout + c1;
			}
			System.out.println("Char :" + cout);
		}

	}

}
