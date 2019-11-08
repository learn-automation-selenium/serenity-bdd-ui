package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.RadioButtonPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class RadioButtonTest {

	@Managed
	WebDriver driver;
	
	RadioButtonPage radioBtnPage;
	
	@Test
	public void radioBtnTest() throws InterruptedException {
		//radioBtnPage.selectRadioButtonEx1();
		radioBtnPage.selectRadioButtonEx2();
	}
	
}
