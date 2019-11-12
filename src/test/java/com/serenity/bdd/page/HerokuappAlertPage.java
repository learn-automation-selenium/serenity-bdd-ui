package com.serenity.bdd.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/javascript_alerts")
public class HerokuappAlertPage extends PageObject {

	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Click for JS Alert')]")
	private WebElementFacade regularAlert;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Click for JS Confirm')]")
	private WebElementFacade confirmAlert;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(), 'Click for JS Prompt')]")
	private WebElementFacade promptAlert;
	
	public void _performRegularAlert() {
		try {
			open();
			regularAlert.click();
			Thread.sleep(3000);
			System.out.println(getAlert().getText());
			getAlert().accept();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void _performConfirmAlert() {
		try {
			open();
			confirmAlert.click();
			Thread.sleep(3000);
			System.out.println(getAlert().getText());
			getAlert().dismiss();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void _performPromptAlert() {
		try {
			open();
			promptAlert.click();
			Thread.sleep(3000);
			System.out.println(getAlert().getText());
			getAlert().sendKeys("Hello World!!");
			getAlert().accept();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
