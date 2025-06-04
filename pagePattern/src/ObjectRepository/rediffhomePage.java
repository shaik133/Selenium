package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffhomePage {
	
	

	WebDriver driver;
	public rediffhomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username =By.id("login1");
	By password= By.id("password");
	By signin= By.xpath("//input[@type='submit']");
	By home= By.linkText("rediff.com");
	
	public WebElement email()
	{
		return driver.findElement(username);
	}
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement home()
	{
		return driver.findElement(home);
	}
}
