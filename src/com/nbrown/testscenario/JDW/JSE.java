package com.nbrown.testscenario.JDW;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.nrown.app.pageobjectlib.jdw.HomePage_JDW;
import com.nrown.core.framework.webdriver.Driver;
import com.nrown.core.framework.webdriver.JSexercuter;

public class JSE 
{

	@Test
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = Driver.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.com/en-in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		JSexercuter jse = new JSexercuter(driver);
		jse.setValueByJse("Jeans", "id", HomePage_JDW.searchTxtBox_id);
//		jse.clickByJsexecuter("id", HomePage_JDW.searchBtn_id);
		
//		jse.scrollByJsexecuter("xpath", HomePage_JDW.footer_wishlistLnk_xpath);
//		jse.highlightWebElm("id", HomePage_JDW.searchTxtBox_id);
//		jse.refreshByJSE();
//		String title = jse.captureTitleByJSE();
//		System.out.println(title);
//		
//		String text = jse.innerTextByJSE("xpath", HomePage_JDW.signInLink_xpath);
//		System.out.println(text);
		
		jse.alertPopUp();
		
		
		
		
	}
}