package ObjectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemyTripLogin {
   WebDriver driver;
	public  makemyTripLogin(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By travelFrom = By.id("travel_from");
	
	
//	public WebElement travelFrom()
//	{
//		return driver.findElement(travelFrom);
//	}


	public void travelFrom(String name) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver.findElement(travelFrom).sendKeys(name);
		Thread.sleep(3000);
		 List<WebElement>	options=	driver.findElements(By.cssSelector("div[id='ajax_listOfOptions'] div[class*='optionDiv']"));
			for (WebElement option : options)
			{
				if(option.getText().contains("Bengaluru International Airport   (BLR) Bangalore"))
				{
					option.click();
					break;
				}
				
			}
			
	}
}
