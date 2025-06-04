package objectRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotPwd {

	WebDriver driver;
	public forgotPwd(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	 private By Email= By.cssSelector("#email");
	private By next= By.cssSelector("input[value='Next']");
	
	
	public WebElement email()
	{
		return driver.findElement(Email);
		
	}
	
	public WebElement next()
	{
		return driver.findElement(next);
		
	}
}
