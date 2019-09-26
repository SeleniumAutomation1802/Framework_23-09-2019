package com.nrown.core.framework.webcomponent;

import org.openqa.selenium.WebElement;

import com.nrown.core.framework.datalayer.Property;
import com.nrown.core.framework.webdriver.SeWebDriver;
import com.nrown.core.framework.webdriver.SeWebElement;

public class WebButton implements IWebComponents
{
	private SeWebDriver sedriver;
	private SeWebElement element;
	private String findby;
	private String locator;
	
	public WebButton(SeWebDriver sedriver, String findby, String locatorVal)
	{
		this.sedriver=sedriver;
		this.findby=findby;
		this.locator=locatorVal;
		sedriver.explicitlyWait(findby, locator);
		WebElement w1 = sedriver.find_element(findby, locator);
		element = new SeWebElement(w1);
	}
	
	@Override
	public Boolean isExist() {
		return element.isAvailableForAction();
	}

	@Override
	public String getProperty(String prp) {
		return Property.getConfigData(prp);
	}

	@Override
	public String getFindBy() {
		
		return locator;
	}

	@Override
	public void captureScreenShot()
	{
		sedriver.captureScreenShot();
		
	}

	@Override
	public String getLocator() {
		return findby;
	}

	@Override
	public Boolean isEnabled() {
		return element.isEnabled();
	}

	@Override
	public SeWebElement getSeWebElement() {
		return element;
	}

	@Override
	public void click() {
		element.click();
		
	}
}
