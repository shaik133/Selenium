package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RohitshettyLogin {

	@Test
	public void login()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
	
	//invoke webdriver object
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}
}
