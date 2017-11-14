package com.seleniumwebdriver.programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class openGoogleLinkTest {

	static WebDriver driver;
	static Actions action;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/rgunasekaran1/Downloads/Installers-All/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		action = new Actions(driver);
		
		driver.get("http://www.bing.com/");
		System.out.println("Google Loaded....");
		driver.findElement(By.id("sb_form_q")).sendKeys("Welcome");
		System.out.println("Welcome text Entered ....");
		driver.findElement(By.xpath(".//*[@id='sb_form_go']")).click();
		System.out.println("Search Button clicked....");
		// String currentHandle = driver.getWindowHandle();
		List<WebElement> list = driver.findElements(By.cssSelector("#ires h3 a"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Link " + i + " is :" + list.get(i).getText());
			action.keyDown(Keys.CONTROL).click(list.get(i)).build().perform();
			System.out.println("Clicked Link...");
			// Set<String> windowHandles = driver.getWindowHandles();
			driver.switchTo().activeElement();
			driver.close();
			driver.switchTo().defaultContent();
			System.out.println("Closed Link...");
		}
		
		driver.quit();
		System.out.println("Closed Driver...");

	}

//	@BeforeTest
//	public void beforeTest() {
//		System.setProperty("webdriver.gecko.driver", "/Users/rgunasekaran1/Downloads/Installers-All/geckodriver");
//		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//		action = new Actions(driver);
//	}
//
//	@Test
//	public void openGoogleLinksTest() { // TODO Not Completed.
//		driver.get("http://www.bing.com/");
//		System.out.println("Google Loaded....");
//		driver.findElement(By.id("sb_form_q")).sendKeys("Welcome");
//		System.out.println("Welcome text Entered ....");
//		driver.findElement(By.xpath(".//*[@id='sb_form_go']")).click();
//		System.out.println("Search Button clicked....");
//		// String currentHandle = driver.getWindowHandle();
//		List<WebElement> list = driver.findElements(By.cssSelector("#ires h3 a"));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("Link " + i + " is :" + list.get(i).getText());
//			action.keyDown(Keys.CONTROL).click(list.get(i)).build().perform();
//			System.out.println("Clicked Link...");
//			// Set<String> windowHandles = driver.getWindowHandles();
//			driver.switchTo().activeElement();
//			driver.close();
//			driver.switchTo().defaultContent();
//			System.out.println("Closed Link...");
//		}
//	}
//
//	@AfterTest
//	public void afterTest() {
//		driver.quit();
//		System.out.println("Closed Driver...");
//	}
}
