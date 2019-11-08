package com.serenity.bdd.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webelements.RadioButtonGroup;

public class RadioButtonPage extends PageObject {

	public void selectRadioButtonEx1() throws InterruptedException {
		getDriver().get("http://html.cita.illinois.edu/nav/form/radio/index.php?example=6");
		List<WebElement> radioButtons = getDriver().findElements(By.name("crust"));
		RadioButtonGroup radioBtnGrp = new RadioButtonGroup(radioButtons);
		radioBtnGrp.selectByValue("deep");
		System.out.println(radioBtnGrp.getSelectedValue().get());
		Thread.sleep(3000);
	}
	
	public void selectRadioButtonEx2() throws InterruptedException {
		getDriver().get("http://html.cita.illinois.edu/nav/form/radio/index.php?example=6");
		inRadioButtonGroup("crust").selectByValue("thick");
		System.out.println(inRadioButtonGroup("crust").getSelectedValue().get());
		Thread.sleep(3000);
	}
}
