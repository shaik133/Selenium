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
public class AddressPage extends BasePage{

	
	public AddressPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="button[name='processAddress']")
	WebElement proceedToCheckout;
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	
	public ShippingPage proceedCheckOut()
	{
		Action.click(proceedToCheckout);
		return new ShippingPage();
	}
	
}
