package com.cart.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {

	public static Logger log;
	
	public void log() {
		 log= LogManager.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	public static void startTest() {
		System.out.println("================= Test Started =================");
	}
	
	public static void endTest() {
		System.out.println("================= Test Ended =================");
	}
}
