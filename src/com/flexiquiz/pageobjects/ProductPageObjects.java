package com.flexiquiz.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPageObjects 
{
	WebDriver driver;

	public ProductPageObjects(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-product\"]/a")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-product\"]/ul/li[1]/a")
	WebElement quizmaker;
	
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-product\"]/ul/li[4]/a")
	WebElement exambuilder;
	
	public void openQuizMaker()
	{
		product.click();
		quizmaker.click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Quiz maker - FlexiQuiz"))
		{
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
	}
	
	public boolean openExamBuilder()
	{
		product.click();
		exambuilder.click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Exam builder - FlexiQuiz"))
		{
			return true;
		}
		return false;
	}
}
