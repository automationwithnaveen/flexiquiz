package com.flexiquiz.tests;

import org.testng.annotations.Test;

import com.flexiquiz.base.BaseScript;
import com.flexiquiz.pageobjects.FeaturesPageObjects;

public class FeaturesTest extends BaseScript
{
	@Test
	public void openFeatures()
	{
		FeaturesPageObjects features = new  FeaturesPageObjects(driver);
		features.openFeaturesPage();
	}
	
}
