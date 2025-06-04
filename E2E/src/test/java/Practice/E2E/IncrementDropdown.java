package Practice.E2E;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IncrementDropdown extends Initialization {

	@BeforeTest
	public void getinit() throws IOException {
		driver=base();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	}
	
	@Test
	public void incrementTest() throws InterruptedException
	{
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		for (int i=1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		for (int j=0; j<3;j++)
			{
			driver.findElement(By.id("hrefIncChd")).click();
			}
			}
	
	@Test
	public void autoSuggest() throws InterruptedException
	{
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options= driver.findElements(By.cssSelector(".ui-menu-item a"));
		
		for (WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("Indonesia"))
			{
				option.click();
				break;
			}
		}
	}
//	@AfterTest
//	public void closeBrowser()
//	{
//		driver.close();
//	}
	}

