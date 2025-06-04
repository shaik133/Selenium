/**
 * 
 */
package com.my_store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.my_store.qa.actions.Action;
import com.my_store.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class AuthenticationPage extends BasePage{

	
	public AuthenticationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email_create")
	WebElement emailAddrs;
	
	@FindBy(id="SubmitCreate")
	WebElement submitBtn;
	
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	public void enterEmail()
	{
		Action.sendkeys(emailAddrs, prop.getProperty("emailforsignup"));
	}
	
	public CreateAccountPage clickSubmit()
	{
		Action.click(submitBtn);
		return new CreateAccountPage();
	}
}
