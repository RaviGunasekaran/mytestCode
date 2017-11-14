package com.generics1;

public class UseBox1 {
	public static void main(String[] args) {
		
		
		Box<String> stringBox = new Box<>();
		stringBox.setType("Welcome");
		System.out.println(stringBox.getType());

		Box<Integer> intBox = new Box<>();
		intBox.setType(1);
		System.out.println(intBox.getType());
		
		
		
	}

}
