package com.selenium.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selenium.pageobjects.RegistrationPage;
import com.webdriver.support.BaseClass;

public class SimpleRegistrationTest extends BaseClass{
	WebDriver driver = getDriver();
	public SimpleRegistrationTest() throws IOException {
		super();
	}

	Logger logger = Logger.getLogger(this.getClass());

	@Test
	public void loginTest() throws IOException {
		System.out.println("This is Login Test...");
		logger.info("This is Login Test...");
		RegistrationPage page = new RegistrationPage();
		page.clickSignOnLink();
		logger.info("Clicking on SignOn Link...");
	}
}
