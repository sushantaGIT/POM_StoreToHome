package com.store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.store.qa.base.TestBase;

public class AddressPage extends TestBase{
	
	//---------------- Define Page Factory - OR ----------------------------
	@FindBy(xpath = "//div/h1[text()='My addresses']")
	WebElement myAddressPageTitle;
	
	@FindBy(xpath = "//*[@title='Add an address']")
	WebElement addNewAddressBtn;
	
	@FindBy(xpath="//*[@name=\"firstname\"]")
	WebElement firstNameTxt;
	
	@FindBy(xpath="//*[@name=\"lastname\"]")
	WebElement lastNameTxt;
	
	@FindBy(name="address1")
	WebElement address1Txt;
	
	@FindBy(name="city")
	WebElement cityTxt;
	
	@FindBy(name="id_state")
	WebElement stateDn;
	
	@FindBy(name="postcode")
	WebElement zipCodeTxt;
	
	@FindBy(name="id_country")
	WebElement countryDn;
	
	@FindBy(name="phone")
	WebElement homePhoneTxt;
	
	@FindBy(name="phone_mobile")
	WebElement mobilePhoneTxt;
	
	@FindBy(name="alias")
	WebElement addressAliasTxt;
	
	@FindBy(name="submitAddress")
	WebElement saveBtn;
	
	
		
	
	
	
	// To initialize the elements or Page objects with the help of page factory
	// Create the Constructor of this class once again and using the 'initElements' (Initialize Elements) method
	// 'this' means it will initialize the current class objects
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	// ------------------ Define different Actions of Login Page ---------------------------------
	public boolean checkMyAddressPageTitle() {
		return myAddressPageTitle.isDisplayed();
	}
	
	public void clickAddNewAddress() {
		addNewAddressBtn.click();
	}
	
	public void addNewAddress(String ftName, String ltName, String add1, String city, String st, 
			String zip, String cont, String ph, String mob, String alias) {
		firstNameTxt.sendKeys(ftName);
		lastNameTxt.sendKeys(ltName);
		address1Txt.sendKeys(add1);
		cityTxt.sendKeys(city);
		
		Select select = new Select(stateDn);
		select.selectByVisibleText(st);
		zipCodeTxt.sendKeys(zip);
		Select select1 = new Select(countryDn);
		select1.selectByVisibleText(cont);
		homePhoneTxt.sendKeys(ph);
		mobilePhoneTxt.sendKeys(mob);
		addressAliasTxt.sendKeys(alias);
		saveBtn.click();
			
	}
	

}
