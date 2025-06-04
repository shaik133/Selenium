package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class qaLogin {

	public WebDriver driver;
	
	public qaLogin(WebDriver driver)
	{
		this.driver= driver;
	}
		
		By logIn= By.linkText("Login");

		
		public WebElement getlogin()
		{
			return driver.findElement(logIn);
		}
		
	}

