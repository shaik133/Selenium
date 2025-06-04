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
public class SummuryPage extends BasePage{

	
	public SummuryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="h3[class='page-subheading']")
	WebElement paymentModeText;
	
	@FindBy(css="button[class='button btn btn-default button-medium']")
	WebElement confirmOrderBtn;
	
	
	public String getPaymentModeText()
	{
		return Action.getText(paymentModeText);
	}
	
	
	public OrderConfirmationPage clickConfirmOrderBtn()
	{
		Action.click(confirmOrderBtn);
		return new OrderConfirmationPage();
	}
}
