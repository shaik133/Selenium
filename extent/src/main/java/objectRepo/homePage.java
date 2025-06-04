package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By username= By.id("email");
	By password = By.id("password");
//	By logIn= By.cssSelector("input[value='Login']");
	By signup= By.linkText("Sign Up");
	
	public WebElement uname()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement pwd()
	{
		return driver.findElement(password);
		
	}

//	public WebElement logIn()
//	{
//		return driver.findElement(logIn);
//		
//	}
public signUpPage signup()
{
	driver.findElement(signup).click();
	signUpPage sup= new signUpPage(driver);
	return sup;
}
}
