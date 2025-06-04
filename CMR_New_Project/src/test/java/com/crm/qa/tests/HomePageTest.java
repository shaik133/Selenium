/**
 * 
 */
package com.crm.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.pages.CalendarPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.crmLandingPage;
import com.crm.qa.utils.Utilities;
import com.crm.qa.utils.logs;

/**
 * @author Admin
 *
 */
public class HomePageTest extends BasePage {

	public crmLandingPage landingPage;
	public LoginPage loginPage;
	public HomePage homePage;
	public CalendarPage calendarPage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		
		log.info("Launching Browser");
		Launch();
		landingPage= new crmLandingPage();
	loginPage=landingPage.clickLoginBtn();
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test
	public void getHeaderNameTest()
	{
		
		Assert.assertTrue(homePage.getHeaderName(), "Header name is not displayed");
		log.info("header is displayed");
	}
	
	
	@Test
	public void getDisplayNameTest()
	{
		log.debug("fetching the display name");
		Assert.assertTrue(homePage.getDispalayName(), "Dispalay name is not displayed");
		log.info("Display name is matched");
	}
	
	@Test
	public void CalendarBtnTest()
	{
		log.info("ready to click on the calendar button");
		Utilities.click(driver, driver.findElement(By.cssSelector("i[class='calendar icon']")));
		calendarPage=homePage.addCalendarBtn();
		
	}
	
	
	
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
		log.info("browser is closed successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
}


