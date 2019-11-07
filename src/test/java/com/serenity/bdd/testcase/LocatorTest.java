package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.HerokuappIndexPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LocatorTest {

	@Managed
	WebDriver driver;
	
	HerokuappIndexPage herokuapp;
	
	@Test
	@Title("Testing the herokuapp locators")
	public void test001() throws InterruptedException {
		//driver.get("https://the-internet.herokuapp.com/");
		herokuapp.ser_clickLink();
		herokuapp.ser_getAllLinkText();
	}
}
