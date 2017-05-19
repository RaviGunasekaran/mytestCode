package com.java.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecialCharactersUsingRegEx {

	public static void main(String[] args) {
		String c = "Apple#!@$%^&*()_+";
		Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
		Matcher match = pt.matcher(c);
		while (match.find()) {
			String s = match.group();
			c = c.replaceAll("\\" + s, "");
		}
		System.out.println(c);
	}

}
