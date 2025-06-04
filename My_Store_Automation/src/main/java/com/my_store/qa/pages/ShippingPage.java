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
public class ShippingPage extends BasePage{

	
	public ShippingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="cgv")
	WebElement checkbox;
	
	@FindBy(css="button[name='processCarrier']")
	WebElement proceedBtn;
	
	
	public void checkBoxClick()
	{
		Action.click(checkbox);
	}
	
	
	public PaymentPage proceedBtnClick()
	{
		Action.click(proceedBtn);
		return new PaymentPage();
	}
	
}
