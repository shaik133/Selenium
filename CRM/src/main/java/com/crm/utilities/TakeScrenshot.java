package com.crm.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScrenshot {

	public static String takeScreenshot(WebDriver driver, String testname ) throws IOException
	{
		String timestamp= new SimpleDateFormat("yyyy.MM.dd.hh.MM.ss").format(new Date());
		String screenshotLocation=System.getProperty("user.dir")+"\\Screenshot\\"+testname+"_"+timestamp+".png";
		TakesScreenshot Sshot= (TakesScreenshot)driver;
		File src=Sshot.getScreenshotAs(OutputType.FILE);
		String destination= (screenshotLocation);
		FileUtils.copyFile(src, new File(destination));
		return destination;
	}
}
