package com.qa.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automationpractice.util.ElementUtil;

public class ProductInfoPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
		
	private By qty=By.id("quantity_wanted");
	private By size=By.id("group_1");
	private By addtocart=By.xpath("//span[text()='Add to cart']");
	private By proceedToCheckout=By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
	
	public ProductInfoPage(WebDriver driver) {
		this.driver=driver;
	eleUtil=new ElementUtil(driver);
   }

	public void selectQty() {
		eleUtil.doSendKeys(qty, "2");
	}
	public void selectSize() {
		eleUtil.doSendKeys(size, "M");
	}
	public void addCartButton() {
		eleUtil.doClick(addtocart);
	}
	
	public ShoppingCartPage proceedToCheckoutPage() {
		eleUtil.doClick(proceedToCheckout);
		return new ShoppingCartPage(driver);
	}
}