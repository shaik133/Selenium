/**
 * 
 */
package com.cmr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cmr.qa.action.Actions;
import com.cmr.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class AdminSystemUserPage extends BasePage {
	
	public AdminSystemUserPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addBtn;
	
	public AdminSaveSystemUserPage clickAddBtn()
	{
		Actions.click(addBtn);
		return new AdminSaveSystemUserPage();
	}
}
