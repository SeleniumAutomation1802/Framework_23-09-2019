package com.nbrown.testscenario.JDW;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class DesiredCapability2
{
	@Test
	public void m1()
	{
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
		options.addExtensions(new File("C:\\Pritam\\ChromeExtension\\0.10_0.crx"));
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
	}
}
