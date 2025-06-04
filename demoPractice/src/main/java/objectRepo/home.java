package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home {

	
	WebDriver driver;
	
	public home(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By homelogin=By.linkText("Login");
	
	public WebElement login()
	{
		return driver.findElement(homelogin);
	}
}
