package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.MouseActionsExamplePage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MouseActionTest {

	@Managed
	WebDriver driver;
	
	MouseActionsExamplePage mouseAction;
	
	@Test
	public void mouseActionTest() {
		//mouseAction._mouseHoverAction();
		mouseAction._dragAndDrop();
	}
	
}
