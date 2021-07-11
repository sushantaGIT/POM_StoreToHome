package com.store.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.store.qa.base.TestBase;
import com.store.qa.pages.AddressPage;
import com.store.qa.pages.CommonElementPage;
import com.store.qa.pages.LoginPage;
import com.store.qa.pages.MyAccountPage;
import com.store.qa.util.TestUtil;

public class AddressTest extends TestBase{
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	CommonElementPage commonElementPage;
	AddressPage addressPage;
	
	
	String sheetName = "AddAddress";
	
		
	// Create constructor for superclass from TestBase class where all properties are defined
			public AddressTest() {
			super();
		}
	
		//TestNG Annotations
			@BeforeTest
			public void setUp() {
				initialization();
				loginPage=new LoginPage();
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			}	
	
			@DataProvider
			public Object[][] getTestData() {
				Object data[][] = TestUtil.getTestData(sheetName);
				return data;
			}
			
			@Test(priority=1)
			public void goToMyAddresses() {
				myAccountPage = new MyAccountPage();
				myAccountPage.clickMyAddressesTab();
			}
			@Test(priority=2)
			public void verifyMyAddressHeader() {
				addressPage = new AddressPage();
				Assert.assertTrue(addressPage.checkMyAddressPageTitle(), "My Addresses page header is missing on the page.");
			}
			
			
			@Test(priority=3, dataProvider="getTestData")
			public void addNewAddress(String FirstName, String LastName, String Address, String City, String State, String Zip,
					String Country, String Phone, String Mobile, String Alias) {
				addressPage = new AddressPage(); 
				addressPage.clickAddNewAddress();
				//yourAddressesPage.addNewAddress("Tom", "Peter", "Cam road", "London", "Florida", "12345", "United States", "1234567890", "1231231231", "Addrs1");
				addressPage.addNewAddress(FirstName, LastName, Address, City, State, Zip, Country, Phone, Mobile, Alias);
				
			}
			
	
	
	
	
	
	
			@AfterTest
			public void tearDown() {
				driver.quit();
			}
		
	

}
