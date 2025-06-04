/**
 * 
 */
package com.academy.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.academy.qa.base.BasePage;
import com.academy.qa.pages.AcademyHomePage;
import com.academy.qa.pages.AcademyIndexPage;
import com.academy.qa.pages.LoginPage;
import com.academy.qa.utilities.Excell;

/**
 * @author Admin
 *
 */
public class LoginPageTest extends BasePage{

	AcademyIndexPage academyIndexPage;
	LoginPage loginPage;
	AcademyHomePage academyHomePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		launch();
		academyIndexPage= new AcademyIndexPage();
		loginPage=academyIndexPage.clickLoginBtn();
	}
	
	@Test(dataProvider="loginData", dataProviderClass=Excell.class)
	public void loginTest(String username, String password, String exp)
	{
		log.info("Entering email address");
		loginPage.enterEmail(username);
		
		log.info("Entering password");
		loginPage.enterPwd(password);
		
		log.info("submitting login btn");
		academyHomePage=loginPage.clickLogin();
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Rahul Shetty Academy";
		
		if(exp.equals("valid"))
		{
			if(actualTitle.equals(expectedTitle))
			{
				
				driver.findElement(By.xpath("//span[@class='navbar-current-user']")).click();
				driver.findElement(By.xpath("//li[@class='user-signout']")).click();
				Assert.assertTrue(true);
				
				System.out.println("The login test case is passed with valid credentials");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("The login test case is failed with valid credentials");
			}
		}
		else if(exp.equals("invalid"))
		{
			if(actualTitle.equals(expectedTitle))
			{
				driver.findElement(By.xpath("//span[@class='navbar-current-user']")).click();
				driver.findElement(By.xpath("//li[@class='user-signout']")).click();
				Assert.assertTrue(false);
				System.out.println("The login test case  failed as login is success with invalid credentials");
			}
			else
			{
				Assert.assertTrue(true);
				System.out.println("The login test case  passed as login is failed with invalid credentials");	
			}
		}
	}
	@Test
	public AcademyHomePage loginTest(String username, String password)
	{
		log.info("Entering email address");
		loginPage.enterEmail(username);
		
		log.info("Entering password");
		loginPage.enterPwd(password);
		
		log.info("submitting login btn");
		return academyHomePage=loginPage.clickLogin();
		
	}
}
