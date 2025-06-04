/**
 * 
 */
package com.ati.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Admin
 *
 */
public  class ScreenShot {

	public static String takeScreenShot(WebDriver driver, String Testname) throws IOException
	{
	
	String timestamp= new SimpleDateFormat("yyyy.MM.dd.hh.MM.ss").format(new Date());
	String path=System.getProperty("user.dir")+"\\ScreenShots\\"+Testname+"_"+timestamp+".png";
	
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File src= screenshot.getScreenshotAs(OutputType.FILE);
	String dst= path;
	FileUtils.copyFile(src, new File (dst));
	return dst;
}
}