package com.serenity.bdd.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/login")
public class HerokuappLoginPage extends PageObject {

	@FindBy(how=How.ID, using="username")
	private WebElementFacade username;
	
	@FindBy(how=How.ID, using="password")
	private WebElementFacade password;
	
	/*public HerokuappLoginPage(WebDriver driver) {
		super(driver);
	}*/

	public void enterUserCredentials() {
		open();
		username.typeAndTab("tomsmith");
		password.typeAndEnter("SuperSecretPassword!");
	}
}
