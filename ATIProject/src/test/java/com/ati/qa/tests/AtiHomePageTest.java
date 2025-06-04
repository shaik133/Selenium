/**
 * 
 */
package com.ati.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ati.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class AtiHomePageTest extends BasePage {

	AtiHomePageTest atiHomePageTest;
	
	public AtiHomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launch();
		atiHomePageTest =new AtiHomePageTest();
	}
	
	@Test
	public boolean getLogoTest()
	{
		boolean flag=atiHomePageTest.getLogoTest();
		Assert.assertTrue(flag);
		return flag;
	}
}
