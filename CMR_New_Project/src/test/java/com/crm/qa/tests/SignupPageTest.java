/**
 * 
 */
package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.pages.ValidateEmailPage;
import com.crm.qa.pages.crmLandingPage;

/**
 * @author Admin
 *
 */
public class SignupPageTest extends BasePage{

	crmLandingPage landingPage;
	SignupPage signupPage;
	ValidateEmailPage validateEmailPage;
	
	public SignupPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		Launch();
		landingPage=new crmLandingPage();
		signupPage=landingPage.clickSigupBtn();
	}
	
	
	
	
	
	@Test
	public void getRegisterTitleTest()
	{
		Assert.assertTrue(signupPage.registerTitle());
	}
	
	@Test
	public void rightClickOnPhoneTest()
	{
		signupPage.rightClickonphone();
	}
	
	@Test
	public void signupTest() throws InterruptedException
	{
		validateEmailPage=signupPage.signUp(prop.getProperty("username"), prop.getProperty("phone"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
