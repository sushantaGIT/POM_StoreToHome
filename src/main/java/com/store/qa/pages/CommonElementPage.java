package com.store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.store.qa.base.TestBase;

public class CommonElementPage extends TestBase{

	//---------------- Define Page Factory - OR ----------------------------
	@FindBy(xpath = "//ul/li/a[@href=\"http://automationpractice.com/index.php?controller=my-account\"]")
	WebElement backToYourAccountBtn;		
	
	
	
	
	
	
	// To initialize the elements or Page objects with the help of page factory
	// Create the Constructor of this class once again and using the 'initElements' (Initialize Elements) method
	// 'this' means it will initialize the current class objects
	public CommonElementPage() {
		PageFactory.initElements(driver, this);
	}
	
	// ------------------ Define different Actions in Login Page ---------------------------------
	public void clickBackToYourAccountBtn() {
		backToYourAccountBtn.click();
	}
	
	
	
}
