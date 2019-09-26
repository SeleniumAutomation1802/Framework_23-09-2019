package com.nrown.app.businessspecificlib_JDW;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.nrown.app.pageobjectlib.jdw.HomePage_JDW;
import com.nrown.core.framework.webdriver.SeWebDriver;

public class HomePageBL_JDW 
{
	public SeWebDriver sdriver;
	public HomePageBL_JDW(WebDriver driver)
	{
		sdriver = new SeWebDriver(driver);
	}
	public void searchProduct(String productNameOrNum)
	{
		try
		{
			WebElement w1 = sdriver.find_element("id", HomePage_JDW.searchTxtBox_id);
			w1.sendKeys(productNameOrNum);
			WebElement w2 = sdriver.find_element("id", HomePage_JDW.searchBtn_id);
			w2.click();
			verifyPLPPage();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifyPLPPage()
	{
		try
		{
			List<WebElement> w1 = sdriver.find_elements("xpath", "(//label[text()='View'])[1]");
			if(w1.size()>=1)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false, "We are not in PLP page");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
