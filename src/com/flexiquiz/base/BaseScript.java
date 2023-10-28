package com.flexiquiz.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseScript 
{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		driver = new ChromeDriver();
	    driver.get("https://www.flexiquiz.com/");
	    driver.manage().window().maximize();
	}
	
	public void goBack()
	{
		driver.navigate().back();
	}
	
	
	public void goForward()
	{
		driver.navigate().forward();
	}
	
	
	public void navigateTo(String URL)
	{
		driver.navigate().to(URL);
	}
	
	@AfterTest
	public void quitBrowser() throws Exception
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
