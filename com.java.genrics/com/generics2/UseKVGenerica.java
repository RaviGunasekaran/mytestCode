package com.generics2;

import java.util.HashMap;

public class UseKVGenerica {

	public static void main(String[] args) {
		OneKeyMultipleValues<Integer, HashMap<Integer, String>> object = new OneKeyMultipleValues<>();
		object.setKey(1);
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(4, "Four Four");
		object.setKey(1);
		object.setValues(hm);
		System.out.println("Key is : "+object.getKey());
		System.out.println("Values are : "+object.getValues());
		System.out.println("Values are : "+object.getValues().get(object.getKey()));
		
	}

}
