package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.HerokuappDropdownPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class DropdownTest {

	@Managed
	WebDriver driver;
	
	HerokuappDropdownPage dropdownPage;
	
	@Test
	public void dropdownTest() throws InterruptedException {
		dropdownPage.selectFromDropdown();
		Thread.sleep(3000);
	}
}
