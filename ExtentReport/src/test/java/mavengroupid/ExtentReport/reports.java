package mavengroupid.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class reports {
	ExtentReports extent;
@BeforeTest

	public void config() {
	String path= System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	
	reporter.config().setReportName("WebReport");
	reporter.config().setDocumentTitle("Extent Report");
	
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "SJS");
}
	
	@Test
	public void reports() 
	{
		extent.createTest("reports");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");	
		System.out.println(driver.getTitle());
		extent.flush();
	}
}
