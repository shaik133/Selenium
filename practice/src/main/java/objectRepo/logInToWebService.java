package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logInToWebService {

	public WebDriver driver;
	
	public logInToWebService(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By username= By.id("user_email");
	By password= By.id("user_password");
	By login= By.cssSelector(".btn.btn-primary.btn-md.login-button");
	By text= By.cssSelector("div[class='main-hero'] h1");
	
	public WebElement uname()
	{
		return driver.findElement(username);
	}
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	public WebElement signIn()
	{
		return driver.findElement(login);
	}
	
	public WebElement getText() {
		// TODO Auto-generated method stub
		return driver.findElement(text);
	}
}
