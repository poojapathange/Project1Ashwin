package Hassantuk.Registration.Utilities;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSendingClass {

	public static void EmaiSend() throws EmailException {

//		EmailAttachment attachment = new EmailAttachment();
//		attachment.setPath("C:/Users/hp/eclipse-workspace/Hassantuk_Framework/ExtentExecution Report/Hassantuk_Registration1970.01.01.04.00.00.html");
//		attachment.setDisposition(EmailAttachment.ATTACHMENT);
//		attachment.setDescription("TestExecution Report");
//		attachment.setName("HassantukRegistrartion");


//		// Create the email message
//		MultiPartEmail email = new MultiPartEmail();
//		email.setHostName("smtp.gmail.com");
//		email.setAuthenticator(new DefaultAuthenticator("ashwin.gn1@gmail.com", "AmmaAppa@12"));
//		email.addTo("agn@etisalat.ae", "Ashwin GN");
//		email.setFrom("ashwin.gn1@gmail.com", "Automation Server");
//		email.setSubject("Hassantuk Test Execution Report");
//		email.setMsg("PFA Hassantuk Automation Execution Report / Click on the report to expand");

		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("ashwin.gn1@gmail.com", "AmmaAppa@12"));
		email.setSSLOnConnect(true);
		email.setFrom("ashwin.gn1@gmail.com");
		email.setSubject("Automation Test report");
		email.setMsg("PFA Hassantuk Automation Execution Report / Click on the report to expand");
		email.addTo("agn@etisalat.ae");
		email.send();
		// add the attachment
		//email.attach(attachment);

		// send the email
		email.send();

	}

}



