package demoPractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
static ExtentReports extent;
	public static ExtentReports report()
	{
		String path= System.getProperty("user.dir"+"\\reports\\index.html");
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("automation report");
		reporter.config().setDocumentTitle("report");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sadiq");
		return extent;
		
		
		
	}
}
