/**
 * 
 */
package com.qaacademy.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.my_store.qa.base.BasePage;
import com.qaacademy.qa.pages.QaAcademyLandingPage;

/**
 * @author Admin
 *
 */
public class QaAcademyLandingPageTest extends BasePage {

	QaAcademyLandingPage qaAcademyLandingPage;
	
	public QaAcademyLandingPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		launch();
		qaAcademyLandingPage= new QaAcademyLandingPage();
	}
	
	
	@Test(priority=1)
	public void getTitleTest()
	{
		String Title=qaAcademyLandingPage.getTitle();
		Assert.assertEquals(Title, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		
		qaAcademyLandingPage.popupHandle();
		
	}
	
}
