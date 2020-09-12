package Hassantuk_Registration_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hassantuk_Registration_TestCases.TC_Base_Class;

public class RegistrationPassportPage3 extends TC_Base_Class{
	
	String password1 = password;
	
WebDriver ldriver;
	
	public RegistrationPassportPage3 (WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="newpassword")
	@CacheLookup
	WebElement newpassword1;
	
	@FindBy(id="confirmpassword")
	@CacheLookup
	WebElement confirmpassword;

	
	@FindBy(id="submitRegFormThree")
	@CacheLookup
	WebElement submitRegFormThree;


//ActionMethods

public void EnterPassword() throws InterruptedException {
	
	newpassword1.click();
	newpassword1.sendKeys(password1);
	Thread.sleep(3000);
}

public void ConfirmPassword() throws InterruptedException {
	
	confirmpassword.click();
	confirmpassword.sendKeys(password1);
	Thread.sleep(3000);
}

public void submitRegFormThree() throws InterruptedException {
	
	submitRegFormThree.click();
	Thread.sleep(10000);
}
}
