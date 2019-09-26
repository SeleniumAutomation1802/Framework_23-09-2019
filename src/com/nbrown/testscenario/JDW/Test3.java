package com.nbrown.testscenario.JDW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nrown.app.pageobjectlib.jdw.HomePage_JDWPF;
import com.nrown.core.framework.webdriver.Driver;

public class Test3
{
	@Test
	public void searchProduct() throws InterruptedException
	{
		WebDriver driver = Driver.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.com/en-in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		HomePage_JDWPF hp = PageFactory.initElements(driver, HomePage_JDWPF.class);
		
		hp.searchProduct1();
	}
}
