package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class FirstSerenityTest {
	
	@Managed
	WebDriver driver;
	
	@Title("This is my first serenity test method!!!!!")
	@Test
	public void navigateToGooglePage() throws InterruptedException {
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
	}
}