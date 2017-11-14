package com.java.programs;

import org.apache.commons.codec.binary.Hex;

public class ConvertByteArrayToHexaDecimalArray {

	public static void main(String[] args) {
		String foo = "I am a string";
		byte[] bytes = foo.getBytes();
		System.out.println( Hex.encodeHexString( bytes ) );


	}

}
