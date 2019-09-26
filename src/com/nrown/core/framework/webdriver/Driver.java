package com.nrown.core.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.nrown.core.framework.utilities.Global;

public class Driver
{
	public static WebDriver driver;
	public static WebDriver getDriver()
	{
		try
		{
			String browser = Global.browser;
			
			switch(browser)
			{
				case "ff":
					System.setProperty("webdriver.gecko.driver", Global.ffserver);
					driver =  new FirefoxDriver();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", Global.ieserver);
					driver = new InternetExplorerDriver();
					break;
				case "chrome":
					System.setProperty("webdriver.chrome.driver", Global.chromeServer);
					driver = new ChromeDriver();
					break;
				default:
					throw new Exception("Invalid Exception");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}
}
