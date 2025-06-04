package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.sdk.metrics.internal.aggregator.DropAggregator;

public class selectDropdown {

	
	WebDriver driver;
	
	public selectDropdown(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(name="ctl00$mainContent$DropDownListCurrency")
private	WebElement dropdown;
	
By incrementClick= By.id("divpaxinfo");

By adultIncrement = By.id("hrefIncAdt");

By childincrement = By.id("hrefIncChd");

By departurFrom = By.id("ctl00_mainContent_ddl_originStation1_CTXT");

By departureCity = By.cssSelector("a[value='PNQ']");

By arrivalCity =By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CJB']");

By autosuggest = By.id("autosuggest");



	
	public Select select_list()
	{
		return new Select(dropdown);
	}
	
public WebElement IncClick()
{
	return driver.findElement(incrementClick);
}
public WebElement adultInc()
{
	return driver.findElement(adultIncrement);
}

public WebElement childInc()
{
	return driver.findElement(childincrement);
}

public WebElement from()
{
	return driver.findElement(departurFrom);
}

public WebElement departCity()
{
	return driver.findElement(departureCity);
}


public WebElement arrivalCity()
{
	return driver.findElement(arrivalCity);
}

public WebElement autoSuggest()
{
	return driver.findElement(autosuggest);
}
}
	

