/**
 * 
 */
package com.cartproject.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cartproject.qa.action.Action;
import com.cartproject.qa.basepackage.BasePage;

/**
 * @author Admin
 *
 */
public class GreenCartHomePage extends BasePage {

	
	public GreenCartHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="div[class='brand greenLogo']")
	WebElement Logo;
	
	
	@FindBy(css="h4[class='product-name']")
	List<WebElement> productName;
	
	@FindBy(css="img[alt='Cart']")
	WebElement cartbtn;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkoutBtn;
	
	public void getLogo()
	{
		 Action.getLogo(Logo);
	}
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	public void addItemsToCart()
	{
		Action.addToCart(productName);
	}
	
	public void cartBtn()
	{
		Action.click(cartbtn);
	}
	
	public CartPage checkoutBtnClick()
	{
		Action.click(checkoutBtn);
		return new CartPage();
	}
}
