/**
 * 
 */
package com.myntraproject.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntraproject.qa.base.BasePage;
import com.myntraproject.qa.pages.LoginPage;
import com.myntraproject.qa.pages.MyntraHomePage;

/**
 * @author Admin
 *
 */
public class MyntraHomePageTest extends BasePage {

	MyntraHomePage myntraHomePage;
	LoginPage loginPage;
	
	public MyntraHomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		log.info("Browser is launching");
		launch();
		 myntraHomePage = new MyntraHomePage();
	}
	
	@Test(priority=1)
	public void getLogoTest()
	{
	log.info("Validating logo is displayed");
	Assert.assertTrue(myntraHomePage.isLogoDisplayed());
	
	log.info("Validating title of the page");
	String title=myntraHomePage.getTitle();
	Assert.assertEquals(title, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	}
	
	@Test(priority=2)
	public void loginBtnClickTest()
	{
		
		log.info("Performing mouse hover action on profile");
		myntraHomePage.hoverOverProfile();
		
		log.info("Performing click action on signin btn");
		loginPage=myntraHomePage.clickLoginBtn();
		String title =driver.getTitle();
		Assert.assertEquals(title, "Myntra");
	}
	
	
	
}
