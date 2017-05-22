package com.selenium.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.webdriver.support.BaseClass;
import com.webdriver.support.WebDriverProvider;

/**
 * 
 * @author rgunasekaran1 This is pageObject for Login Page.
 * @param <T>
 *
 */
public class RegistrationPage extends BaseClass {

	public RegistrationPage() {
		WebDriver driver = (WebDriver) BaseClass.initLogger(this.getClass().getName());
		Logger logger = BaseClass.initLogger(this.getClass().getName());
	}

	@FindBy(css = "")
	private WebElement userNameTextBox;

	void click(WebElement element) {
	}

	// By password = driver
	//
	// @FindBy
	// WebElement passWordTextBox = "";
	//
	// @FindBy
	// WebElement submitButton = "";

}
