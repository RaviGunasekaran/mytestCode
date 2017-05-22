package com.selenium.pageobjects;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tests.library.BaseClass;
import com.tests.library.WebDriverProvider;
/**
 * 
 * @author rgunasekaran1
 * This is pageObject for Login Page.
 * @param <T>
 *
 */
public class LoginPage extends BaseClass{
	
	public LoginPage() {
		WebDriver driver = (WebDriver) BaseClass.initLogger(this.getClass().getName());
		Logger logger = BaseClass.initLogger(this.getClass().getName());
	}
	
	@FindBy(css="")
	private WebElement userNameTextBox;
	
	void click(WebElement element){
		lo
	}
	
//	By password = driver
//
//	@FindBy
//	WebElement passWordTextBox = "";
//
//	@FindBy
//	WebElement submitButton = "";

}
