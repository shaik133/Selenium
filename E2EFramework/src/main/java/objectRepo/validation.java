package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class validation {

	public WebDriver driver;
	
	public validation(WebDriver driver)
	{
		this.driver=driver;
	}

	By text= By.cssSelector(".text-center");
	By navBar=By.cssSelector(".navbar-collapse.collapse");
	
	public WebElement getText()
	{
		return driver.findElement(text);
	}
	public WebElement getNav()
	{
		return driver.findElement(navBar);
	}
}
