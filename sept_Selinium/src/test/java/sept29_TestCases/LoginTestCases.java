package sept29_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AthenticationPage;

public class LoginTestCases extends TestBase {

	
	@Test
	
	public void TestCase001() {
		
	  HeaderObj.getSignIn().click();
	  athenObj.setEmailAddress("shirillshirill1@gmail.com");
	  athenObj.setPassword("Shirill@1248");
	  athenObj.getSignInButton().click();
	  
	 
      String myaccount = MyAccountObj.getMyAccountText().getText();
	 Assert.assertEquals(myaccount ,"MY ACCOUNT" );
	 log.info("My Testcase001 is PASS");
	  
	  
	  HeaderObj.getSignOut().click();
		
		
		
	}
	
	@Test
	
	public void TestCase002() {
		
	  HeaderObj.getSignIn().click();
	  athenObj.setEmailAddress("shirillshirill3@gmail.com");
	  athenObj.setPassword("Shirill@124");
	  athenObj.getSignInButton().click();
	  
	 String AuthenFailed=  athenObj.getAuthenticationFailed().getText();
	//	Assert.assertEquals(AuthenFailed, "Authentication failed.");
		
		
		if(AuthenFailed.equals("Authentication failed.")) {
			log.info("My Testcase002 is PASS");
			Assert.assertTrue(true);
			
		}else {
			log.error("TestCase Failed due to text mismatch");
			Assert.assertTrue(false);
			
			
		}
		
	}
	
	
	@Test
	
	public void TestCase003() {
		
	  HeaderObj.getSignIn().click();
	  athenObj.setEmailAddress("shirillshirill@gmail.com");
	  athenObj.setPassword("");
	  athenObj.getSignInButton().click();
	  
	 String PasswordReq=  athenObj.getPasswordIsRequired().getText();
		Assert.assertEquals(PasswordReq, "Password is required.");
		
		log.info("My Testcase003 is PASS");
		
	}
	
	
}
