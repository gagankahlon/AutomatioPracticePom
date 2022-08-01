package com.qa.automation.test;

import org.testng.annotations.BeforeClass;

public class ShoppingCartPageTest extends BaseTest{
	@BeforeClass 
	public void productInfoPageSetup() throws Throwable {
		shoppingCartPage=	productInfoPage.proceedToCheckoutPage();
	}

	
	
	
}
