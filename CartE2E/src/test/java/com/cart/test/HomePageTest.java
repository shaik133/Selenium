package com.cart.test;




import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cart.actions.Actions;
import com.cart.basePage.BasePage;
import com.cart.pageObjects.CartPage_POM;
import com.cart.pageObjects.HomePage_POM;



public class HomePageTest extends BasePage {
	HomePage_POM home;
	CartPage_POM cart;
	@BeforeMethod
	public void launchBrowser() {
		launch();
		 home= new HomePage_POM();
	}
	
	@Test
	public void getTitle() {
		log.info("Validating the title of the homepage");
		Actions.getTitle("GreenKart - veg and fruits kart");
	}
	
	@Test(priority=1)
	public void getLogo() {
		log.info("Validating logo of the homepage");
		String logo=home.getLogo();
		Assert.assertEquals(logo, "GREENKART");
	}
	
	@Test(priority=2)
	public void addMultipleProductsToCart() {
		cart=home.addVeggiesToCart();
	
	}
}
