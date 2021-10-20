package sept29_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class AddToCartTestCase extends TestBase{
	
	@Test
	public void testcase001() {
		
	    HeaderObj.getWomen().click();
     	WomenObj.getBlouse().click();
     	WomenObj.getAddToCart().click();
	    WomenObj.getProceedToCheckout().click();
	    WomenObj.getProceedToCheckout2().click();
	   
		athenObj.setEmailAddress("shirillshirill1@gmail.com");
		athenObj.setPassword("Shirill@1248");
		athenObj.getSignInButton().click();
		WomenObj.getProceedToCheckout3().click();
		
		WomenObj.getTermsAndServiceCheckBox().click();
    	WomenObj.getProceedToCheckout4().click();
		WomenObj.getPayByBankWire().click();
 		WomenObj.getIconfirmMyOrder().click();
  		String OrderCompleted=WomenObj.getYourOrderComplete().getText();
  		
  		
  		Assert.assertEquals(OrderCompleted, "Your order on My Store is complete.");
  		log.info(OrderCompleted);
		
	}
	
	

}
