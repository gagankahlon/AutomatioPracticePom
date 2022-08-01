package com.qa.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automationpractice.util.ElementUtil;

public class PaymentPage {

	private WebDriver driver;
	private ElementUtil eleUtil ;

	public PaymentPage(WebDriver driver) {
		this.driver=driver;
	eleUtil=new ElementUtil(driver);
   }
	private By payment=By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
	private By checkPayment=By.xpath("//*[@id=\"center_column\"]/form/div/h3");
	private By confirmOrder=By.xpath("//span[text()='I confirm my order']");
	
	public void paymentmethod() {
		eleUtil.doClick(payment);
	}
	public void checkPaymentHeader() {
		eleUtil.doIsDisplayed(checkPayment);
	}
	
	public void confirmOrderBtn() {
		eleUtil.doClick(confirmOrder);
	}
	
}

