import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class javaScriptError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
	LogEntries entry= driver.manage().logs().get(LogType.BROWSER);
	List<LogEntry> log= entry.getAll();
	
	for (LogEntry e: log)
	{
	System.out.println(e.getMessage());
	}
	}

}
