package com.nrown.core.framework.webdriver;

import org.openqa.selenium.WebElement;

public class SeWebElement
{
	public WebElement element;
	public SeWebDriver driver;
	public SeWebElement(WebElement element) 
	{
		this.element = element;
	}
	
	public void click()
	{
		try
		{
			element.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void sendKeys(String val)
	{
		try
		{
			element.sendKeys(val);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean isAvailableForAction() {
		if (isDisplayed() && isEnabled())
			return true;
		return false;
	}
	
	public boolean isDisplayed()
	{
		boolean flag = true;
		try
		{
			flag = element.isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean isEnabled()
	{
		boolean flag = true;
		try
		{
			flag = element.isEnabled();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	
	
}
