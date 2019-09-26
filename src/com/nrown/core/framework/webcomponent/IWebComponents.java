package com.nrown.core.framework.webcomponent;

import com.nrown.core.framework.webdriver.SeWebElement;

public interface IWebComponents 
{
		
		public void click();
	    public Boolean isExist();
	    public String getProperty(String prp);
	  
	    public String getFindBy();
	    public void captureScreenShot();
	    public String getLocator();
	    public Boolean isEnabled();
	    public  SeWebElement getSeWebElement();
}
