package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.HerokuappAlertPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class AlertTest {

	@Managed
	WebDriver driver;
	
	HerokuappAlertPage alertPage;
	
	@Test
	public void alertTest() {
		//alertPage._performRegularAlert();
		//alertPage._performConfirmAlert();
		alertPage._performPromptAlert();
	}
}
