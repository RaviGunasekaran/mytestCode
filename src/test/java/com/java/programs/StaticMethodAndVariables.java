package com.java.programs;

public class StaticMethodAndVariables {
	static int variable=1001;
	public static void main(String[] args) {
		System.out.println(variable);
		justPrint();
	}
	
	static void justPrint(){
		System.out.println("I am Static Method");
	}

}
