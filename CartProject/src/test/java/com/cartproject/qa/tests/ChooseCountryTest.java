/**
 * 
 */
package com.cartproject.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cartproject.qa.basepackage.BasePage;
import com.cartproject.qa.pages.CartPage;
import com.cartproject.qa.pages.ChooseCountryPage;
import com.cartproject.qa.pages.GreenCartHomePage;

/**
 * @author Admin
 *
 */
public class ChooseCountryTest extends BasePage {

	GreenCartHomePage greenCartHomePage;
	CartPage cartPage;
	ChooseCountryPage chooseCountryPage;
	
	public ChooseCountryTest()
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
		cartPage.enterpromoCode();
		cartPage.clickPromoapplyBtn();
		chooseCountryPage=cartPage.placeOrderBtn();
	}
	
	@Test(priority=1)
	public void chooseCountryTest()a
	{
		chooseCountryPage.selectDD();
	}
}
