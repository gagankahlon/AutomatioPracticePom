package com.qa.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automationpractice.util.ElementUtil;

public class ShoppingCartPage {
	private WebDriver driver;
	private ElementUtil eleUtil;

   public ShoppingCartPage(WebDriver driver) {
	this.driver=driver;
    eleUtil=new ElementUtil(driver);
}
 private By checkAvailability=By.xpath("//*[@id=\"product_7_34_0_722492\"]/td[3]/span");
 private By checkOutBtn=By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
 
 public void checkAvailabeStock() {
	 eleUtil.doIsDisplayed(checkAvailability);
 }

public AddressPage checkoutButton() {
	eleUtil.doClick(checkOutBtn);
	return new AddressPage(driver);
}

}