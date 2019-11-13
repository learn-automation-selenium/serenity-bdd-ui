package com.serenity.bdd.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MouseActionsExamplePage extends PageObject {

	@FindBy(how=How.XPATH, using="//div[@class='example']//img[1]")
	WebElementFacade image;
	
	@FindBy(how=How.XPATH, using="//a[@href='/users/1']")
	WebElementFacade user1Link;
	
	@FindBy(how=How.XPATH, using="//iframe[@src='/resources/demos/droppable/default.html']")
	WebElementFacade dragDropIframe;
	
	@FindBy(how=How.ID, using="draggable")
	WebElementFacade dragDropSrc;
	
	@FindBy(how=How.ID, using="droppable")
	WebElementFacade dragDropDest;
	
	public void _mouseHoverAction() {
		try {
			getDriver().get("https://the-internet.herokuapp.com/hovers");
			Thread.sleep(5000);
			withAction().moveToElement(image).build().perform();
			
			waitForTextToAppear("name: user1").clickOn(user1Link);
			Thread.sleep(5000);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void _dragAndDrop() {
		try {
			getDriver().get("https://jqueryui.com/droppable/");
			getDriver().switchTo().frame(dragDropIframe);
			
			withAction().dragAndDrop(dragDropSrc, dragDropDest).build().perform();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
