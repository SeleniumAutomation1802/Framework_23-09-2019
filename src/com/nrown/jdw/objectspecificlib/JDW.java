package com.nrown.jdw.objectspecificlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.nrown.core.framework.webdriver.Driver;
import com.nrown.core.framework.webdriver.SeWebDriver;

public class JDW 
{
	public SeWebDriver sdriver;
	public JDW(WebDriver driver) 
	{
		sdriver = new SeWebDriver(driver);
	}
	public void enterValueInTextBox(String labelName, String Value)
	{
		try
		{
			WebElement w1 = sdriver.find_element("xpath", "(//label[contains(text(),'"+labelName+"')]//following::input[1])[1]");
			w1.sendKeys(Value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickOnButton(String buttonName)
	{
		try
		{
			WebElement w1 = sdriver.find_element("xpath", "(//button[contains(text(),'"+buttonName+"')])[1]");
			w1.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickOnTopNav(String topNavlink)
	{
		try
		{
			WebElement w1 = sdriver.find_element("xpath", "(//a[text()='"+topNavlink+"'])[1]");
			w1.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickOnTopSubNav(String topNavMenuName, String subMenuName)
	{
		try
		{
			WebElement w1 = sdriver.find_element("xpath", "(//a[text()='"+topNavMenuName+"'])[1]");
			Actions act = new Actions(Driver.driver);
			act.moveToElement(w1).perform();
			WebElement w2 = sdriver.find_element("xpath", "(//a[text()='"+topNavMenuName+"']//following::a[text()='"+subMenuName+"'][1])[1]");
			w2.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
