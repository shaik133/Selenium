///**
// * 
// */
//package com.cmr.qa.utilities;
//
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
///**
// * @author Admin
// *
// */
//public class Extent_Reports {
//
//	
//	public static void report()
//	{
//		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		String path=System.getProperty("user.dir")+"\\Extent_Reports\\Report_"+timestamp+".html";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		try {
//			reporter.loadXMLConfig("extent-config.xml");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		reporter.config().setDocumentTitle("Test Results");
//		reporter.config().setReportName("Testing report");
//		
//		ExtentReports extent = new 
//	}
//}
