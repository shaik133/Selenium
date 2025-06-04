/**
 * 
 */
package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.actionDriver.Action;
import com.crm.qa.basepage.BasePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.SignupPage;

/**
 * @author Admin
 *
 */
public class SignupPageTest extends BasePage {

	LandingPage landingPage;
	SignupPage signupPage;
	HomePage homePage;
	public SignupPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launch();
		 landingPage= new LandingPage();
		 signupPage=landingPage.signupClick();
	}
	
	@Test
	public void getTitle()
	{
		
		signupPage.getTitle();
		Assert.assertTrue(false);
	}
	
	@Test
	public void signupTest()
	{
		homePage=signupPage.signUp(prop.getProperty("username"), prop.getProperty("phone"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
