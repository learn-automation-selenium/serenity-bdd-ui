package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.HerokuappCheckboxPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class CheckboxTest {

	@Managed
	WebDriver driver;
	
	HerokuappCheckboxPage checkBoxPage;
	
	@Test
	public void checkBoxTest() throws InterruptedException {
		checkBoxPage.selectCheckBox();
	}
}
