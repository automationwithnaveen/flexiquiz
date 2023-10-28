package com.flexiquiz.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FeaturesPageObjects 
{
	WebDriver driver;
	public FeaturesPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-features\"]/a")
	WebElement features;
	
	
	public void openFeaturesPage()
	{
		features.click();
		System.out.println(driver.getTitle());
	}
}



