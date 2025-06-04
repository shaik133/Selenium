/**
 * 
 */
package com.cmr.qa.utilities;

import org.apache.log4j.Logger;


/**
 * @author Admin
 *
 */
public class Logs {
	static Logger log;

	public  void loadLog4j() {
		log = Logger.getLogger(getClass());
//		PropertyConfigurator.configure("log4j.properties");
	}

	
	public  static void startTest(String testcasename)
	{
		log.info("<<<<<<<<<<<<<<<<<<<<<<< TEST STARTED >>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	
	public static void endTest(String testcasename)
	{
		log.info("<<<<<<<<<<<<<<<<<<<<<<< TEST ENDED >>>>>>>>>>>>>>>>>>>>>>>");
	}
}
