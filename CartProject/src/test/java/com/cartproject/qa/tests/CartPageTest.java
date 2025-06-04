/**
 * 
 */
package com.cartproject.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cartproject.qa.basepackage.BasePage;
import com.cartproject.qa.pages.CartPage;
import com.cartproject.qa.pages.GreenCartHomePage;

/**
 * @author Admin
 *
 */
public class CartPageTest extends BasePage {

	GreenCartHomePage greenCartHomePage;
	CartPage cartPage;
	
	public CartPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		launch();
		greenCartHomePage= new GreenCartHomePage();
		greenCartHomePage.addItemsToCart();
		greenCartHomePage.cartBtn();
		cartPage=greenCartHomePage.checkoutBtnClick();
	}
	
	
	@Test(priority=1)
	public void validateCartTest()
	{
		log.info("validating logo present or not");
		cartPage.validateLogos();
		log.info("validating products in cart");
		cartPage.validateProductsInCart();
		log.info("validating quantity of items present");
		cartPage.validateQuantityOfItems();
		log.info("validating the Total price of products in cart");
		cartPage.PriceofproductsInCart();
		log.info("validating the Total amounts of products in cart");
		cartPage.TotalofproductsInCart();	
		Assert.assertEquals(cartPage.TotalofproductsInCart(), cartPage.PriceofproductsInCart());
	}
	
	@Test(priority=2)
	public void getPromocodeTest()
	{
		log.info("promo code is enetering");
		cartPage.enterpromoCode();
		log.info("applying promo code by clicking btn");
		cartPage.clickPromoapplyBtn();
		
		cartPage.placeOrderBtn();
	}
	
	
}
