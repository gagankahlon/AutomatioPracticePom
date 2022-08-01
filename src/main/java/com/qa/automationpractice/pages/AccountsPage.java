package com.qa.automationpractice.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.automationpractice.util.ElementUtil;

public class AccountsPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
			
	
	private By header = By.cssSelector("div#center_column h1");
	private By search=By.cssSelector("#search_query_top");
	private By category=By.linkText("WOMEN");
	private By selectproduct=By.xpath("//*[@id='center_column']/ul/li[3]/div/div[2]/h5/a");
	private By subCategory=By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a");
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	   }
	
	public String getAccountsPageHeader() {
		return eleUtil.doGetText(header);
	}	
	
	
	public boolean isSearchExist() {
	return eleUtil.getElement(search).isDisplayed();
	}
	
	public void getCategory()  {
		eleUtil.doMoveToElement(category);
		
        
	}
	
	public void subCategorySelect() throws Throwable  {
		eleUtil.doClickOnChildMenu(category, subCategory);	
		//Thread.sleep(2000);
	
	}
	

	
	public ProductInfoPage selectElement()  {
		
  eleUtil.waitForElementToBeVisibleWithWebElement(selectproduct, 2000, 20).click();
			return new ProductInfoPage(driver);
	
	}
}
	


