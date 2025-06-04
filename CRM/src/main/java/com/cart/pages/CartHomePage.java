package com.cart.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.actions.Action;
import com.crm.base.page.BasePage;


public class CartHomePage extends BasePage{

	public CartHomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="div[class='brand greenLogo']")
	WebElement greencartLogo;
	
	@FindBy(css="input[class='search-keyword']")
	WebElement inputSearchBar;
	
	@FindBy(css="button[class='search-button']")
	WebElement inputSearchButton;
	
	@FindBy(css="a[href*='offers']")
	WebElement topDealsButton;
	
	@FindBy(css="a[href*='dropdowns']")
	WebElement flightBookingBtn;
	
	@FindBy(css="div[class='cart-info'] tr:nth-child(1) td:nth-child(3)")
	WebElement noOfItemsInCart;
	
	@FindBy(css="div[class='cart-info'] tr:nth-child(2) td:nth-child(3)")
	WebElement priceOfItems;
	
	@FindBy(css="a[class='cart-icon'] img")
	WebElement cartIcon;
	
	@FindBy(css="div[class='product-action'] button")
	List<WebElement> addToCartButtons;
	
	@FindBy(css="h4[class='product-name']")
	List<WebElement> productNames;
	
	@FindBy(css="a[class='increment']")
	List<WebElement> incrementBtn;
	
	
	@FindBy(css="a[class='decrement']")
	List<WebElement> decrementBtn;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	WebElement proceedToCheckOutBtn;
	
	
	public String getTitle() {
		return Action.getTitle();
	}
	
	public String getText() {
		 return Action.getText(greencartLogo);
		
	}
	
	
	public int countSearchProduct(String text) throws InterruptedException {
		 return Action.searchProducts(productNames, inputSearchBar,text );
	}
	
	public ArrayList<String> matchSearchProducts(String text) {
		return Action.matchSearchedProduct(inputSearchBar, productNames, text);
	}
	
	public void addProducts() {
		Action.addProducts(productNames, addToCartButtons);
	}
	
	public String getItemsCount() {
		return Action.getText(noOfItemsInCart);
	}
	
	public CartPage clickCheckoutBtn() throws InterruptedException, IOException {
		Action.clickBtn(cartIcon);
		Thread.sleep(3000);
		Action.clickBtn(proceedToCheckOutBtn);
		return new CartPage();
	}
}
