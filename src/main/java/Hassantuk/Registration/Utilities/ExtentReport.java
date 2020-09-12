package Hassantuk.Registration.Utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	

	public static ExtentReports extent1 ;
	
	
	public static ExtentReports ExtentReport1() {
		
		String date = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));
		String FileName = "Hassantuk_Registration"+date+".html";
		ExtentReports extent1 = new ExtentReports();
		ExtentHtmlReporter html = new ExtentHtmlReporter("C:/Users/hp/eclipse-workspace/Hassantuk_Framework/ExtentExecution Report/"+FileName);
		html.config().setDocumentTitle("Hassantuk Registratrion Project");
	    html.config().setTheme(Theme.DARK);
	    extent1.attachReporter(html);
	    return extent1;
	}
	
	public static void ReportPass (String TestName1) {
		
		String TestName = TestName1;
		
		if(extent1==null) {
			
			extent1 = ExtentReport1();
			
		}
		//extent = extent1;
		extent1.createTest(TestName)
		 .log(Status.PASS, TestName +"Is Successful");
		//extent1.flush();
	}
		
	
public static void ReportFailed (String TestName1) {
	
	String TestName = TestName1;
		
		extent1.createTest(TestName)
		 .log(Status.FAIL,  TestName +"Is Failed");
		//extent.flush();
	}
		
		
	}

