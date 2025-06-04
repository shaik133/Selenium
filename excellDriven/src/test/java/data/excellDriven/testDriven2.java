package data.excellDriven;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class testDriven2 {
ExtentReports extent;
//	public void test()
//	{
//		ExtentSparkReporter report = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
//		report.config().setReportName("Extent Reports");
//		report.config().setDocumentTitle("Testing Reports");
//		
//		extent = new ExtentReports();
//		extent.attachReporter(report);
//		extent.setSystemInfo("SJS", "Tester");
//	}

	@Test
	public void data() throws IOException
	{
		extent.createTest("test");
//		excellDriven2 drive= new excellDriven2();
//		ArrayList<String> list=drive.getData("Letty");
//			System.out.println( list.get(5));
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			excellData1 data = new excellData1();
			ArrayList a= 	data.getData("letty");
			String username=(String) a.get(1);
			String password=(String) a.get(6);
			driver.get("https://sso.teachable.com/secure/9521/identity/login");
			driver.findElement(By.cssSelector("input[id='email']")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.cssSelector("input[value='Login']")).click();
			extent.flush();
	}
}
