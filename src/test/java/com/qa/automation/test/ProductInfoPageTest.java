package com.qa.automation.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ProductInfoPageTest extends BaseTest{

	@BeforeClass 
	public void productInfoPageSetup() throws Throwable {
		productInfoPage=accountsPage.selectElement();
	}

	@Test
	public void selectQtyTest() {
		productInfoPage.selectQty();	
	}
	@Test
	public void selectSizeTest() {
		productInfoPage.selectSize();	
	}
	@Test
	public void addToCartTest() {
		productInfoPage.addCartButton();	
	}
	@Test
	public void proceedToCheckoutTest() {
	shoppingCartPage=	productInfoPage.proceedToCheckoutPage();	
	}
}
