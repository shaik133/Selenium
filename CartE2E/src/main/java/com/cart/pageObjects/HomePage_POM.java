package com.cart.pageObjects;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cart.actions.Actions;
import com.cart.basePage.BasePage;

public class HomePage_POM extends BasePage {

	
	public HomePage_POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='brand greenLogo']")
	WebElement cartLogo;
	
	@FindBy(xpath="//h4[@class='product-name']")
	List<WebElement> products;
	
	@FindBy(xpath="//div[@class='product-action']/button")
	List<WebElement> cartButtons;
	
	@FindBy(xpath="//a[@class='cart-icon']/img")
	WebElement click;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement proceedCheckOut;
	public String getLogo() {
		return Actions.getLogo(cartLogo);
	}
	
	public CartPage_POM addVeggiesToCart() {
		 Actions.getVeggies(products, cartButtons);
		 Actions.click(click);
		 Actions.click(proceedCheckOut);
		 return new CartPage_POM();
	}
}
