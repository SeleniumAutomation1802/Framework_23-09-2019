package com.nbrown.testscenario.JDW;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.nbrown.TestScenarioInitialization.TestInitializationScript;

public class Test2 extends TestInitializationScript
{
	@Test
	public void m1()
	{
		System.out.println("Enter m1");
		WebElement w1 = sdriver.find_element("xpath", "//input[@placeholder='Search mail']");
		w1.click();
	}
}
