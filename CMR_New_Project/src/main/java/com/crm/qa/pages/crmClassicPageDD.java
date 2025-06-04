/**
 * 
 */
package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.actiondrivers.Action;
import com.crm.qa.basePackage.BasePage;

/**
 * @author Admin
 *
 */
public class crmClassicPageDD extends BasePage {

	public crmClassicPageDD()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (name="username")
	WebElement enterUsername;
	
	
	
	@FindBy(name="password")
	WebElement enterPassword;
	
	@FindBy(css="input[type='submit']")
	WebElement login;
	
	public HomePage Login(String username, String pwd)
	{
		Action.sendKeys(enterUsername, username);
		Action.sendKeys(enterPassword, pwd);
		Action.clickaction(login);
		return new HomePage();
		
	}
	
}
