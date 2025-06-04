/**
 * 
 */
package com.my_store.qa.utilities;

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
public class ExtentReportUtility {
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void extent() throws IOException
	{
		String timestamp= new SimpleDateFormat("yyyy.MM.dd.hh.MM.ss").format(new Date());
		String path=System.getProperty("user.dir")+"\\Reports\\Test-Report"+"_"+timestamp+".html";
		reporter = new ExtentSparkReporter(path);
		reporter.loadXMLConfig("extent-config.xml");
		reporter.config().setDocumentTitle("Extent_Reports");
		reporter.config().setReportName("Test_Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "SJS");
		extent.setSystemInfo("Environment", "Qa");
		extent.setSystemInfo("OpertaingSystem", "Windows10");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	
	public static void flush()
	{
		extent.flush();
	}
	
	
}
