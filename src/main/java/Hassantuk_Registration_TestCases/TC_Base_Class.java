package Hassantuk_Registration_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.commons.mail.EmailException;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.thoughtworks.qdox.model.expression.Equals;

import Hassantuk_Registration_TestData.ClassToReadDataFromExcelFile;

import java.util.logging.Level;

public class TC_Base_Class {
	
	public static WebDriver driver1;
	public static String projectpath1;
	public static org.apache.logging.log4j.Logger logger;
	public static String URL2;
	public static String phoneNoVal;
	public static String emailIDVal;
	public static String password;
	public static String PassPortNo;
	
	@Parameters ("Browser") //Parametrization
	@BeforeClass
	public static void Setup( String Browser) throws AWTException, InterruptedException, IOException {
		
				//To InitiateWebdriver
		
		if(Browser.equals("Chrome")) {
			
				projectpath1 = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", projectpath1+"/Drivers/chromedriver.exe");
				driver1 = new ChromeDriver();
				driver1.manage().window().maximize();
				driver1.manage().deleteAllCookies();
				driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		}
				//To Initiate Logger
				logger = org.apache.logging.log4j.LogManager.getLogger();

				//To Initiate the excel file reader
				ClassToReadDataFromExcelFile Excel = new ClassToReadDataFromExcelFile(projectpath1+"/TestDataExcelFile/Hassantuk - New Registration1.xlsx","Sheet1");
				URL2 = Excel.CopyStringString(1, 2);
				emailIDVal = Excel.CopyStringString(4, 2);	
				phoneNoVal = Excel.CopyStringString(7, 2);
				password = Excel.CopyStringString(4, 3);	
				PassPortNo = Excel.CopyStringString(4, 1);
				
				 
	}
	
	@AfterTest
	
public static void TearDown() throws AWTException, InterruptedException, EmailException {
	
		try {
			Hassantuk.Registration.Utilities.ExtentReport.extent1.flush();
			driver1.quit();
			Hassantuk.Registration.Utilities.EmailSendingClass.EmaiSend();
			System.out.println("Email Sent Successfully");	
		} catch (EmailException e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("Email Not Sent Successfully");	
			logger.error(msg);
			
		}
	
}

}
