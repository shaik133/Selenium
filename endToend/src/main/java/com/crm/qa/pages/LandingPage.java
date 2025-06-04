/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.actionDriver.Action;
import com.crm.qa.basepage.BasePage;

/**
 * @author Admin
 *
 */
public class LandingPage extends BasePage {

	public  LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (css="img[class='img-responsive']")
	WebElement pageLogo;
	
	@FindBy (xpath="//a[text()='Login']")
	WebElement loginBtn;
	
	@FindBy (xpath="//a[text()='Sign Up']")
	WebElement signupBtn;
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean getLogo()
	{
		return Action.isDisplayed(pageLogo);
	}
	
	public HomePage loginClick()
	{
		 Action.click(loginBtn);
		 return new HomePage();
	}
	
	public SignupPage signupClick()
	{
		Action.click(signupBtn);
		return new SignupPage();
	}
}
