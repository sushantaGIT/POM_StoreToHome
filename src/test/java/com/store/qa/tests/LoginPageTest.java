package com.store.qa.tests;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.store.qa.base.TestBase;
import com.store.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	// Create constructor for superclass from TestBase class where all properties are defined
	
	public LoginPageTest() {
		super();
	}
	
	//What is log? : capturing info/activities at the time of program execution. 
	// types of logs:
		//1. info
		//2. warn
		//3. debug
		//4. fatal
		
	//how to generate the logs? : use Apache log4j API (log4j jar)
	//How it works? : it reads log 4j configuration from log4j.properties file
	//where to create: create inside resources folder
	WebDriver driver;
	Logger log = Logger.getLogger(LoginPageTest.class);
	
	
	
	//TestNG Annotations
	@BeforeTest
	public void setUp() {
		initialization();
		// Create the object of LoginPage class; create LoginPage constructor
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void logoImageTest() {
		boolean flag = loginPage.validateSiteLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login - My Store");
	}
	
	@Test(priority=3)
	public void loginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
