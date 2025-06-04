package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBook_login {

	WebDriver driver;
	public FaceBook_login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email= By.id("email");
	By pwd= By.id("pass");
	By login= By.name("login");
	
	public WebElement email()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement pwd()
	{
		return driver.findElement(pwd);
		
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
		
	}
}
