package com.qa.automation.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.automationpractice.factory.DriverFactory;
import com.qa.automationpractice.pages.AccountsPage;
import com.qa.automationpractice.pages.AddressPage;
import com.qa.automationpractice.pages.LoginPage;
import com.qa.automationpractice.pages.PaymentPage;
import com.qa.automationpractice.pages.ProceedToCheckoutPage;
import com.qa.automationpractice.pages.ProductInfoPage;
import com.qa.automationpractice.pages.ShoppingCartPage;



public class BaseTest {
DriverFactory df;
WebDriver driver;
LoginPage lp;
Properties prop;
AccountsPage accountsPage;
AddressPage addressPage;
PaymentPage paymentPage;
ProductInfoPage productInfoPage;
ProceedToCheckoutPage productCheckOut;
ShoppingCartPage shoppingCartPage;

	@BeforeTest
	public void setup() {
		df=new DriverFactory();
		driver=df.init_driver("chrome");
		lp=new LoginPage(driver);
		prop=df.init_prop();
			
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}


