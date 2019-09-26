package com.nbrown.TestScenarioInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.nrown.core.framework.datalayer.Excel;
import com.nrown.core.framework.datalayer.Property;
import com.nrown.core.framework.utilities.Global;
import com.nrown.core.framework.webcomponent.WebButton;
import com.nrown.core.framework.webdriver.Driver;
import com.nrown.core.framework.webdriver.FindBy;
import com.nrown.core.framework.webdriver.SeWebDriver;
import com.nrown.core.framework.webdriver.SeWebElement;

public class TestInitializationScript
{
	public SeWebDriver sdriver;
	public Excel excel;
	public SeWebElement element;
	public FindBy by;
	public WebButton wbtn;
	public Global global;
	public Property pro;
	
	@BeforeClass
	public void openBrowser()
	{
		WebDriver driver = Driver.getDriver();
		pro = new Property();
		sdriver = new SeWebDriver(driver);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		try
		{
			String url = pro.getConfigData("url");
			sdriver.get(url);
			WebElement emailWebElm = sdriver.find_element("xpath", "//input[@id='identifierId']");
			emailWebElm.sendKeys("seleniumautomation1802");
			
			WebElement next1 = sdriver.find_element("xpath", "//span[text()='Next']");
			next1.click();
			
			Thread.sleep(5000);
			
			WebElement pswTxtBox = sdriver.find_element("name", "password");
			pswTxtBox.sendKeys("Abcd@123");
			
			WebElement next2 = sdriver.find_element("xpath", "//span[text()='Next']");
			next2.click();
			Thread.sleep(8000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		try
		{
			System.out.println("Logout from App.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		sdriver.close();
	}
	
	
	
	
}
