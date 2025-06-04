/**
 * 
 */
package com.ati.qa.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ati.qa.base.BasePage;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


/**
 * @author Admin
 *
 */
public class Listeners extends ExtentRepo implements ITestListener {


	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
extent.createTest(result.getName());
test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
if(result.getStatus()==ITestResult.FAILURE)
{
	extent.createTest(result.getName());
	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
	try {
		String path=ScreenShot.takeScreenShot(BasePage.driver, result.getName());
		test.fail("ScreenShot is "+test.addScreenCaptureFromPath(path));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		extent.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
extent.flush();
	}

}
