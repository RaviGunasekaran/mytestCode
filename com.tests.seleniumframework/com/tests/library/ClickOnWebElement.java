package com.tests.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickOnWebElement extends WebDriverProvider {
	 WebDriver driver = getDriver();


//	public static void click(By element, WebDriver driver) {
//		writeInfoLogger(driver.getCurrentUrl());
//		driver.findElement(element).click();
//		writeInfoLogger("Clicked on WebElement...");
//	}

	public static void click(By userNameTextBox,WebDriver driver) {
		writeInfoLogger(driver.getCurrentUrl());
		driver.findElement(userNameTextBox).click();
		writeInfoLogger("Clicked on WebElement...");

	}

}
