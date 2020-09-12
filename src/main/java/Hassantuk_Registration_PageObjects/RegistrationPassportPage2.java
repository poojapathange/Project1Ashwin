package Hassantuk_Registration_PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hassantuk_Registration_TestCases.TC_Base_Class;

public class RegistrationPassportPage2 extends TC_Base_Class {
	
		
		WebDriver ldriver;
		
		public RegistrationPassportPage2 (WebDriver rdriver){
			
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
			
		@FindBy(id= "useremail")
		@CacheLookup
		WebElement Email;
		
		@FindBy(id= "primaryMobileNumber")
		@CacheLookup
		WebElement PhoneNo;
		
		@FindBy(id= "submitRegFormTwo")
		@CacheLookup
		WebElement submitRegFormTwo;

	//ActionMethods

	public void EnterEmail() throws InterruptedException {
		
		Email.click();
		Email.clear();
		Email.sendKeys(emailIDVal);
		Thread.sleep(3000);
		Email.sendKeys(Keys.TAB);
		Thread.sleep(3000);
	}
	
public void EnterPhoneNo() throws InterruptedException {
		
	PhoneNo.click();
	PhoneNo.clear();
	PhoneNo.sendKeys(phoneNoVal);
	Thread.sleep(3000);
	Email.sendKeys(Keys.TAB);
	Thread.sleep(3000);
		
	}

public void submitRegFormTwo() throws InterruptedException {
	
	submitRegFormTwo.click();
	Thread.sleep(10000);
		
	}

	}
