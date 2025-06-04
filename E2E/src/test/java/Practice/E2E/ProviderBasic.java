package Practice.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderBasic {

	WebDriver driver;
	@BeforeTest
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\Admin\\\\Documents\\\\Selenium\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@Test(dataProvider="loginData")
	public void data(String username, String pwd)
	{
		WebElement user= driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys(username);
		
		WebElement password= driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
	}
	
	@DataProvider(name="loginData")
	public String[][] getData()
	{
		String data[][]= {{"user1","pwd1"}, {"user2","pwd2"},{"user3","pwd3"}};
		return data;
	}
}
