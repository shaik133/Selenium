package Practice.E2E;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener {

	public static ExtentSparkReporter reporter;
	public static ExtentHtmlReporter htmlreports;
	public static ExtentReports extent;
	public ExtentTest logger;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String timestamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		reporter= new ExtentSparkReporter(System.getProperty("user.dir")+"\\test-output\\"+timestamp+".html");
		reporter.loadXMLConfig(null);
		reporter.config().setReportName("TetsReports");
		reporter.config().setDocumentTitle("AutomationReport");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("username", "SJS");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extent.createTest(result.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extent.createTest(result.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		
		String ScreenShotPath= System.getProperty("user.dir")+"\\ScreenShot\\"+result.getName()+".png";
		
		File f= new File(ScreenShotPath);
		if (f.exists())
		{
			try {
				logger.fail("ScreenShot is as below " + logger.addScreenCaptureFromPath(ScreenShotPath));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		extent.createTest(result.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.BROWN));
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
