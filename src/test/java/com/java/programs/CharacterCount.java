package com.java.programs;


import java.util.Map;
import java.util.TreeMap;

public class CharacterCount {

	public static void main(String[] args) {
		String string = "cabdades";
		char[] chr = string.toCharArray();
		System.out.println(chr);
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (char c : chr) {
			if (map != null && map.size() > 0 && map.containsKey(c)) {
				int i = map.get(c);
				map.put(c, ++i);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
