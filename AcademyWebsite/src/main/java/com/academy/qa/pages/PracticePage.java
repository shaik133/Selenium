/**
 * 
 */
package com.academy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.academy.qa.action.Action;
import com.academy.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class PracticePage extends BasePage{

	public PracticePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="name")
	WebElement yourName;
	
	@FindBy(id="email")
	WebElement yourEmail;
	
	@FindBy(id="agreeTerms")
	WebElement checkBox;
	
	@FindBy(id="form-submit")
	WebElement submit;
	
	
//	public PracticeLinkPage submitForm()
//	{
//		Action.sendKeys(yourName, Action.hasmap().get("name"));
//		Action.sendKeys(yourEmail, Action.hasmap().get("email"));
//		Action.click(checkBox);
//		Action.click(submit);
//		
//		return new PracticeLinkPage();
//	}
}
