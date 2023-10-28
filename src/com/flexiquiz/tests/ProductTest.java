package com.flexiquiz.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.flexiquiz.base.BaseScript;
import com.flexiquiz.pageobjects.ProductPageObjects;

public class ProductTest extends BaseScript
{
	@Test
	public void openProductPage()
	{
		ProductPageObjects ppo = new ProductPageObjects(driver);
		ppo.openQuizMaker();
		boolean res = ppo.openExamBuilder();
		Assert.assertTrue(res);
	}
}
