/**
 * 
 */
package com.my_store.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.my_store.qa.base.BasePage;
import com.my_store.qa.pages.AddressPage;
import com.my_store.qa.pages.AuthenticationPage;
import com.my_store.qa.pages.CreateAccountPage;
import com.my_store.qa.pages.MyStoreIndexPage;
import com.my_store.qa.pages.MyStoreSearchPage;
import com.my_store.qa.pages.OrderPage;
import com.my_store.qa.pages.SummuryPage;
import com.my_store.qa.utilities.XLUtility;
import com.my_store.qa.pages.PaymentPage;
import com.my_store.qa.pages.ProductPage;
import com.my_store.qa.pages.ShippingPage;

/**
 * @author Admin
 *
 */
public class PaymentPageTest extends BasePage{

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
	
	public PaymentPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup( String  fname1, String lname1, String pwd1,String Fname, String Lname, String companyy, String address1, String address2, String citi,
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
		
		
	}
	
	@Test(priority=1)
	public void payByBankWireTest()
	{
		summuryPage=paymentPage.payByBankWire();
	}

	@DataProvider(name="infoData")
	public Object[][] getPersnlInfo() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\ExcellFile\\document (4).xlsx";
	int  totalrow	=XLUtility.getLastRow(path, "sheet2");
		int totalcell =XLUtility.getCellCount(path, "sheet2", 1);
		
		Object data[][]= new String [totalrow][totalcell];
		for(int i=1;i<=totalrow;i++)
		{
			for(int j=0;  j<totalcell;j++)
			{
				data[i-1][j]=XLUtility.getCellData(path, "sheet2", i, j);
			}
		}
		return data;
	}

}
