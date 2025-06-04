/**
 * 
 */
package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class SignupPage extends BasePage {

	
	
	public SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement EnterEmail;
	
	@FindBy(id="phone_number")
	WebElement EnterPhone;
	
	@FindBy(id="terms")
	WebElement tickTerms;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSinup;
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public emailValidate signup(String username, String phone) 
	{
		EnterEmail.sendKeys(username);
		EnterPhone.sendKeys(phone);
		tickTerms.click();
		clickSinup.click();
		return new emailValidate();
	}
	
	
	
	
	
	
}
