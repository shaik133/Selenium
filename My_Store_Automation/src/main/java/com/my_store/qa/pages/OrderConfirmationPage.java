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
public class OrderConfirmationPage extends BasePage{
	
	public OrderConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[@class='cheque-indent']/strong")
	WebElement confirmationtext;
	
	
	public String verifyConfirmationMsg()
	{
		return Action.getText(confirmationtext);
	}
	
	
}
