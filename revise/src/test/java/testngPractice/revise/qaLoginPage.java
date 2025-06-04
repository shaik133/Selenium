package testngPractice.revise;

import java.io.IOException;

import org.testng.annotations.Test;

import objectRepo.qaLogin;

public class qaLoginPage  extends initiating{

	@Test
	public void loginTest() throws IOException
	{
		driver=invoke();
		driver.get("https://qaclickacademy.com/");
		
	
		
		
	}
	
	
}
