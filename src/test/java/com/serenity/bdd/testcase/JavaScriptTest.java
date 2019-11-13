package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.ExecuteJavaScript;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class JavaScriptTest {

	@Managed
	WebDriver driver;
	
	ExecuteJavaScript javaScript;
	
	@Test
	public void javascriptTest001() {
		//javaScript._executeJS1();
		//javaScript._identifyElementUsingJs();
		javaScript._getAllLinkText();
	}
}
