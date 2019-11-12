package com.serenity.bdd.testcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.bdd.page.HerokuappFileUploadPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class FileUploadTest {

	@Managed
	WebDriver driver;
	
	HerokuappFileUploadPage fileUpload;
	
	@Test
	public void fileUploadTest() {
		fileUpload._fileUpload();
	}
}
