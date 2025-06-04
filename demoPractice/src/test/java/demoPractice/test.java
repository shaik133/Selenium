package demoPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectRepo.home;
import objectRepo.logIn;
import objectRepo.resetPwd;

public class test extends Initial {

	@Test
	public void test() throws IOException
	{
		driver=invole();
		driver.get("https://qaclickacademy.com/");
		
		home log = new home(driver);
		log.login().click();
		
		logIn in = new logIn(driver);
		in.uname().sendKeys("shaik");
		in.pwd().sendKeys("pwd");
		in.login().click();
		String text= in.text().getText();
		Assert.assertEquals(text, "Log In to WebServices Testing using SoapUI");
resetPwd rp=in.forgotPwd();
	rp.email().sendKeys("memyself");
	rp.submit().click();
		
		
	}
//	@AfterTest
//	public void close()
//	{
//		driver.close();
//	}
	

}
