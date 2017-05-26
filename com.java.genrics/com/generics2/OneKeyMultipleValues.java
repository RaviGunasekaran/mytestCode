package com.generics2;

public class OneKeyMultipleValues<K, T> {

	private K key;
	private T values;

	public T getValues() {
		return values;
	}

	public void setValues(T v) {
		this.values = v;
	}

	public void setKey(K k) {
		this.key = k;
	}

	public K getKey() {
		return key;
	}

}
