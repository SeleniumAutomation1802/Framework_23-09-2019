package com.nrown.core.framework.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSexercuter
{
	public JavascriptExecutor js;
	public SeWebDriver sdriver; 
	public WebElement element;
	
	public JSexercuter(WebDriver driver)
	{
		js = (JavascriptExecutor)driver;
		sdriver = new SeWebDriver(driver);
	}
	
	public void setValueByJse(String s1, String locator, String locatorValue)
	{
		element = sdriver.find_element(locator, locatorValue);
		js.executeScript("arguments[0].value='"+s1+"'", element);
	}
	
	public void clickByJsexecuter(String locator, String locatorValue)
	{
		element = sdriver.find_element(locator, locatorValue);
		js.executeScript("arguments[0].click();", element);
	}
	
	public void scrollByJsexecuter(String locator, String locatorValue)
	{
		element = sdriver.find_element(locator, locatorValue);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void drawBroder(String locator, String locatorValue)
	{
		element = sdriver.find_element(locator, locatorValue);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	public void highlightWebElm(String locator, String locatorValue)
	{
		element = sdriver.find_element(locator, locatorValue);
		
		String bgColor = element.getCssValue("backgroundColor:");
		int i = 0;
		while(i<1000)
		{
			colorWebElm(bgColor, element);
			colorWebElm("#ff0000", element);
			i++;
		}
	}
	
	public void colorWebElm(String color , WebElement element)
	{
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	}
	
	public void refreshByJSE()
	{
		js.executeScript("history.go(0)");
	}
	
	public String captureTitleByJSE()
	{
		return js.executeScript("return document.title;").toString();
	}
	
	public String innerTextByJSE(String locator, String locatorValue)
	{
		element = sdriver.find_element(locator, locatorValue);
		return js.executeScript("return document.documentElement.innerText;", element).toString();
	}
	
	public void alertPopUp()
	{
		js.executeScript("alert('Value has been entered');");
	}
}
