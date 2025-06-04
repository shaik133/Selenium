package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationHomePgae {

	WebDriver driver;
	public automationHomePgae(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By homeLogin=By.cssSelector(".theme-btn.register-btn");
	
	
	public WebElement homelogin()
	{
	return	driver.findElement(homeLogin);
	}
}
