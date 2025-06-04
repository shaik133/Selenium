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
public class OrderPage extends BasePage {

	
	
	
	
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//td[@class='cart_product']/a/img")
	WebElement productImg;
	
	@FindBy(xpath="//tbody/tr/td[2]/p/a")
	WebElement description;
	
	@FindBy(xpath="//td[@class='cart_avail']/span")
	WebElement avail;
	
	@FindBy(xpath="//td[@class='cart_unit']/span/span[text()='$28.98']")
	WebElement unitPrice;
	
	@FindBy(id="total_price")
	WebElement totalPrice;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/a")
	WebElement checkOutBtn;
	
	
	
	
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	
	public boolean getLogo()
	{
		return Action.isDisplayed(productImg);
	}
	
	public String getdescription()
	{
		return Action.getText(description);
	}
	
	public String getAvail()
	{
		return Action.getText(avail);
	}
	
	public double getUnitPrice()
	{
		return Action.removeSymbol(unitPrice);
	}
	
	
	public double gettotalPrice()
	{
		return Action.removeSymbol(totalPrice);
	}
	
	public AuthenticationPage clickCheckoutBtn()
	{
		Action.click(checkOutBtn);
		return new AuthenticationPage();
	}
	
}
