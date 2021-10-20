package oct2_extents;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import pages.AthenticationPage;

public class LoginTestCases extends TestBase {

	
	@Test
	
	public void TestCase001() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		
		extentLogger.log(LogStatus.INFO, "Clicking on the Login");
		
	  HeaderObj.getSignIn().click();
	  extentLogger.log(LogStatus.INFO, "Verifying the Login or not");
	  athenObj.setEmailAddress("shirillshirill1@gmail.com");
	  athenObj.setPassword("Shirill@1248");
	  athenObj.getSignInButton().click();
	  
	  extentLogger.log(LogStatus.INFO, "verifying result is successfully or not");
      String myaccount = MyAccountObj.getMyAccountText().getText();
	 Assert.assertEquals(myaccount ,"MY ACCOUNT" );
	 
	 extentLogger.log(LogStatus.PASS, "My Testcase001 is PASS"); 
	  
	  HeaderObj.getSignOut().click();
		
		
		
	}
	
	@Test
	
	public void TestCase002() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
	  extentLogger.log(LogStatus.INFO, "Clicking on the Login");	
	  HeaderObj.getSignIn().click();
	  extentLogger.log(LogStatus.INFO, "Verifying the Login or not");
	  athenObj.setEmailAddress("shirillshirill3@gmail.com");
	  athenObj.setPassword("Shirill@124");
	  athenObj.getSignInButton().click();
	  extentLogger.log(LogStatus.INFO, "verifying result is successfully or not"); 
	 String AuthenFailed=  athenObj.getAuthenticationFailed().getText();
	//	Assert.assertEquals(AuthenFailed, "Authentication failed.");
		
		
		if(AuthenFailed.equals("Authentication failed")) {
			extentLogger.log(LogStatus.PASS, "Message error displayed properly hence passing the testcase "); 
			Assert.assertTrue(true);
			
		}else {
			extentLogger.log(LogStatus.FAIL, "Message error displayed im-properly hence Failing the testcase"); 
			Assert.assertTrue(false);
			
			
		}
		
	}
	
	
	@Test(dependsOnMethods= {"TestCase002"})
	
	public void TestCase003() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
	  extentLogger.log(LogStatus.INFO, "Clicking on the Login");	
	  HeaderObj.getSignIn().click();
	  
	  extentLogger.log(LogStatus.INFO, "Verifying the Login or not");
	  athenObj.setEmailAddress("shirillshirill@gmail.com");
	  athenObj.setPassword("");
	  athenObj.getSignInButton().click();
	  extentLogger.log(LogStatus.INFO, "verifying result is successfully or not"); 
	 String PasswordReq=  athenObj.getPasswordIsRequired().getText();
		Assert.assertEquals(PasswordReq, "Password is required.");
		extentLogger.log(LogStatus.PASS, "TestCase3 is pass");
		
		
	}
	
	
}
