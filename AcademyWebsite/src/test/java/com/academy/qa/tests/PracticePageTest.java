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
public class PracticePageTest extends BasePage {
	AcademyIndexPage academyIndexPage;
	LoginPage loginPage;
	LoginPageTest loginPageTest;
	AcademyHomePage academyHomePage;
	PracticePage practicePage;

	
	public PracticePageTest()
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
	public void submitFormTest()
	{
		loginPage=academyIndexPage.clickLoginBtn();
		loginPage.enterEmail(prop.getProperty("username"));;
		loginPage.enterPwd(prop.getProperty("password"));
		academyHomePage=loginPage.clickLogin();
		practicePage=academyHomePage.clickPracticeBtn();
		
		log.info("Submitting details in forms");
		
	}
}
