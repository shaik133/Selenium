import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabConnect {

//	public static final String USERNAME= "oauth-shaikjafarsadq-735cc";
//	public static final String ACCESS_KEY= "5cded016-03b0-444f-94b2-20311a9512e8";
//	public static final String URL ="http://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static void main(String[] args) throws MalformedURLException {
//		// TODO Auto-generated method stub
//
//		ChromeOptions browserOptions = new ChromeOptions();
//		browserOptions.setCapability("platform", "Windows 10");
//		browserOptions.setCapability("version", "94");
//
//		Map<String, Object> sauceOptions = new HashMap<>();
//		sauceOptions.put("username", System.getenv("oauth-shaikjafarsadq-735cc"));
//		sauceOptions.put("accessKey", System.getenv("5cded016-03b0-444f-94b2-20311a9512e8"));
//		
//
//		browserOptions.setCapability("sauce:options", sauceOptions);
//		URL url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");
//		
////		DesiredCapabilities caps = DesiredCapabilities.chrome();
////		caps.setCapability("platform", "Windows 10");
////		caps.setCapability("version", "94");
//		
//		WebDriver driver = new RemoteWebDriver(url, browserOptions);

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		https://the-internet.herokuapp.com/
		driver.get("https://the-internet.herokuapp.com/");
	System.out.println(	driver.getTitle());
		}

}
