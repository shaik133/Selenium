package Practice.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	WebDriver driver;
	
	@BeforeClass
	public void startUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="loginData")
	public void getData(String username, String pwd, String expected)
	{
		WebElement user= driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys(username);
		
		WebElement password= driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
		String expText="Shaik Jafar";
	String actualText	=driver.findElement(By.cssSelector("span[class*='g0qnabr5']")).getText();
	if(expected.equals("valid"))
	{
	if (expText.equals(actualText)) 
	{
	driver.findElement(By.xpath("//div[@role='banner']/div[4]/div/span/div/div/div[contains(@class,'spb7xbtv')]")).click();
	Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	
	}
else if(expected.equals("invalid")) {
	if (expText.equals(actualText)) 
	{
	driver.findElement(By.xpath("//div[@role='banner']/div[4]/div/span/div/div/div[contains(@class,'spb7xbtv')]")).click();
	Assert.assertTrue(false);
	}
	else {
		Assert.assertTrue(true);
	}
	}
	}
	
	
	@DataProvider(name="loginData")
	public String[][] geLogintData()
	{
		String data[][] = { {"csshaikjafarsadiq@gmail.com","memyself","valid"},{"user2","pwd2","invalid"},{"user3","pwd3","invalid"} };
			return data;	
		}
	
}
