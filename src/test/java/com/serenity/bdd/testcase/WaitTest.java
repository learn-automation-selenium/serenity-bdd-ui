package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.HerokuappImplicitPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class WaitTest {

	@Managed
	WebDriver driver;
	
	HerokuappImplicitPage implicitTest;
	
	@Test
	public void waitTest() throws InterruptedException {
		implicitTest._implicitWaitExample1();
	}
}
