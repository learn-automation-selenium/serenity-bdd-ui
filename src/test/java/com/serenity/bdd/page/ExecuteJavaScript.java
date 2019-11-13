package com.serenity.bdd.page;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class ExecuteJavaScript extends PageObject {

	public void _executeJS1() {
		try {
			open();
			evaluateJavascript("alert(\"Welcome!!\")");
			Thread.sleep(5000);
			System.out.println(getAlert().getText());
			getAlert().accept();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void _identifyElementUsingJs() {
		try {
			open();
			//evaluateJavascript("document.querySelector(\"a[href='/abtest']\").click()");
			WebElement abLink = (WebElement) evaluateJavascript("return document.querySelector(\"a[href='/abtest']\")");
			abLink.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void _getAllLinkText() {
		try {
			open();
			List<WebElement> links = (List<WebElement>) evaluateJavascript("return document.getElementsByTagName(\"a\")");
			for(WebElement link : links) {
				System.out.println(link.getText());
			}
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
