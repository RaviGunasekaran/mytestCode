package com.selenium.pageobjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.webdriver.support.BaseClass;

/**
 * 
 * @author rgunasekaran1 This is pageObject for Login Page.
 * @param <T>
 *
 */
public class RegistrationPage extends BaseClass {

	public RegistrationPage() throws IOException {
		super();
	}

	Logger logger = Logger.getLogger(this.getClass());

	@FindBy(css = "")
	private WebElement userNameTextBox;
	
	By signOnLink = By.linkText("SIGN-ON");

	public void clickRegistrationLink() {
		logger.info("Inside clickRegistrationLink...");
		click(userNameTextBox);
	}
	
	public void clickSignOnLink() {
		logger.info("Inside clickSignOnLink...");
		click(signOnLink);
	}

}
