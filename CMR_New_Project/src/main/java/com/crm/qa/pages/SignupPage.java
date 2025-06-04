/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.actiondrivers.Action;
import com.crm.qa.basePackage.BasePage;
import com.crm.qa.utils.Utilities;

/**
 * @author Admin
 *
 */
public class SignupPage extends BasePage{

	public  SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement enterEmail;
	
	
	@FindBy(id="phone_number")
	WebElement enterPhone;
	
	@FindBy(id="terms")
	WebElement termsCheckBox;
	
	@FindBy (css="div[class='recaptcha-checkbox-border']")
	WebElement captchaBox;
	
	@FindBy (xpath="//button[contains(text(),'Sign Up')]")
	WebElement SignUp;
	
	@FindBy (xpath="//h2[text()='Register']")
	WebElement RegisterHeaderTitle;
	
	
	public boolean registerTitle()
	{
		return RegisterHeaderTitle.isDisplayed();
	}
	
	public ValidateEmailPage signUp(String username, String phone) throws InterruptedException
	{
		Action.sendKeys(enterEmail, username);
		
		//enterEmail.sendKeys(username);
		Action.sendKeys(enterPhone, phone);
		//enterPhone.sendKeys(phone);
		Action.clickaction(termsCheckBox);
		//termsCheckBox.click();
		//Utilities.switchToFrame();
		Action.switchToFrame( driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']")));
		captchaBox.click();
		Utilities.explicitWait();
		SignUp.click();
		return new ValidateEmailPage();
	}
	
	public void rightClickonphone()
	{
		Action.moveRightClick(driver,enterPhone);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
