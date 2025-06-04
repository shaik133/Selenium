package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class soupUi {

	public WebDriver driver;
	
	public soupUi(WebDriver driver)
	{
		this.driver=driver;
	}

	By email= By.id("user_email");
	
	By password = By.id("user_password");
	
	By signin = By.cssSelector("input[value='Log In']");
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement login()
	{
		return driver.findElement(signin);
	}
}
