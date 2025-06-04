/**
 * 
 */
package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.ForgotPasswrd;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

/**
 * @author Admin
 *
 */
public class LoginPageTest extends BasePage {

	public  LoginPage login;
	public  LandingPage landingPage;
	public ForgotPasswrd forgotPwd;
	public  HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@Test
	public void login()
	{
		landingPage=login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void forgotPwd()
	
	{
		forgotPwd=login.forgotPwd();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
