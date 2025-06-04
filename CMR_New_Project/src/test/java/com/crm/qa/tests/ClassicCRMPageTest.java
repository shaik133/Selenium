/**
 * 
 */
package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.pages.ClassicCRMPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.crmLandingPage;

/**
 * @author Admin
 *
 */
public class ClassicCRMPageTest extends BasePage {
	crmLandingPage landingPage;
	LoginPage loginPage;
	ClassicCRMPage classicCrmPage;
	HomePage homePage;
	
	ClassicCRMPageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void setup()
	{
		Launch();
		landingPage= new crmLandingPage();
		loginPage=landingPage.clickLoginBtn();
		classicCrmPage=loginPage.classicCRM();
	}
	
	@Test(priority=1)
	public void getPageTitleTest()
	{
		String title=classicCrmPage.getPageTitle();
		Assert.assertEquals(title, "CRMPRO Log In Screen");
	}
	
	@Test(priority=2)
	public void getPageLogo()
	{
		Assert.assertTrue(classicCrmPage.getLogo(), "Logo is not dislayed");
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		landingPage=classicCrmPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
