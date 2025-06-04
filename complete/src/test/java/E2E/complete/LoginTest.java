package E2E.complete;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.FaceBook_login;

public class LoginTest extends Init{

	@Test
	public void test() throws IOException
	{
	
	driver= invoke();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	FaceBook_login login= new FaceBook_login(driver);
	login.email().sendKeys("csshaikjafarsadiq@gmail.com");
	login.pwd().sendKeys("memyself");
	login.login().click();
	
	}
}
