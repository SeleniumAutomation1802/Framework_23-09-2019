package com.nbrown.testscenario.JDW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DesiredCapability3
{
	@Test
	public void m1()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("ignoreProtectedModeSettings", true);
		
		cap.setCapability("ignoreZoomSetting", true);
		
		cap.setCapability("disable-popup-blocking", true);
		
		cap.setCapability("unexpectedAlertBehaviour", "accept");
		
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		cap.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
		
		cap.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, true);
		
		cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		
		cap.setCapability(CapabilityType.SUPPORTS_SQL_DATABASE, true);
		
		
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(CapabilityType.BROWSER_VERSION, "56");
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("https://drive.google.com");
		
		
	}
}
