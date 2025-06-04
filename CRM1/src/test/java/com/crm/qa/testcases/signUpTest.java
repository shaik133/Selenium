/**
 * 
 */
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.pages.emailValidate;

/**
 * @author Admin
 *
 */
public class signUpTest extends BasePage{

	HomePage homePage;
	SignupPage signup;
	emailValidate validateEmail;
	public signUpTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		launchBrowser();
		homePage = new HomePage();
		signup=homePage.signUpbtn();
	}
	
	@Test
	public void validateTitle()
	{
		String title= signup.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	@Test
	public void registerEmail() 
	{
		try {
			validateEmail=signup.signup(prop.getProperty("username"), prop.getProperty("phone"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown() 
	{
	driver.close();	
	}
	
}
