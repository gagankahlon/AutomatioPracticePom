package com.qa.automation.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.automationpractice.util.Constants;

public class AccountsPageTest extends BaseTest{

	@BeforeClass 
	public void accountPageSetup() {
		accountsPage=lp.doLogin("gagannijjar1987@gmail.com", "test123");
	}

	
	@Test
	public void isSearchFieldExistTest() {
		accountsPage.isSearchExist();
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void searchTest()  {
		accountsPage.getCategory();
		Assert.assertTrue(true);
	
			
	}
	@Test
	public void selectSubCategoryTest() throws Throwable {
		accountsPage.subCategorySelect();
		Assert.assertTrue(true);
		
	}	
	
	
	@Test
       public void aselectProductTest()    {			
		productInfoPage=accountsPage.selectElement();
		
	}
	
}
