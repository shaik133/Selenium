package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class index {

	WebDriver driver;
	public index(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By login= By.cssSelector("theme-btn.register-btn");
	
	
	public WebElement login() {
		return  driver.findElement(login);
		 
	}
}
