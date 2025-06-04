package testngPractice.revise;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepo.forgotPwd;
import objectRepo.login;

public class loginPage extends initiating {
	ExtentReports extent;
	public void config()
	{
	ExtentSparkReporter report= new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
	report.config().setReportName("Extentreport");
	report.config().setDocumentTitle("Testing Report");
	 
	 extent = new ExtentReports();
	extent.attachReporter(report);
	
	}
	@Test
	public void logIn() throws IOException
	{
		extent.createTest("Test");
		
	driver=	invoke();
	driver.get("https://sso.teachable.com/secure/9521/identity/login");
	
	login log = new login(driver);
	log.username().sendKeys("kutub");
	log.password().sendKeys("matub");
	//log.login().click();

	forgotPwd fp=log.forgotPw();
	fp.email().sendKeys("hhhd");
	fp.next().click();
	extent.flush();
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
