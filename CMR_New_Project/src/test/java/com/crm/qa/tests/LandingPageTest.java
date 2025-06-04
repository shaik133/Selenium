/**
 * 
 */
package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.pages.crmLandingPage;

/**
 * @author Admin
 *
 */
public class LandingPageTest extends BasePage{

	public crmLandingPage landingPage;
	public LoginPage loginPage;
	public SignupPage signupPage;
	
	public LandingPageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		Launch();
		 landingPage= new crmLandingPage();
	}
	
	@Test
	public void getPageTitleTest()
	{
		String title=landingPage.getPageTitle();
		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
		
	}
	
	@Test
	public void getLogoTest()
	{
		landingPage.getLogo();
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void clickLoginBtnTest()
	{
		loginPage=landingPage.clickLoginBtn();
	}
	
	@Test
	public void clickSignupBtnTest()
	{
		signupPage=landingPage.clickSigupBtn();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
