package com.pack2;

import com.pack1.Pack1_Class1;

public class Pack2_Class1 extends Pack1_Class1{

	public static void main(String[] args) {
		System.out.println("Pack2_Class1");
		Pack2_Class1 obj_Pack2_Class1 = new Pack2_Class1();
		obj_Pack2_Class1.protected_variable="Welcome";
		obj_Pack2_Class1.public_variable="Welcome2";
		obj_Pack2_Class1.printMe();
	}

}
