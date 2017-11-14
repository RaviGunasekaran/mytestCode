package com.java.programs;

public class StringTests {
	// Format Given Value in String 
	public static void main(String[] args) {
		String adminServletSQLUrl = "https://admin.%s.qbo.ie.intuit.com/qbo%s/sql";
		System.out.println("Welcome");
		System.out.println("Before Formatting");
		System.out.println(adminServletSQLUrl);
		System.out.println("After Replacing values");
		System.out.println(String.format(adminServletSQLUrl, "ie",6));
		System.out.println("END");
	}

}
