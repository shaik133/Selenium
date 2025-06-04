package testngPractice.revise;

import java.io.IOException;

import org.testng.annotations.Test;

import objectRepo.automationHomePgae;
import objectRepo.forgotPwd;
import objectRepo.login;

public class test1 extends initiating {

	@Test
	public void loan() throws IOException
	{
		driver=invoke();
driver.get("https://www.rahulshettyacademy.com/#/index");

automationHomePgae hl= new automationHomePgae(driver);
hl.homelogin().click();


	}
	
}
