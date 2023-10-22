package com.flexiquiz.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseScript 
{
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("I am Before Test");
		driver = new ChromeDriver();
	    driver.get("https://www.flexiquiz.com/");
	    driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void quitBrowser() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
