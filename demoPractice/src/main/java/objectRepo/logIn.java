package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logIn {

	WebDriver driver;
	public logIn(WebDriver driver) 
	{
		this.driver= driver;
	}
	
	By username=By.id("user_email");
	By pwd= By.id("user_password");
	By signin= By.cssSelector("input[type='submit']");
	
	
	By text= By.cssSelector("div[class='main-hero'] h1");
	By fpwd= By.linkText("Forgot Password?");
	
	
	public WebElement uname()
	{
		return driver.findElement(username);
	}

	public WebElement pwd()
	{
		return driver.findElement(pwd);
	}

	public WebElement login()
	{
		return driver.findElement(signin);
	}
	public WebElement text()
	{
		return driver.findElement(text);
	}
	public resetPwd forgotPwd()
	{
		driver.findElement(fpwd).click();
		resetPwd rp= new resetPwd(driver);
		return rp;
		
	}
}
