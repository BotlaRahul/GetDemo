package sept29_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class CreateAccountTestCase extends TestBase {
	
	
	@Test
	public void TestCase001() throws InterruptedException {
		HeaderObj.getSignIn().click();
		athenObj.setCreateEmail("shirillshii@gmail.com");
		athenObj.getSubmitCreate().click();
		CreateAnAccountObj.getMr().click();
		CreateAnAccountObj.setFirstName("BOTLA");
		CreateAnAccountObj.setLastName("Shresta");
		CreateAnAccountObj.setPassword("123456");
		CreateAnAccountObj.setDays("7 ");
		CreateAnAccountObj.setMonths("October ");
		CreateAnAccountObj.setYears("2016 ");
		CreateAnAccountObj.getNewsletter().click();
		CreateAnAccountObj.getOptions().click();
		CreateAnAccountObj.setFirstname("BOTLA");
		CreateAnAccountObj.setLastname("SHRESTA");
		CreateAnAccountObj.setCompany("wipro");
		CreateAnAccountObj.setAddress1("11-5-123 NewYorkcity");
		CreateAnAccountObj.setAddress2("11-5-122 NewYorkcity");
		CreateAnAccountObj.setCity("warangal");
		CreateAnAccountObj.setId_state("New York  ");
		CreateAnAccountObj.setPostcode("00000");
		CreateAnAccountObj.setId_country("United States ");
		CreateAnAccountObj.setOther("asdfghjkl");
		CreateAnAccountObj.setPhone("777777777");
		CreateAnAccountObj.setPhone_mobile("999999999");
		CreateAnAccountObj.setAlias("IBM");
		CreateAnAccountObj.getSubmitAccount().click();
		Thread.sleep(3000);
		
		String myaccount=MyAccountObj.getMyAccountText().getText();
		Assert.assertEquals(myaccount, "MY ACCOUNT");
		log.info(myaccount);
		
		Thread.sleep(3000);
		HeaderObj.getSignOut().click();
	}
	
	@Test
	public void TestCase002() {
		
		HeaderObj.getSignIn().click();
		athenObj.setCreateEmail("shirillshirill5@gmail.com");
		athenObj.getSubmitCreate().click();
		CreateAnAccountObj.getMr().click();
		CreateAnAccountObj.setFirstName("BOTLA");
		CreateAnAccountObj.setLastName("Shresta");
	//	CreateAnAccountObj.setPassword("");
		CreateAnAccountObj.setDays("7 ");
		CreateAnAccountObj.setMonths("October ");
		CreateAnAccountObj.setYears("2016 ");
		CreateAnAccountObj.getNewsletter().click();
		CreateAnAccountObj.getOptions().click();
		CreateAnAccountObj.setFirstname("BOTLA");
		CreateAnAccountObj.setLastname("SHIREENA");
		CreateAnAccountObj.setCompany("wipro");
		CreateAnAccountObj.setAddress1("11-5-123 NewYorkcity");
		CreateAnAccountObj.setAddress2("11-5-122 NewYorkcity");
		CreateAnAccountObj.setCity("warangal");
		CreateAnAccountObj.setId_state("New York  ");
		CreateAnAccountObj.setPostcode("00000");
		CreateAnAccountObj.setId_country("United States ");
		CreateAnAccountObj.setOther("asdfghjkl");
		CreateAnAccountObj.setPhone("777777777");
		CreateAnAccountObj.setPhone_mobile("888888888");
		CreateAnAccountObj.setAlias("IBM");
		CreateAnAccountObj.getSubmitAccount().click();
		
		String NoPassword=CreateAnAccountObj.getErrorPasswordReq().getText();
		Assert.assertEquals(NoPassword, "passwd is required.");
		log.info(NoPassword);
		
	}
	@Test
	public void TestCase003() {
		HeaderObj.getSignIn().click();
		athenObj.setCreateEmail("shirillshirill8@gmail.com");
		athenObj.getSubmitCreate().click();
		CreateAnAccountObj.getMr().click();
		CreateAnAccountObj.setFirstName("BOTLA");
		CreateAnAccountObj.setLastName("Shresta");
		CreateAnAccountObj.setPassword("123456");
		CreateAnAccountObj.setDays("7 ");
	//	CreateAnAccountObj.setMonths("October ");
		CreateAnAccountObj.setYears("2016 ");
		CreateAnAccountObj.getNewsletter().click();
		CreateAnAccountObj.getOptions().click();
		CreateAnAccountObj.setFirstname("BOTLA");
		CreateAnAccountObj.setLastname("SHRESTA");
		CreateAnAccountObj.setCompany("wipro");
		CreateAnAccountObj.setAddress1("11-5-123 NewYorkcity");
		CreateAnAccountObj.setAddress2("11-5-122 NewYorkcity");
		CreateAnAccountObj.setCity("warangal");
		CreateAnAccountObj.setId_state("New York  ");
		CreateAnAccountObj.setPostcode("00000");
		CreateAnAccountObj.setId_country("United States ");
		CreateAnAccountObj.setOther("asdfghjkl");
		CreateAnAccountObj.setPhone("777777777");
		CreateAnAccountObj.setPhone_mobile("888888888");
		CreateAnAccountObj.setAlias("IBM");
		CreateAnAccountObj.getSubmitAccount().click();
		
		String NoDateOfBirth=CreateAnAccountObj.getInvalidDOBText().getText();
		Assert.assertEquals(NoDateOfBirth, "Invalid date of birth");
		log.info(NoDateOfBirth);
		
	}
	
	
	
	@Test
	public void TestCase004() {
		HeaderObj.getSignIn().click();
		athenObj.setCreateEmail("shirillshirill8@gmail.com");
		athenObj.getSubmitCreate().click();
		CreateAnAccountObj.getMr().click();
		CreateAnAccountObj.setFirstName("BOTLA");
		CreateAnAccountObj.setLastName("Shresta");
		CreateAnAccountObj.setPassword("123456");
	//	CreateAnAccountObj.setDays("7 ");
		CreateAnAccountObj.setMonths("October ");
		CreateAnAccountObj.setYears("2016 ");
		CreateAnAccountObj.getNewsletter().click();
		CreateAnAccountObj.getOptions().click();
		CreateAnAccountObj.setFirstname("BOTLA");
		CreateAnAccountObj.setLastname("SHRESTA");
		CreateAnAccountObj.setCompany("wipro");
		CreateAnAccountObj.setAddress1("11-5-123 NewYorkcity");
		CreateAnAccountObj.setAddress2("11-5-122 NewYorkcity");
		CreateAnAccountObj.setCity("warangal");
		CreateAnAccountObj.setId_state("New York  ");
		CreateAnAccountObj.setPostcode("00000");
		CreateAnAccountObj.setId_country("United States ");
		CreateAnAccountObj.setOther("asdfghjkl");      CreateAnAccountObj.setPhone("777777777");
		CreateAnAccountObj.setPhone_mobile("999999999");
		CreateAnAccountObj.setAlias("IBM");
		CreateAnAccountObj.getSubmitAccount().click();
		
		String NoDateOfBirth=CreateAnAccountObj.getInvalidDOBText().getText();
		Assert.assertEquals(NoDateOfBirth, "Invalid date of birth");
		log.info(NoDateOfBirth);
		
	}
}


