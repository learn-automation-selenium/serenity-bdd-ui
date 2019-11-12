package com.serenity.bdd.page;

import java.time.temporal.ChronoUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dynamic_loading/2")
public class HerokuappImplicitPage extends PageObject {

	@FindBy(how=How.CSS, using="#start > button")
	private WebElementFacade startButton;
	
	public void _implicitWaitExample1() throws InterruptedException {
		try {
			open();
			setImplicitTimeout(8, ChronoUnit.SECONDS);
			System.out.println(getImplicitWaitTimeout().getSeconds());
			startButton.click();
			Thread.sleep(5000);
		} finally {
			resetImplicitTimeout();
			System.out.println(getImplicitWaitTimeout().getSeconds());
		}
		
	}
}
