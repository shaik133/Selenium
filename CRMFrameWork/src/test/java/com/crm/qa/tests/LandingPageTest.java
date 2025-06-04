/**
 * 
 */
package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basepage.BasePage;
import com.crm.qa.pages.LandingPage;

/**
 * @author Admin
 *
 */
public class LandingPageTest extends BasePage {

	LandingPage landingPage;
	
	
	public LandingPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		launch();
		landingPage = new LandingPage();
	}
	
	@Test
	public void getTitleTest()
	{
		log.info("Fetching the title");
		landingPage.getTitle();
	}
	
	@Test
	public void getLogoTest()
	{
		log.info("Checking the logo is present or not");
		landingPage.getLogo();
	}
	
	@Test
	public void loginClickTest()
	{
		log.info("clicking on the login button present in landing page");
		landingPage.loginClick();
	}
	
	
	@Test
	public void signupClickTest()
	{
		log.info("clicking on the signup button");
		landingPage.signupClick();
	}
	
	@AfterMethod
	public void tearDown()
	{
	
		driver.quit();
		log.info("browser is closed");
	}
}
