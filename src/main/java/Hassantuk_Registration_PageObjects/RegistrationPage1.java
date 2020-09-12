package Hassantuk_Registration_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage1 {
	
	WebDriver ldriver;
	
	public RegistrationPage1 (WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="back")
	@CacheLookup
	WebElement txtRegister;

//ActionMethods

public void CLickRegister() {
	
	txtRegister.click();
}

}
