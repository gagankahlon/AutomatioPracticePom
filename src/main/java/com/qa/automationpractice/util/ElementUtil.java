package com.qa.automationpractice.util;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.channel.unix.Errors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {

	
	private WebDriver driver;
	private Actions action ;
	

	public ElementUtil(WebDriver driver) {
		this.driver=driver;	
		action=new Actions(driver);
	}
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	public void doClear(By locator) {
		getElement(locator).clear();
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
		
	public void doSendKeys(By locator,String value) {
		doClear(locator);
		getElement(locator).sendKeys(value);
		
	}
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public void doClickOnChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
		doMoveToElement(parentMenuLocator);
		Thread.sleep(2000);
		doClick(childMenuLocator);
	}
	public WebElement waitForElementUsingWebDriverWait(By locator, int timeOut, int pollingTime) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

public void doMoveToElement(By locator) {
	Actions act = new Actions(driver);
	act.moveToElement(getElement(locator)).perform();
}
	public WebElement mousehoverclick(By locator) {
		WebElement ele=	driver.findElement(locator);
		  action.moveToElement(ele).click();
		  return ele;
			
		}
	public List<WebElement> waitForElementsToBeVisible(By locator, int timeOut, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public WebElement waitForElementToBeVisibleWithWebElement(By locator, int timeOut, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
}
