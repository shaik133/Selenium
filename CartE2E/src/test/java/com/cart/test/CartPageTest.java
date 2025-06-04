package com.cart.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cart.basePage.BasePage;
import com.cart.pageObjects.CartPage_POM;
import com.cart.pageObjects.HomePage_POM;

public class CartPageTest extends BasePage {

	HomePage_POM home;
	CartPage_POM cart;
//	public CartPageTest() {
//		super();
//	}
	
	
	@BeforeMethod
	public void setup() {
		launch();
		home= new HomePage_POM();
		
		log.info("Products added to the cart");
		cart=home.addVeggiesToCart();
		
	}
	
	@Test
	public void getCartProducts() {
		log.info("Verifying the added products in cart");
		try {
			cart.getProductsInCarts();
		}
		catch(org.openqa.selenium.StaleElementReferenceException e) {
			cart.getProductsInCarts();
		}
		
	}
}
