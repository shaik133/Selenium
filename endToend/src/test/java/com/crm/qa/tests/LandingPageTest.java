/**
 * 
 */
package com.crm.qa.tests;

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
	
	public void setup()
	{
		launch();
		landingPage = new LandingPage();
	}
	
	public void getTitleTest()
	{
		landingPage.getTitle();
	}
	
	public void getLogoTest()
	{
		landingPage.getLogo();
	}
	
	public void loginClickTest()
	{
		landingPage.loginClick();
	}
	
	public void signupClickTest()
	{
		landingPage.signupClick();
	}
}
