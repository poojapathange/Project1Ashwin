package Hassantuk.Registration.Utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

import Hassantuk_Registration_TestCases.TC_Base_Class;
import freemarker.template.SimpleDate;

public class ScreenShotUtility extends TC_Base_Class {
	
	public static String ScreenShotName;
	public static String ScreenShotPathPass;
	public static String ScreenShotPathFailed;


public ScreenShotUtility (String ScreenShotName1) {

String date = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date(0));
ScreenShotName = ScreenShotName1;
ScreenShotPathPass = projectpath1 +"/ScreenShots/" + ScreenShotName + "_" +date+"_PASS" +".jpg"; 
ScreenShotPathFailed = projectpath1 +"/ScreenShots/" + ScreenShotName + "_" +date+"_Failed" +".jpg"; 
}


public static void TakeScreenPass() throws IOException, InterruptedException {
	
	//Take ScreenShot
	File file=((TakesScreenshot)driver1).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	try {
		
		//COpy the screen shot to desired loaction useing copy file
		FileUtils.copyFile(file, new File(ScreenShotPathPass));
	} catch (IOException e){
		
		e.printStackTrace();
		
	}}
	
	public void TakeScreenFail() throws IOException, InterruptedException {
		
		//Take ScreenShot
		File file=((TakesScreenshot)driver1).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		try {
			
			//COpy the screen shot to desired loaction useing copy file
			FileUtils.copyFile(file, new File(ScreenShotPathFailed));
		} catch (IOException e){
			
			e.printStackTrace();
			
		}
}}
	
//	public void ScreenShotUtility (String ScreenShotName) throws IOException {
//		
//		ScreenShotName = new String(ScreenShotName);
//		String projectPath1 = System.getProperty("user.dir"); 
//		String ScreenShotPath = projectPath1 +"/TestScreenShots"; 
//		String FileName1 = ScreenShotPath + "/" + ScreenShotName + "PASS" +".jpg";
//		String FileName2 = ScreenShotPath + "/" + ScreenShotName + "FAIL" +".jpg";
//		
//	
//}
//	@Test
//	
//	public void take() throws IOException, InterruptedException {
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver","C:/selinium/chromedriver.exe");
//		driver = new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.manage().deleteAllCookies();
////		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//String projectPath1 = System.getProperty("user.dir");
//		//String ScreenShotPath = projectPath1 +"/TestScreenShots"; 
//		//String FileName1 = ScreenShotPath + "/" + "1" + "_PASS" +".jpg";
//		//String FileName2 = ScreenShotPath + "/" + ScreenShotName + "FAIL" +".jpg";
//		//UtilityFiles excel = new UtilityFiles(projectPath1+"/Input Excel/Hassantuk - New Registration1.xlsx","Sheet1");
//	//String URL = UtilityFiles.CopyStringString(1, 2);
//	//System.out.println("URL ="+URL);	
//	driver.get("http://www.google.com");
//	Thread.sleep(20000);
//	TakeScreenPass();
//	
//	}
	
//	public static void TakeScreenPass() throws IOException, InterruptedException {
//		
//		//Take ScreenShot
//		File file=((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
//		try {
//			
//			//COpy the screen shot to desired loaction useing copy file
//			FileUtils.copyFile(file, new File("C:/Users/hp/Desktop/Hassantuk Automation/1.jpg"));
//		} catch (IOException e){
//			
//			e.printStackTrace();
//			
//		}
//	
//	
//	
//	}
	
//	public void TakeScreenFail() throws IOException {
//		//Take ScreenShot
//		File file=((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
//		
//		//COpy the screen shot to desired loaction useing copy file
//		FileUtils.copyFile(file, new File(FileName2));
//	}
//	
	
//	<class name="HassantukLoginMaven1" />
//	<class name="RegistrationPage1" />
//	<class name="RegistrationPage2" />
//	<class name="RegistrationPage3" />

//}
