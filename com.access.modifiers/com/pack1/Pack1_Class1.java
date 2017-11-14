package com.pack1;

import com.pack2.Pack2_Class1;

public class Pack1_Class1 {

	String default_variable = "Pack1_Class1_default_variable";
	private String private_variable = "Pack1_Class1_private_variable";
	public String public_variable = "Pack1_Class1_public_variable";
	protected String protected_variable = "Pack1_Class1_protected_variable";

	public static void main(String[] args) {
		System.out.println("Pack1_Class1");
		Pack1_Class1 objPack1_Class1 = new Pack1_Class1();
		objPack1_Class1.printMe();
	}

	protected void printMe() {
		System.out.println(default_variable);
		System.out.println(private_variable);
		System.out.println(public_variable);
		System.out.println(protected_variable);
		System.out.println("Called Class Name: "+this.getClass().getName());
	}
	void callme(){
		System.out.println("Called you...");
	}
}
