package com.qa.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.automationpractice.util.ElementUtil;

public class AddressPage {

	private WebDriver driver;
	private ElementUtil eleUtil ;

	public AddressPage(WebDriver driver) {
		this.driver=driver;
	eleUtil=new ElementUtil(driver);
   }
	
private	By address=By.xpath("(//h3[@class='page-subheading'])[1]");
private By checkOut=By.xpath("//span[text()='Proceed to checkout']");
private By checkBox=By.xpath("//div[@class='checker']");

public void addressverify() {
	eleUtil.doIsDisplayed(address);
}

public void checkOut() {
	eleUtil.doClick(checkOut);
}

public void checkBox() {
	eleUtil.doClick(checkBox);
	}
public PaymentPage proceedtocheckoutButton() {
	eleUtil.doClick(checkOut);
	return new PaymentPage(driver);
}
}
