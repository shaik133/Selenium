package com.crm.qa.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logs {

	public static Logger log = LogManager.getLogger(logs.class.getName());
	
	
	public static void startTest(String $testcasename)
	{
		log.info("==========="+ $testcasename +"Test Started ===========");
	}
	
	public static void endTest(String $testcasename)
	{
		log.info("============="+ $testcasename +"Test ended ===========");
	}
	
	
	public static void info(String message)
	{
		log.info(message);
	}
	
	public static void debug(String message)
	{
		log.debug(message);
	}
	
	public static void error(String message)
	{
		log.error(message);
	}
}
