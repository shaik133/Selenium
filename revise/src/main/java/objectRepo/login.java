package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	
	WebDriver driver;
	
	public login(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	By username=By.cssSelector("#email");
	By password= By.cssSelector("#password");
	By login= By.cssSelector("input[value='Login']");
	//Page object factory
	
	By forgotPwd=By.linkText("Forgot Password");
	
	
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	public forgotPwd forgotPw()
	{
		driver.findElement(forgotPwd).click();
		forgotPwd fp= new forgotPwd(driver);
		return fp;
		
	}
}
