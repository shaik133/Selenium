package testngPractice.revise;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepo.qaLogin;

public class qainsideLogin extends initiating {

	@Test(dataProvider="getdata")
	public void signin(String username, String pwd) throws IOException
	{
		driver=invoke();
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		
		qaLogin signin = new qaLogin(driver);
			signin.username().sendKeys(username);
		signin.password().sendKeys(pwd);
		signin.login().click();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data = new Object[2] [2];
		data [0][0]= "shaik";
		data[0][1]= "pwd1";
		
		data[1][0]="jafar";
		data[1][1]="pwd2";
		
		return data;
	}
}
