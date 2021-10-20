package oct2_extents;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class AddToCartTestCase extends TestBase{
	
	
	@Test
	public void testcase001() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		extentLogger.log(LogStatus.INFO, "Clicking on the Women Link");
	    HeaderObj.getWomen().click();
	    extentLogger.log(LogStatus.INFO, "Clicking on the Blouse Link");
     	WomenObj.getBlouse().click();
     	extentLogger.log(LogStatus.INFO, "Clicking on the AddToCart Link");
     	WomenObj.getAddToCart().click();
     	extentLogger.log(LogStatus.INFO, "Entering into AddToCart page or not");
	    WomenObj.getProceedToCheckout().click();
	    WomenObj.getProceedToCheckout2().click();
	    extentLogger.log(LogStatus.INFO, "Clicking on the SignIn Link");
		athenObj.setEmailAddress("shirillshirill1@gmail.com");
		athenObj.setPassword("Shirill@1248");
		athenObj.getSignInButton().click();
		WomenObj.getProceedToCheckout3().click();
		
		WomenObj.getTermsAndServiceCheckBox().click();
    	WomenObj.getProceedToCheckout4().click();
		WomenObj.getPayByBankWire().click();
 		WomenObj.getIconfirmMyOrder().click();
 		extentLogger.log(LogStatus.INFO, "Entering myOrderCompleted page or not");
  		String OrderCompleted=WomenObj.getYourOrderComplete().getText();
  		
  		
  		Assert.assertEquals(OrderCompleted, "Your order on My Store is complete.");
  		extentLogger.log(LogStatus.PASS, "AddToCart TestCase is pass");
		
	}
	
	

}
