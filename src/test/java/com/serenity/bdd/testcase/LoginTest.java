package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.HerokuappLoginPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed
	WebDriver driver;
	
	HerokuappLoginPage loginPage;
	
	@Test
	public void loginTest() throws InterruptedException {
		loginPage.enterUserCredentials();
	}
}
