package com.serenity.bdd.page;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://the-internet.herokuapp.com/")
public class HerokuappIndexPage extends PageObject {

	@FindBy(how=How.XPATH, using="//a[@href='/abtest']")
	WebElementFacade abTestLink;
	
	@FindBy(how=How.TAG_NAME, using="a")
	List<WebElementFacade> allTestLinks;
	
	public HerokuappIndexPage(WebDriver driver) {
		super(driver);
	}

	public void ser_clickLink() throws InterruptedException {
		open();
		abTestLink.click();
		Thread.sleep(3000);
	}
	
	public void ser_getAllLinkText() {
		open();
		for(WebElementFacade link : allTestLinks) {
			System.out.println(link.getText());
		}
		
	}
}
