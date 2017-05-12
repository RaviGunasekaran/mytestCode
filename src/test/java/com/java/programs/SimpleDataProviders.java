package com.java.programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProviders {

	@DataProvider(name="welcome")
	public Object[][] testmydata() {
		System.out.println("You are inside TESTER data provider");
		Object[][] data = new Object[1][2];
		data[0][0] = "Ravi";
		data[0][1] = 33;
		return data;
	}

	@Test(dataProvider = "welcome")
	public void DataProviders(String name, int age) {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
}
