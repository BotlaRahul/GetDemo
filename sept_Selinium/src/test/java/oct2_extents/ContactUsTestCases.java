package oct2_extents;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class ContactUsTestCases extends TestBase {
	
   @Test
   public void TestCase001() {
	   String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	   extentLogger = extent.startTest(TestcaseId, "TestStarted");
	   extentLogger.log(LogStatus.INFO, "Clicking on the Contact Us Link");
	   HeaderObj.getContactus().click();
	  
	   extentLogger.log(LogStatus.INFO, "verifying the ContactUs Page or not");
	   String contactus=ContactUsObj.getPageHeading().getText();
	   Assert.assertEquals(contactus, "CUSTOMER SERVICE - CONTACT US");
	   extentLogger.log(LogStatus.INFO, "Add Some data into  the ContactUs ");
	   ContactUsObj.setSubjectReading("Webmaster");
	   ContactUsObj.setEmailAddress("shirillshirill1@gmail.com");
	   ContactUsObj.setOrderReference("123456");
	   ContactUsObj.setTypeMessage("contactus");
	   ContactUsObj.getSubmitMessage().click();
	   extentLogger.log(LogStatus.INFO, "Verify Message is sent Sucessfully or not");
	   String AlertSucess= ContactUsObj.getAlertSuccess().getText();
	   Assert.assertEquals(AlertSucess, "Your message has been successfully sent to our team.");
	   
	   extentLogger.log(LogStatus.PASS, "TestCase001 is pass");
   
   }
   
   
	
   
   @Test
   public void TestCase002() {
	   String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	   extentLogger = extent.startTest(TestcaseId, "TestStarted");
	   extentLogger.log(LogStatus.INFO, "Clicking on the Contact Us Link");
	   HeaderObj.getContactus().click();
	   
	   extentLogger.log(LogStatus.INFO, "verifying the ContactUs Page or not");
	   String contactus=ContactUsObj.getPageHeading().getText();
	   Assert.assertEquals(contactus, "CUSTOMER SERVICE - CONTACT US");
	   ContactUsObj.setSubjectReading("Webmaster");
	   ContactUsObj.setEmailAddress("shirillshirill3@gmail.com");
	   ContactUsObj.setOrderReference("123456");
	   ContactUsObj.setTypeMessage("");
	   ContactUsObj.getSubmitMessage().click();
	   extentLogger.log(LogStatus.INFO, "Verify Message is sent Sucessfully or not");
	   String AlertFailed= ContactUsObj.getAlertFailed().getText();
	   Assert.assertEquals(AlertFailed, "The message cannot be blank.");
	   
	  
	   extentLogger.log(LogStatus.PASS, "TestCase002 is pass");
   }
	
  
	
	

}
