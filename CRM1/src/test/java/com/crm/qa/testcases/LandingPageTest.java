/**
 * 
 */
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

/**
 * @author Admin
 *
 */
public class LandingPageTest extends BasePage {
	
	HomePage homePage;
	LoginPage login;
	LandingPage landingPage;
	CalenderPage calenderPage;
	ContactsPage contactsPage;
	
	public LandingPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() 
	{
		launchBrowser();
		homePage= new HomePage();
		login=homePage.signInbtn();
		landingPage=login.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void getHeaderNameTest()
	{
		boolean header=landingPage.getHeaderName();
		Assert.assertTrue(header,"Header name is not matched");
	}
	
	@Test
	public void getDisplayNameTest()
	{
		boolean displayName=landingPage.getDisplayName();
		Assert.assertTrue(displayName);
		Assert.assertEquals(displayName, "Shaij Jafar");
	}
	
	@Test
	public void clickCalendarTest()
	{
		calenderPage=landingPage.clickCalendarBtn();
	}
	
	@Test
	public void clickContactsTest()
	{
		contactsPage=landingPage.clickcontactBtn();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
