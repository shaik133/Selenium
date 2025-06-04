/**
 * 
 */
package com.my_store.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.my_store.qa.base.BasePage;
import com.my_store.qa.pages.AddressPage;
import com.my_store.qa.pages.AuthenticationPage;
import com.my_store.qa.pages.CreateAccountPage;
import com.my_store.qa.pages.MyStoreIndexPage;
import com.my_store.qa.pages.MyStoreSearchPage;
import com.my_store.qa.pages.OrderConfirmationPage;
import com.my_store.qa.pages.OrderPage;
import com.my_store.qa.pages.PaymentPage;
import com.my_store.qa.pages.ProductPage;
import com.my_store.qa.pages.ShippingPage;
import com.my_store.qa.pages.SummuryPage;

/**
 * @author Admin
 *
 */
public class SummuryPageTest extends BasePage{

	MyStoreIndexPage myStoreIndexPage;
	MyStoreSearchPage myStoreSearchPage;
	ProductPage productPage;
	OrderPage orderPage;
	AuthenticationPage autheneticationPage;
	CreateAccountPage createAccountPage;
	AddressPage addressPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;
	SummuryPage summuryPage;
	OrderConfirmationPage orderConfirmationPage;
	
	
	public SummuryPageTest()
	{
		super();
	}
	
	@DataProvider(name="infoData")
	@BeforeMethod
	public void setup(String fname1, String lname1, String pwd1,String Fname, String Lname, String companyy, String address1, String address2, String citi,
			String zip, String mob, String alias)
	{
		launch();
		log.info("Browser is launched");
		myStoreIndexPage= new MyStoreIndexPage();
		myStoreIndexPage.searchItem();
		myStoreSearchPage=myStoreIndexPage.clickSearchBtn();
		myStoreSearchPage.selectDD();
		productPage=myStoreSearchPage.clickprintedSummerImg();
		productPage.selectItemQuantity();
		productPage.selectItemSize();
		productPage.selectColor();
		productPage.addCartBtn();
		boolean msg= productPage.cartValidationMessage();
		Assert.assertTrue(msg);
		orderPage=productPage.checkOutBtn();
		autheneticationPage=orderPage.clickCheckoutBtn();
		autheneticationPage.enterEmail();
		createAccountPage=autheneticationPage.clickSubmit();
		createAccountPage.radioTitleClick();
		addressPage=createAccountPage.sendPersnlInfo(fname1, lname1, pwd1,Fname, Lname, companyy, address1, address2, citi,zip, mob, alias);
		shippingPage=addressPage.proceedCheckOut();
		shippingPage.checkBoxClick();
		paymentPage=shippingPage.proceedBtnClick();
		summuryPage=paymentPage.payByBankWire();
	}
	
	
	@Test(priority=1)
	public void confirmOrderTest()
	{
		log.info("verifying the payment mode");
		summuryPage.getPaymentModeText();
		
		log.info("Clicking on the confirm order btn");
		orderConfirmationPage=summuryPage.clickConfirmOrderBtn();
	}
	
	
	
	
}
