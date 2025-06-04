package Practice.E2E;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepo.windowhandleRepo;

public class WindowHandle extends Initialization{

	@BeforeMethod
	public void init() throws IOException
	{
		driver = base();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
	}
	
	@Test(dataProvider="getData")
	public void test(String username, String password)
	{
		windowhandleRepo  obj = new windowhandleRepo(driver);
		obj.userName().sendKeys(username);
		obj.password().sendKeys(password);
		obj.select().selectByValue("teach");
		obj.check().click();
		obj.sign().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0]= "username1";
		data[0][1]="pwd1";
		data[1][0]="username2";
		data[1][1]="pwd2";
		return data;
	}
	
}
