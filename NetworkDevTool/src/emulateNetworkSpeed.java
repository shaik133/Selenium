import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v94.network.Network;
import org.openqa.selenium.devtools.v94.network.model.ConnectionType;

public class emulateNetworkSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		DevTools devTools= driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.loadingFailed(), loadingfailed ->
		{
			System.out.println( loadingfailed.getErrorText());
		}
				);
		long startTime= System.currentTimeMillis();
		devTools.send(Network.emulateNetworkConditions(true, 3000, 10000, 30000, Optional.of(ConnectionType.CELLULAR2G)));
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink='/library']")).click();
		long endTime= System.currentTimeMillis();
		System.out.println(startTime-endTime);
	}

}
