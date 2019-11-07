package com.serenity.bdd.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;

@DefaultUrl("/checkboxes")
public class HerokuappCheckboxPage extends PageObject {

	@FindBy(how=How.XPATH, using="//form[@id='checkboxes']/input[1]")
	private WebElementFacade checkBox_1;
	
	@FindBy(how=How.XPATH, using="//form[@id='checkboxes']/input[2]")
	private WebElementFacade checkBox_2;
	
	public void selectCheckBox() throws InterruptedException {
		open();
		setCheckbox(checkBox_1, true);
		Thread.sleep(3000);
		setCheckbox(checkBox_2, true);
		
		Checkbox chBx = new Checkbox(checkBox_1);
		System.out.println(chBx.isChecked());
		
	}
	
}
