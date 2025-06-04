/**
 * 
 */
package com.academy.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.academy.qa.base.BasePage;
import com.academy.qa.pages.AcademyHomePage;
import com.academy.qa.pages.AcademyIndexPage;
import com.academy.qa.pages.LoginPage;
import com.academy.qa.pages.PracticePage;

/**
 * @author Admin
 *
 */
public class AcademyHomePageTest extends BasePage{

	AcademyIndexPage academyIndexPage;
	LoginPage loginPage;
	LoginPageTest loginPageTest;
	AcademyHomePage academyHomePage;
	PracticePage practicePage;
	
	
	public AcademyHomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		launch();
	academyIndexPage= new AcademyIndexPage();
	loginPage= new LoginPage();
	loginPageTest= new LoginPageTest();
	academyHomePage= new AcademyHomePage();
	practicePage = new PracticePage();
	}
	
	@Test
	public void clickPracticeBtnTest()
	{
		loginPage=academyIndexPage.clickLoginBtn();
		log.info("logging in to the Academy homepage");
		
		loginPage.enterEmail(prop.getProperty("username"));
		loginPage.enterPwd(prop.getProperty("password"));
		academyHomePage=loginPage.clickLogin();
		log.info("academyHomePage is logged in");
		
		
		log.info("navigating to practice page by clicking on the practice btn");
		practicePage=academyHomePage.clickPracticeBtn();
	}
	
}
