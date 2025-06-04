package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffsearchPagePF {

	WebDriver driver;
	public rediffsearchPagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  // this needs to be initiated
	}
//Page object Factory methods
	@FindBy(id="srchword")
	WebElement inputSearch;
	@FindBy(xpath="\"//input[@class='newsrchbtn']")
	WebElement search;

	
	public WebElement search()
	{
		return inputSearch;
	}
	public WebElement searchbtn()
	{
		return search;
	}
}
