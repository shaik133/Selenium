package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaLogin {

	WebDriver driver;
	
	public qaLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By username= By.id("email");
	By password= By.id("password");
	By login =By.cssSelector("input[type='submit']");
	
	
	public WebElement username()
	{
		return driver.findElement(username);
		
	}
	

	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	

	public WebElement login()
	{
		return driver.findElement(login);
		
	}
}
