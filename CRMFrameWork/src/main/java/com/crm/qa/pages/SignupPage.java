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
public class SignupPage extends BasePage {

	public SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "email")
	WebElement email;
	
	
	@FindBy(id ="phone_number")
	WebElement phone1;
	
	@FindBy(id ="terms")
	WebElement tremsBox;
	
	@FindBy(css="div[class='recaptcha-checkbox-border']")
	WebElement captcha;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signup;
	
	@FindBy(css="iframe[title='reCAPTCHA']")
	WebElement switchToCaptcha;
	
	public HomePage signUp(String username, String phone)
	{
		Action.sendKeys(email, username);
		Action.sendKeys(phone1, phone);
		Action.click(tremsBox);
		Action.switchToFrame(switchToCaptcha);
		Action.click(captcha);
		Action.switchToDefaultContent();
		Action.click(signup);
		return new HomePage();
	}
	
	public boolean getTitle()
	{
		return Action.getTitleName();
	}
}
