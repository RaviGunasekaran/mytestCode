package com.java.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("C:\\Names.txt");
		Scanner scanner = new Scanner(inputfile);
		while (scanner.hasNext()) {
			System.out.println("Values is :" + scanner.next());
		}

	}

}
