package com.nrown.core.framework.webdriver;

import org.openqa.selenium.By;

public class FindBy 
{
	public static By findLocator(String locator, String locatorVal)
	{
		By by = null;
		try
		{
			switch(locator.toLowerCase())
			{
				case "class_name":
					by = By.className(locatorVal);
					break;
				case "linktext":
					by = By.linkText(locatorVal);
					break;
				case "partial_linktext":
					by = By.partialLinkText(locatorVal);
					break;
				case "name":
					by = By.name(locatorVal);
					break;
				case "tagname":
					by = By.tagName(locatorVal);
					break;
				case "id":
					by = By.id(locatorVal);
					break;
				case "xpath":
					by = By.xpath(locatorVal);
					break;
				case "css_selector":
					by = By.cssSelector(locatorVal);
					break;
				default:
					throw new IllegalArgumentException("Unable to figure out valid locator");
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}
}
