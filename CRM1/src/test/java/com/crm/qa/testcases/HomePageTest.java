/**
 * 
 */
package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.util.logs;

/**
 * @author Admin
 *
 */
public class HomePageTest extends BasePage {

	public static HomePage homePage;
	public static SignupPage signup;
	public static LoginPage login;
	
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public static void setUp() throws InterruptedException
	{
		logs.startTest("HomePageTest");
		launchBrowser();
		homePage = new HomePage();
	}
	
	
	@Test(priority=1)
	public static void verifyTitleTest()
	{
		logs.info("verifying title");
		String title = homePage.getCRMTitle();
		
		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
		logs.debugg("title verified");
	}
	
	@Test(priority=2)
	public static void verifyLogoTest()
	{
		logs.info("verifying page logo");
		boolean flag= homePage.getLogo();
		Assert.assertTrue(flag);
		logs.debugg("logo verified");
	}
	
	@Test(priority=3)
	public static void signupBtnTest()
	{
		logs.info("verifying signup button");
		signup= homePage.signUpbtn();
	}
	
	@Test(priority=4)
	public static void singinBtn()
	{
		login=homePage.signInbtn();
	}
	
	@AfterMethod
	public void tearOff()
	{
		driver.quit();
	}
}
