/**
 * 
 */
package com.crm.qa.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Admin
 *
 */

public class logs {

	public static Logger log= LogManager.getLogger(logs.class.getName());
	
	
	
	public static void startTest(String testcasename)
	{
		log.info("==============Start test case "+testcasename+ "==============" );
	}
	
	public static void endTest(String testcasename) 
	{
		log.info("============End test Case "+testcasename+ "===========");
	}
	
	public static void info(String message)
	{
		log.info(message);
	}
	
	public static void debugg(String message)
	{
		log.debug(message);
	}
	
	public static void error(String message)
	{
		log.error(message);
	}
}

