package devTool;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v94.emulation.Emulation;

public class devtool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
DevTools devtools=driver.getDevTools();
devtools.createSession();

/*Map option = new HashMap();
option.put("width", 500);
option.put("height", 1000);
option.put("deviceScaleFactor", 50);
option.put("mobile", true);
driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", option);
//devtools.send(Emulation.setDeviceMetricsOverride(500, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
driver.get("https://rahulshettyacademy.com/sign_in/password/new/index.php");
driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
driver.findElement(By.linkText("Login")).click();
*/

//-------------------GeoLocationoverride---------------------
Map<String, Object> coordination = new HashMap<String, Object>();
coordination.put("latitude", 40);
coordination.put("longitude", 3);
coordination.put("accuracy", 1);
driver.executeCdpCommand("Emulation.setGeolocationOverride", coordination);
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("netfilx",Keys.ENTER);
driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).click();
}

}
