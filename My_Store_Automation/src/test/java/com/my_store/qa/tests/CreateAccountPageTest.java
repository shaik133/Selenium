/**
 * 
 */
package com.my_store.qa.tests;

import java.io.IOException;

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
import com.my_store.qa.pages.OrderPage;
import com.my_store.qa.pages.ProductPage;
import com.my_store.qa.utilities.XLUtility;

/**
 * @author Admin
 *
 */
public class CreateAccountPageTest extends BasePage {

	MyStoreIndexPage myStoreIndexPage;
	MyStoreSearchPage myStoreSearchPage;
	ProductPage productPage;
	OrderPage orderPage;
	AuthenticationPage autheneticationPage;
	CreateAccountPage createAccountPage;
	AddressPage addressPage;
	
	public CreateAccountPageTest()
	{
		super();
		
	}
	
	
	@BeforeMethod
	public void setup()
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
	}
	
	@Test(priority=1, dataProvider="infoData")
	public void persnlInfoTest(String fname1, String lname1, String pwd1,String Fname, String Lname, String companyy, String address1, String address2, String citi,
			String zip, String mob, String alias)
	{
		createAccountPage.radioTitleClick();
		log.info("sending the personal details");
		addressPage=createAccountPage.sendPersnlInfo(fname1, lname1, pwd1,Fname, Lname, companyy, address1, address2, citi,zip, mob, alias);
	
		
		
	}
	
//	@Test(priority=2)
//	public void selectDOB()
//	{
//		log.info("selecting DOB details");
//		createAccountPage.DOB();
//	}
//	
//	@Test(priority=3,dataProvider="addrsData")
//	public void getAddrsInfoTest(String Fname, String Lname, String companyy, String address1, String address2, String citi, String zip, String mob, String alias)
//	{
//		log.info("passing address details");
//		createAccountPage.address(Fname, Lname, companyy, address1, address2, citi);
//		
//		log.info("selecting state and country details");
//		createAccountPage.selectInfo();
//	}
//	
//	
//	
//	@Test(priority=4, dataProvider="addrsData")
//	
//	public void remInfoTest(String zip, String mob, String alias)
//	{
//		log.info("passing zip, mobile and address aliase details");
//		createAccountPage.remAddr(zip, mob, alias);
//	}
	
	
	
	
	
	
	
	
	
	
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
	
	
//	@DataProvider(name="addrsData")
//	public String[][] getAddrsInfo() throws IOException
//	{
//		String path=System.getProperty("user.dir")+"\\ExcellFile\\document (2).xlsx";
//	int  totalrow	=XLUtility.getLastRow(path, "sheet2");
//		int totalcell =XLUtility.getCellCount(path, "sheet2", 1);
//		
//		String data[][]= new String [totalrow][totalcell];
//		for(int i=1;i<=totalrow;i++)
//		{
//			for(int j=0;  j<totalcell;j++)
//			{
//				data[i-1][j]=XLUtility.getCellData(path, "sheet2", i, j);
//			}
//		}
//		return data;
//	}
	
	
	
	
	
	
}
