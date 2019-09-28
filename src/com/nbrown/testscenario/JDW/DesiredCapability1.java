package com.nbrown.testscenario.JDW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class DesiredCapability1 
{
	@Test
	public void m1()
	{
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver(cap);
		
		// Handle the SSL certificate using JavaScript
		driver.get("http://www.cacert.org/");
		driver.get("javascript:document.getElementById('overridelink').click();");
		
		// or
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("javascript:document.getElementById('overridelink').click();");
		
	}
}
