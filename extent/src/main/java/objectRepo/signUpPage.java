package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {

	
	WebDriver driver;
	public signUpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By fullName= By.cssSelector("input[id='user_name']");
	By email= By.id("user_email");
	By password= By.id("password");
	By checkBox= By.id("allow_marketing_emails");
	By signUp= By.xpath("//input[@value='Sign up']");
	
	
	public WebElement fullName()
	{
		return driver.findElement(fullName);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement checkBox()
	{
		return driver.findElement(checkBox);
	}
	public WebElement signUp()
	{
		return driver.findElement(signUp);
	}
}
