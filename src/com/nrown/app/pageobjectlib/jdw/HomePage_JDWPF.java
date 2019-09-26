package com.nrown.app.pageobjectlib.jdw;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nrown.core.framework.webdriver.Driver;

public class HomePage_JDWPF 
{
	@FindBy(id="searchString1")
	private WebElement searchTxtBox;
	
	@FindBy(how=How.ID, using="searchBoxSubmitBtn")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="(//a[text()='SIGN IN'])[1]")
	private WebElement signInLnk;

	
	public void searchProduct1()
	{
		searchTxtBox.sendKeys("Jeans");
		searchBtn.click();
	}
	
	@Test
	public void clickOnSignIn() throws InterruptedException
	{
		WebDriver driver = Driver.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.com/en-in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		HomePage_JDWPF hp = PageFactory.initElements(driver, HomePage_JDWPF.class);
		
		hp.signInLnk.click();
	}
	
}
