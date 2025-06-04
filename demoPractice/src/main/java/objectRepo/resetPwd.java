package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class resetPwd {

	WebDriver driver;
	public resetPwd(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By email= By.id("user_email");
	By submit= By.cssSelector("input[name='commit']");
	
	public WebElement email()
	{
		return driver.findElement(email);
		
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
		
	}
}
