/**
 * 
 */
package com.academy.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.academy.qa.base.BasePage;
import com.academy.qa.pages.AcademyIndexPage;
import com.academy.qa.pages.LoginPage;

/**
 * @author Admin
 *
 */
public class AcademyIndexTest extends BasePage {

	AcademyIndexPage academyIndexPage;
	LoginPage loginPage;
	
	
	public AcademyIndexTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setup()
	{
		launch();
		academyIndexPage= new AcademyIndexPage();
	}
	
	@Test(priority=1)
	public void getLogoTest()
	{
		log.info("Validating logo is displayed");
		academyIndexPage.getLogo();
	    Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void getTitleTest()
	{
		String title= academyIndexPage.getTitle();	
		Assert.assertEquals(title, "Rahul Shetty Academy");
	}
	
	
	@Test(priority=3)
	public void clickLoginBtnTest()
	{
		
	loginPage=academyIndexPage.clickLoginBtn();
	Assert.assertEquals(driver.getTitle(), "Rahul Shetty Academy");	;
	}
}
