package com.crm.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;

public class Log {
	
	public static Logger log;
	
	
	public void logging() {
		 log= LogManager.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	public static void startTest() {
		System.out.println("=================  Test Started =================");
	}
	
	public static void endTest() {
		System.out.println("=================  Test Ended =================");
	}
	
}
