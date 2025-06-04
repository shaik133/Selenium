package E2Egroup.practice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepo.logIn;
import objectRepo.logInToWebService;

public class test extends Init {
@Test
public void test1() throws IOException
{
	driver=invoke();
	driver.get("https://qaclickacademy.com/");
	logIn in= new logIn(driver);
	in.getLogin().click();
	
	logInToWebService login = new logInToWebService(driver);
	login.uname().sendKeys("shaikjafarsdq@gmail.com");
	login.pwd().sendKeys("password");
	login.signIn().click();
	login.getText().getText();
	Assert.assertEquals(login.getText().getText(), "Log In to WebServices Testing using SoapU");
	
	
}
	
}
