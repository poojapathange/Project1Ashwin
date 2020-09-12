package Hassantuk_Registration_TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.google.common.graph.SuccessorsFunction;

import Hassantuk.Registration.Utilities.ScreenShotUtility;
import Hassantuk_Registration_PageObjects.RegistrationPage1;
import Hassantuk_Registration_PageObjects.RegistrationPassportPage2;
import Hassantuk_Registration_PageObjects.RegistrationPassportPage3;
import Hassantuk_Registration_PageObjects.RegistrationPassportPage4;
import Hassantuk_Registration_TestData.ClassToReadDataFromExcelFile;

@Listeners(Hassantuk.Registration.Utilities.ITestListenereBase.class)
public class TC_NewRegistration_Passport  extends TC_Base_Class {


	@Test(priority = 1)
	public void NewRegistration_Passport_Page1 () throws Throwable {

		//Take the URL	
		System.out.println("URL =" + URL2);

		driver1.get(URL2);
		Thread.sleep(10000);
		logger.info("--------------------------------------------------------------------------------------------------------/");
		logger.info("Browser opened & URL entered is Successful");

		//ScreenShot Capture
		Hassantuk.Registration.Utilities.ScreenShotUtility Screen = new ScreenShotUtility("NewRegistration_Passport_Page1");
		Screen.TakeScreenPass();
		logger.info("ScreenShot Saved Successfully for : NewRegistration_Passport_Page1");

		//create object for registartionPage1 which contains webelements & their actions
		RegistrationPage1 Page1 = new RegistrationPage1(driver1);
		Page1.CLickRegister();
		Thread.sleep(10000);
		logger.info("Click on Register is Successful");

		//ExtentReportEntry
		Hassantuk.Registration.Utilities.ExtentReport.ReportPass("TC_NewRegistration_Passport_Page1");

		//		//this section is used for TestNg reporting
		//		if(driver1.getTitle().equals("Hassantuk for Homes")) {
		//
		//			org.testng.Assert.assertEquals(true, true);
		//			
		//		}
		//
		//		else {
		//			org.testng.Assert.assertEquals(false, false);

		//		}
	}

	@Test(priority = 3)
	public void  NewRegistration_Passport_Page2() throws InterruptedException, IOException {


		RegistrationPassportPage2 Page2 = new RegistrationPassportPage2(driver1);

		Page2.EnterEmail();
		logger.info("EmailID is entered successfully in Page2");

		Page2.EnterPhoneNo();
		logger.info("PhoneNo is entered successfully in Page2");

		//Taking ScreenShot
		Hassantuk.Registration.Utilities.ScreenShotUtility Screen = new ScreenShotUtility("NewRegistration_Passport_Page3");
		Screen.TakeScreenPass();
		logger.info("ScreenShot Saved Successfully for : NewRegistration_Passport_Page3");

		Page2.submitRegFormTwo();
		logger.info("Page 2 Form is submitted successfully");

		//ExtentReportEntry
		Hassantuk.Registration.Utilities.ExtentReport.ReportPass("TC_NewRegistration_Passport_Page3");
	} 



	@Test(priority = 4)
	public void NewRegistration_Passport_Page3 () throws IOException {

		try {
			RegistrationPassportPage3 Page3 = new RegistrationPassportPage3(driver1);

			Page3.EnterPassword();
			logger.info("NewPassword is entered successfully in Page2");

			Page3.ConfirmPassword();
			logger.info("Confirm Password is entered successfully in Page2");


			//Taking ScreenShot
			Hassantuk.Registration.Utilities.ScreenShotUtility Screen = new ScreenShotUtility("NewRegistration_Passport_Page4");
			try {
				Screen.TakeScreenPass();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("ScreenShot Saved Successfully for : NewRegistration_Passport_Page4");

			Page3.submitRegFormThree();
			logger.info("Registration is successful");

			//ExtentReportEntry
			Hassantuk.Registration.Utilities.ExtentReport.ReportPass("TC_NewRegistration_Passport_Page4");

		} catch (Throwable e) {

			e.printStackTrace();
			String msg = e.getMessage();
			logger.info("NewRegistration_Passport_Page3 is Failed");
			logger.error(msg);

			Hassantuk.Registration.Utilities.ScreenShotUtility Screen = new ScreenShotUtility("NewRegistration_Passport_Page3");
			try {
					Screen.TakeScreenFail();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				logger.info(" FAILED ScreenShot Saved Successfully for : NewRegistration_Passport_Page4");
				Hassantuk.Registration.Utilities.ExtentReport.ReportFailed("TC_NewRegistration_Passport_Page4");

			}}

		@Test(priority = 2)
		public void NewRegistration_Passport_Page4 () throws Throwable {

			RegistrationPassportPage4 Page4 = new RegistrationPassportPage4(driver1);

			Page4.SelectPassport();
			logger.info("Passport Option IS selected");

			Page4.EnterdocumentNumber();
			logger.info("Dcument Number Entered");

			Page4.ClickOnUpload();
			logger.info("Passport Image is uploaded successfully");

			//Taking ScreenShot
			Hassantuk.Registration.Utilities.ScreenShotUtility Screen = new ScreenShotUtility("NewRegistration_Passport_Page2");
			Screen.TakeScreenPass();
			logger.info("ScreenShot Saved Successfully for : NewRegistration_Passport_Page2");

			Page4.SubmitForm();
			logger.info("Page is submitted successfully");

			//ExtentReportEntry
			Hassantuk.Registration.Utilities.ExtentReport.ReportPass("TC_NewRegistration_Passport_Page2");

		}


	}
