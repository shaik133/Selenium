/**
 * 
 */
package com.myntraproject.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntraproject.qa.actions.Action;
import com.myntraproject.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class MyntraHomePage extends BasePage{

	
	public MyntraHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[@class='desktop-logoContainer']/a")
	WebElement logo;
	
	@FindBy(xpath="//span[text()='Profile']")
	WebElement hoverProfile;
	
	@FindBy(xpath="//a[text()='login / Signup']")
	WebElement login_signupBtn;
	
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	
	public boolean isLogoDisplayed()
	{
		 return Action.getLogo(logo);
	}
	
	
	public void hoverOverProfile()
	{
		Action.hoverOverElement(hoverProfile);
	}
	
	
	public LoginPage clickLoginBtn()
	{
		Action.click(login_signupBtn);
		return new LoginPage();
	}
	
	
	
	
	
	
}
