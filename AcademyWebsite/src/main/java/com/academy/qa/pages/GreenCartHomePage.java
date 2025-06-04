/**
 * 
 */
package com.academy.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.academy.qa.action.Action;
import com.academy.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class GreenCartHomePage extends BasePage{

	public GreenCartHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='product']/h4")
	List<WebElement> productName;
	
	@FindBy(xpath="//div[@class='product-action']/button")
	WebElement ProductAction;
	
	
	public void addToCartProd()
	{
		Action.addToCart(productName, ProductAction);
	}
}
