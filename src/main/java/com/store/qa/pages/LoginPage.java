package com.store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.store.qa.base.TestBase;

//All Pages are child of TestBase class; So need to define each Page class as extends Base class as below -
public class LoginPage extends TestBase{

	//---------------- Define Page Factory - OR ----------------------------
	@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
	WebElement logoImage;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	WebElement loginBtn;
	
	
	
	
	
	// To initialize the elements or Page objects with the help of page factory
	// Create the Constructor of this class once again and using the 'initElements' (Initialize Elements) method
	// 'this' means it will initialize the current class objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// ------------------ Define different Actions of Login Page ---------------------------------
	// Check Logo displayed or not; the return type is True or false which is boolean type
	public boolean validateSiteLogo(){
		return logoImage.isDisplayed();
	}
	
	// Title will return a String type, So declared as Public String
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	// The return type of Loginpage is Homepage which is the landing page after login
	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
}
