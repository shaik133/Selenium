/**
 * 
 */
package com.myntraproject.qa.utilities;

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
public class ExtentRepo {

	
	ExtentSparkReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	public void extentRepo()
	{
		String timestamp= new SimpleDateFormat("yyyy.MM.dd.hh.MM.ss").format(new Date());
		String path=System.getProperty("user.dir")+"\\ExtentReports\\Reports"+"_"+timestamp+".html";
		
		reporter= new ExtentSparkReporter(path);
		try {
			reporter.loadXMLConfig("extent-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reporter.config().setReportName("Extent reports");
		reporter.config().setDocumentTitle("Testing reports");
		reporter.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.setSystemInfo("Enironement", "testing");
		extent.setSystemInfo("Tester", "SJS");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Operating System", "Windows10");
	}
	
	public void flush()
	{
		extent.flush();
	}
	
}
