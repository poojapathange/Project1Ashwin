package Hassantuk_Registration_PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hassantuk_Registration_TestCases.TC_Base_Class;

public class RegistrationPassportPage4 extends TC_Base_Class{

WebDriver ldriver;
		
		public RegistrationPassportPage4 (WebDriver rdriver) {
			
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy( xpath = "//label[@class='floating-label'][contains(text(),'Passport')]")
		@CacheLookup
		WebElement SelectPassport;
		
		@FindBy(xpath = "//input[@id='documentNumber']")
		@CacheLookup
		WebElement DocumetNumber;

		
		@FindBy(xpath = "//label[@class='btn btn-default col-xs-12 uploade-label']")
		@CacheLookup
		WebElement ClickOnUpload;
		
		@FindBy(xpath = "//button[@id='submitOwnerIdForm']")
		@CacheLookup
		WebElement SubmitForm;


	//ActionMethods

	public void SelectPassport() throws Throwable {
		
		SelectPassport.click();
		Thread.sleep(3000);
	}
	
	public void EnterdocumentNumber() throws InterruptedException {

		DocumetNumber.click();
		Thread.sleep(10000);
		DocumetNumber.sendKeys(PassPortNo);
		DocumetNumber.sendKeys(Keys.TAB);
		Thread.sleep(10000);
	}
	
	public void ClickOnUpload() throws InterruptedException, IOException {

		ClickOnUpload.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(projectpath1+"/AutoITFolder/FileUpoadScript.exe");
		Thread.sleep(10000);
	}

	public void SubmitForm() throws InterruptedException, IOException {

		SubmitForm.click();
		Thread.sleep(10000);
	}
	
}
