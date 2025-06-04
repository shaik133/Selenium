package Practice.E2E;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class providerByXl {

	WebDriver driver;
	@BeforeTest
	public void startUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\Admin\\\\Documents\\\\Selenium\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="loginData")
	public void logIn(String username, String Pass)
	{
		WebElement user= driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys(username);
		
		WebElement password= driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(Pass);
		
		driver.findElement(By.name("login")).click();
	}
	
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		String path= "F:\\Robots\\Robot2_DataCapturing\\customer.xlsx";
	int rownum =	xlUtility.getRowCount(path, "Sheet1");
	int colnum= xlUtility.getcolCount(path, "Sheet1", 99);
		String loginData[][]= new String[rownum][colnum];
		
		for(int i=99; i<=rownum;i++)
		{
			for(int j=0; j<colnum; j++)
			{
				loginData[i-99][j]= xlUtility.getCellData(path, "Sheet1", i, j);
				
			}
			
		}
		return loginData;
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
