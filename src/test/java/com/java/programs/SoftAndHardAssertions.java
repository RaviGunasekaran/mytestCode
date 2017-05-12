package com.java.programs;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertions {
	@Test
	public void SoftAssertions() {
		System.out.println("This is Soft Asssertions");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Acutual", "Expcted", "Not matching!!");
		System.out.println("Step1 completed...");
		sa.assertEquals("Acutual", "Acutual", "matching!!");
		System.out.println("Step2 completed...");
		sa.assertAll();
	}
}
