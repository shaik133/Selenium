/**
 * 
 */
package com.crm.qa.utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @author Admin
 *
 */
public class ExtentReport {

	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setupReports() throws IOException
	{
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String reportname= System.getProperty("user.dir")+"\\Reports\\Test_report_"+timestamp;
		reporter = new ExtentSparkReporter(reportname);
		reporter.loadXMLConfig("extent-config.xml");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setReportName("Extent Report");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("Test_Report");
		
		extent.setSystemInfo("Tester", "SJS");
		extent.setSystemInfo("Env", "QA");
		
	}
	
	public static void extentFlush()
	{
		extent.flush();
	}
}
