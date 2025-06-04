package reports1.extent;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepo.homePage;
import objectRepo.signUpPage;

public class homePageTest extends Initiate {
	ExtentReports extent;
	@BeforeTest
	public void reports()
	{
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("smoke test report");
		reporter.config().setDocumentTitle("Testing Report");
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "SJS");
	}
	
	@Test
	public void homeTest() throws IOException, InterruptedException
	{
		extent.createTest("Report");
		driver=invoke();
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		
		homePage hp= new homePage(driver);
		hp.uname().sendKeys("uname");
		hp.pwd().sendKeys("pwd");
//		hp.logIn().click();
//		Thread.sleep(3000);
		signUpPage sup=hp.signup();
		sup.fullName().sendKeys("SJS");
		sup.email().sendKeys("shaik@gmail.com");
		sup.password().sendKeys("password");
		sup.checkBox().click();
		sup.signUp().click();
		extent.flush();
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
