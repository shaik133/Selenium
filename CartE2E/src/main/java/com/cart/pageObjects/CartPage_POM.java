package com.cart.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cart.actions.Actions;
import com.cart.basePage.BasePage;

public class CartPage_POM extends BasePage {

	public CartPage_POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="p[class='product-name']")
	List<WebElement> cartProducts;
	
	
	public void getProductsInCarts() {
		Actions.getCartProducts(cartProducts);
	}
}
