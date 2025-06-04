package Practice.E2E;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepo.selectDropdown;

public class dropdownTest extends Initialization{
	@BeforeTest
	public void getinit() throws IOException {
		driver=base();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	}
	@Test
	private void test() throws InterruptedException {
		// TODO Auto-generated method stub
		selectDropdown drop = new selectDropdown(driver);
		drop.select_list().selectByVisibleText("USD");
		
		drop.IncClick().click();
		Thread.sleep(2000);
		
		for (int i=1; i<4; i++)
		{
			drop.adultInc().click();
		}
		
		for (int j=0; j<3;j++)
		{
			drop.childInc().click();
		}
		
		drop.from().click();
		drop.departCity().click();
		Thread.sleep(2000);
		drop.arrivalCity().click();
		
		drop.autoSuggest().sendKeys("Ind");
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
