package com.nrown.core.framework.webdriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.nrown.core.framework.utilities.Global;

public class SeWebDriver
{
	public WebDriver driver;
	public WebElement element;
	public List<WebElement> lstElement;
	
	public SeWebDriver(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void get(String url)
	{
		try
		{
			driver.get(url);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public WebElement find_element(String locator, String locatorVal)
	{
		try
		{
			element = driver.findElement(FindBy.findLocator(locator, locatorVal));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}
	
	public List<WebElement> find_elements(String locator, String locatorVal)
	{
		try
		{
			lstElement = driver.findElements(FindBy.findLocator(locator, locatorVal));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lstElement;
	}
	
	public String getTitle()
	{
		String title = null;
		try
		{
			title = driver.getTitle();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return title;
	}
	
	public String getCurrentUrl()
	{
		String url = null;
		try
		{
			url = driver.getCurrentUrl();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return url;
	}
	
	public String getPageSourceCode()
	{
		String pageSource = null;
		try
		{
			pageSource = driver.getPageSource();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return pageSource;
	}
	
	public Options manage()
	{
		Options o1 = null;
		try
		{
			o1 = driver.manage();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return o1;
	}
	
	public Timeouts time_out()
	{
		Timeouts t = null;
		try
		{
			t = manage().timeouts();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return t;
	}
	
	public void implecitlyWait()
	{
		try
		{
			time_out().implicitlyWait(Global.syncTime, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void explicitlyWait(String locator, String locatorVal)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Global.syncTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(FindBy.findLocator(locator, locatorVal)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void pageLoadWait()
	{
		try
		{
			time_out().pageLoadTimeout(Global.syncTime, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void captureScreenShot()
	{
		ITestResult itr = null;
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(Global.pathOfScreenShotFld+"\\"+itr.getMethod().getMethodName());
			FileHandler.copy(src, dest);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void close()
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
