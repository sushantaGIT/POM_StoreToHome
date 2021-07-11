package com.store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.store.qa.base.TestBase;

public class MyAccountPage extends TestBase{

	//---------------- Define Page Factory - OR ----------------------------
	@FindBy(xpath="//*[text()='Order history and details']")
	WebElement orderHistoryAndDetailsTab;
	
	@FindBy(xpath="//*[@title=\"Addresses\"]")
	WebElement myAddressesTab;
	
	
	
	
	
	
	
	// To initialize the elements or Page objects with the help of page factory
	// Create the Constructor of this class once again and using the 'initElements' (Initialize Elements) method
	// 'this' means it will initialize the current class objects
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	// ------------------ Define different Actions of Login Page ---------------------------------
	public void clickOrderHistoryTab() {
		orderHistoryAndDetailsTab.click();
	}
	
	public void clickMyAddressesTab() { 
		  myAddressesTab.click(); 
	}
	 
	
	
	
}
