package com.serenity.bdd.page;

import java.io.File;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/upload")
public class HerokuappFileUploadPage extends PageObject {

	@FindBy(how=How.ID, using="file-upload")
	private WebElementFacade file_upload;
	
	@FindBy(how=How.ID, using="file-submit")
	private WebElementFacade file_submit;
	
	public void _fileUpload() {
		try {
			open();
			String fileName = System.getProperty("user.dir") + File.separator + "download.jfif";
			upload(fileName).to(file_upload);
			file_submit.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
