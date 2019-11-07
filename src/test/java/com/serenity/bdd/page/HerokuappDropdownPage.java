package com.serenity.bdd.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dropdown")
public class HerokuappDropdownPage extends PageObject {

	@FindBy(how=How.ID, using="dropdown")
	WebElementFacade dropdownId;
	
	public void selectFromDropdown() {
		open();
		selectFromDropdown(dropdownId, "Option 2");
		System.out.println(getSelectedLabelFrom(dropdownId));
	}
}
