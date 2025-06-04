package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logIn {

	public WebDriver driver;
	
	
	public logIn(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By login= By.linkText("Login");
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
}
