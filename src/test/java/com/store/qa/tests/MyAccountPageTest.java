package com.store.qa.tests;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.store.qa.base.TestBase;
import com.store.qa.pages.CommonElementPage;
import com.store.qa.pages.LoginPage;
import com.store.qa.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase{

	LoginPage loginPage;
	MyAccountPage myAccountPage;
	CommonElementPage commonElementPage;
	
		
	// Create constructor for superclass from TestBase class where all properties are defined
			public MyAccountPageTest() {
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
			Logger log = Logger.getLogger(MyAccountPageTest.class);
			
			
		//TestNG Annotations
		@BeforeTest
		public void setUp() {
			initialization();
			loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@Test(priority=1)
		public void goToOrderHistory() {
			myAccountPage = new MyAccountPage();
			commonElementPage = new CommonElementPage();
			myAccountPage.clickOrderHistoryTab();
			commonElementPage.clickBackToYourAccountBtn();
		}

		
		@Test(priority=2)
		public void goToMyAddresses() {
			myAccountPage = new MyAccountPage();
			commonElementPage = new CommonElementPage();
			myAccountPage.clickMyAddressesTab();
			commonElementPage.clickBackToYourAccountBtn();
		}
		
		
		
		@AfterTest
		public void tearDown() {
			driver.quit();
		}
	
	
}
