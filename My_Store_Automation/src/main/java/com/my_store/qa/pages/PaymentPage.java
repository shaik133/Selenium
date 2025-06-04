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
public class PaymentPage extends BasePage {

	

	public PaymentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="a[class='bankwire']")
	WebElement payByBankwire;
	
	public SummuryPage payByBankWire()
	{
		Action.click(payByBankwire);
		return new SummuryPage();
	}
}
