package testngPractice.revise;

import java.io.IOException;

import org.testng.annotations.Test;

import objectRepo.index;

public class indexTest extends initiating {

	
	@Test
	public void indextest() throws IOException
	{
		driver=invoke();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		
		index log = new index(driver);
		log.login().click();
	}
}
