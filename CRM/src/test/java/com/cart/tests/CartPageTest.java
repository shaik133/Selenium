package com.cart.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cart.pages.CartHomePage;
import com.cart.pages.CartPage;
import com.cart.pages.CountryPage;
import com.crm.base.page.BasePage;

public class CartPageTest extends BasePage {
	CartHomePage homePage;
	CartPage cart;
	CountryPage countryPage;
	
	
	public CartPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void launch() throws IOException, InterruptedException {
		launchBrowser();
		homePage= new CartHomePage();
		homePage.addProducts();
		cart =homePage.clickCheckoutBtn();
		//countryPage= new CountryPage();
	}
	
	@Test(priority=1)
	public void getCartProducts() {
//		String[] arr= {"120","48","16"};
		List<String> prod=cart.getProducts("Price");
		Assert.assertEquals(new ArrayList<String>(Arrays.asList("120","48","16")), prod);

	}
	@Test(priority=2)
	public void clickPlaceOrderBtn() throws IOException, InterruptedException {
		log.info("Clicking on the place order button");
		//driver.findElement(By.cssSelector("div[class='products'] button:nth-child(14)")).click();
		cart.clickOrderBtn();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select")).isDisplayed();
		
	}
	
}
