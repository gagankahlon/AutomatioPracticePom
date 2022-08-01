package com.qa.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automationpractice.util.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	private By email=By.id("email");
	private By password=By.id("passwd");
	private By signbtn=By.xpath("//button[@id='SubmitLogin']");
	private By forgotpwd=By.linkText("Forgot your password?");
	
	
			
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean isForgotPwdLinkExist() {
		return eleUtil.doIsDisplayed(forgotpwd);
	}
	
    public AccountsPage	doLogin(String un,String pwd) {
	System.out.println("login with: " +un+":" +pwd);
	driver.findElement(email).sendKeys(un);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(signbtn).click();
	return new AccountsPage(driver);
}
	
	}
	

	
	
	

