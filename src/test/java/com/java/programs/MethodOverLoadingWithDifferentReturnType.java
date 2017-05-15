package com.java.programs;

public class MethodOverLoadingWithDifferentReturnType {

	public static void main(String[] args) {
		MethodOverLoadingWithDifferentReturnType obj = new MethodOverLoadingWithDifferentReturnType();
		System.out.println(obj.m1(1));
		System.out.println(obj.m1(""));
	}

	/*
	 * THis Code will give compilation error. 
	 * 
	 * int method(){ return 0; }
	 * 
	 * String method(){ return null; }
	 */
	
	// This code will work fine.
	String m1(String s){
		return "I am String";
	}
	
	int m1(int i){
		return 100;
	}
	
}
