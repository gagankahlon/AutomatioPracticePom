package com.qa.automationpractice.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) {
		System.out.println("brower name is:"+ browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
				}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
	}
		else {
			System.out.println("please pass the right browser"+ browserName);
			
		}
		
driver.manage().window().fullscreen();
driver.manage().deleteAllCookies();
driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
return driver;
}
	
public Properties init_prop() {
	prop=new Properties();
	try {
		FileInputStream ip=new FileInputStream("./AutomationPractice/src/test/java");
		
	} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return prop;

}}