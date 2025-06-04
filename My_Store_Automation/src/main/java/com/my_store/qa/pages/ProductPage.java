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
public class ProductPage extends BasePage{

	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[@id='quantity_wanted_p']/a[2]")
	WebElement selectQuantity;
	
	@FindBy(id="group_1")
	WebElement selectSize;
	
	@FindBy(xpath="//div[@class='attribute_list']/ul/li[2]")
	WebElement selectcolor;
	
	@FindBy(xpath="//div[@class='box-cart-bottom']/div/p/button/span")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//div[@class='layer_cart_product col-xs-12 col-md-6']/h2")
	WebElement validateAddTocartMsg;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement ProceedToCheckBtn;
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	public void selectItemQuantity()
	{
		Action.dynamicIncrement(selectQuantity);
	}
	
	public void selectItemSize()
	{
		Action.select(selectSize, prop.getProperty("sizeofdress"));
	}
	
	public void selectColor()
	{
		Action.click(selectcolor);
	}
	
	public void addCartBtn()
	{
		Action.click(addToCartBtn);
	}
	
	public boolean cartValidationMessage()
	{
		Action.explicitWait(validateAddTocartMsg);
	return Action.isDisplayed(validateAddTocartMsg);	
	}
	
	public OrderPage checkOutBtn()
	{
	
		Action.click(ProceedToCheckBtn);
		return new OrderPage();
	}
}
