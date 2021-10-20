package sept29_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class ContactUsTestCases extends TestBase {
	
   @Test
   public void TestCase001() {
	   HeaderObj.getContactus().click();
	   String contactus=ContactUsObj.getPageHeading().getText();
	   Assert.assertEquals(contactus, "CUSTOMER SERVICE - CONTACT US");
	   ContactUsObj.setSubjectReading("Webmaster");
	   ContactUsObj.setEmailAddress("shirillshirill1@gmail.com");
	   ContactUsObj.setOrderReference("123456");
	   ContactUsObj.setTypeMessage("contactus");
	   ContactUsObj.getSubmitMessage().click();
	   String AlertSucess= ContactUsObj.getAlertSuccess().getText();
	   Assert.assertEquals(AlertSucess, "Your message has been successfully sent to our team.");
	   log.info("TestCase001 is pass");
   
   
   }
   
   
	
   
   @Test
   public void TestCase002() {
	   HeaderObj.getContactus().click();
	   String contactus=ContactUsObj.getPageHeading().getText();
	   Assert.assertEquals(contactus, "CUSTOMER SERVICE - CONTACT US");
	   ContactUsObj.setSubjectReading("Webmaster");
	   ContactUsObj.setEmailAddress("shirillshirill3@gmail.com");
	   ContactUsObj.setOrderReference("123456");
	   ContactUsObj.setTypeMessage("");
	   ContactUsObj.getSubmitMessage().click();
	   String AlertFailed= ContactUsObj.getAlertFailed().getText();
	   Assert.assertEquals(AlertFailed, "The message cannot be blank.");
	   
	   log.info("TestCase002 is pass");
   }
   @Test(dependsOnMethods = {"TestCase002"})
   public void TestCase003() {
	   HeaderObj.getContactus().click();
	   String contactus=ContactUsObj.getPageHeading().getText();
	   Assert.assertEquals(contactus, "CUSTOMER SERVICE - CONTACT US");
	   ContactUsObj.setSubjectReading("Webmaster");
	   ContactUsObj.setEmailAddress("shirillshirill3@gmail.com");
	   ContactUsObj.setOrderReference("123456");
	   ContactUsObj.setTypeMessage("");
	   ContactUsObj.getSubmitMessage().click();
	   String AlertFailed= ContactUsObj.getAlertFailed().getText();
	   Assert.assertEquals(AlertFailed, "The message cannot be blank.");
	   
	   log.info("TestCase002 is pass");
   }
	

}
