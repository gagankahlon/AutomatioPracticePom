package com.qa.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.automationpractice.util.Constants;

public class LoginPageTest extends BaseTest{
	
@Test
public void loginPageTitleTest() {
	
	String title=lp.getLoginPageTitle();
	System.out.println("page title:" +title);
	Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	
}

@Test
public void loginPageUrlTest() {
	String url=lp.getLoginPageUrl();
	System.out.println("page url : "+ url);
	Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_URL_FRACTION));
}

@Test
public void forgotPwdLinkTest() {
	Assert.assertTrue(lp.isForgotPwdLinkExist());
}

@Test
public void loginTest() {
	accountsPage=lp.doLogin("gagannijjar1987@gmail.com", "test123");
	Assert.assertEquals(accountsPage.getAccountsPageHeader(),Constants.ACCOUNT_PAGE_HEADER);

	}
}
