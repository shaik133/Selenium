package E2Egroup.E2EFramework;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepo.qaLogin;
import objectRepo.soupUi;
import objectRepo.validation;

public class testcase extends Initialization{

	@Test
	public void test1() throws IOException
	{
		driver=invokeDriver();
		//String url=prop.getProperty("url");
		driver.get("https://qaclickacademy.com/");
		
//		qaLogin login = new qaLogin(driver);
//		validation valid= new validation(driver);
//		Assert.assertEquals(valid.getText().getText(), "FEATURED COURSES");
//		valid.getNav().isDisplayed();
//		Assert.assertTrue(valid.getNav().isDisplayed());
//		
//		
//		login.getlogin().click();
//		
//		//SoupUi page object
//		soupUi ui=new soupUi(driver);
//		ui.email().sendKeys(username);
//		ui.password().sendKeys(pwd);
//		ui.login().click();
		
	}
	
//	@DataProvider
//	
//	public Object[][] getData()
//	{
//		Object[][] data = new Object[2][2];
//		data[0][0]="shaikjafarsadq@gmail.com";
//		data[0][1]="Password";
//		
//		data[1][0]="Sjs690@gmail.com";
//		data[1][1]="pwd";
//		
//		return data;
//		
//	}
//	
}
