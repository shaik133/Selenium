import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
	
		WebDriver driver=new ChromeDriver();
/*		
//This is one method using Index number if the same value is present in 2 dropdowns	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='HYD']) [2]")).click();
*/
		
//This is second way of itirating through dynamic dropdown withput using Index.
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='AMD']")).click();
//		driver.findElement(By.cssSelector("div#ctl00_mainContent_ddl_destinationStation1_CTNR a[value='COK']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		WebDriverWait wait= new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='IXG']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='IXM']")).click();
		
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(3000);
	List<WebElement> options=	driver.findElements(By.cssSelector("li.ui-menu-item a"));
	
	for (WebElement option:options)
	{
		if (option.getText().equalsIgnoreCase("Austria"))
		{
		option.click();
		break;
		}
//		for(WebElement option:options) {
//			if(option.getText().equalsIgnoreCase("Austria")) {
//				option.click();
//				break;
	}
		
		
		
	}

}
