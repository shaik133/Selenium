/**
 * 
 */
package com.cmr.qa.pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cmr.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class EmployeeTimesheet extends BasePage{

	
	public EmployeeTimesheet()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='oxd-table-cell oxd-padding-cell'][1]")
	List<WebElement> listOfEmpNames;
	
	
	public void listofNames()
	{
		 
		 for (int i=0;i<listOfEmpNames.size();i++)
		 {
			 
		 }
	}
	
}
