package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class windowhandleRepo {

	WebDriver driver;
	
	public windowhandleRepo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="form-control")
	private WebElement select;
	
			
	private By username= By.id("username");
	private By pwd = By.id("password");
	private By checkBox = By.id("terms");
	private By signin= By.id("signInBtn");
	
	public WebElement userName()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(pwd);
	}
	
	public Select select()
	{
		return new Select(select);
	}
	
	public WebElement check()
	{
		return driver.findElement(checkBox);
	}
	public WebElement sign()
	{
		return driver.findElement(signin);
	}
	
}
