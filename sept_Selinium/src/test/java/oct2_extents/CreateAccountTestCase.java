package oct2_extents;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class CreateAccountTestCase extends TestBase {
	
	
	@Test
	public void TestCase001() throws InterruptedException {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		extentLogger.log(LogStatus.INFO, "Clicking on the SignIn Link");
		HeaderObj.getSignIn().click();
		extentLogger.log(LogStatus.INFO, "Enter Email id");
		athenObj.setCreateEmail("shirillshii@gmail.com");
		athenObj.getSubmitCreate().click();
		extentLogger.log(LogStatus.INFO,"Entering into the Create Account Page or not");
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
		extentLogger.log(LogStatus.INFO, "Entering into the MyAccount page Successfully or not");
		Thread.sleep(3000);
		
		String myaccount=MyAccountObj.getMyAccountText().getText();
		Assert.assertEquals(myaccount, "MY ACCOUNT");
		extentLogger.log(LogStatus.PASS, "TestCase1 is pass ");
		
		
		Thread.sleep(3000);
		HeaderObj.getSignOut().click();
	}
	
	@Test
	public void TestCase002() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		extentLogger.log(LogStatus.INFO, "Clicking on the SignIn Link");
		HeaderObj.getSignIn().click();
		extentLogger.log(LogStatus.INFO, "Enter Email id");
		athenObj.setCreateEmail("shirillshirill5@gmail.com");
		athenObj.getSubmitCreate().click();
		extentLogger.log(LogStatus.INFO,"Entering into the Create Account Page or not");
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
		extentLogger.log(LogStatus.INFO, "Entering into the MyAccount page Successfully or not");
		
		String NoPassword=CreateAnAccountObj.getErrorPasswordReq().getText();
		Assert.assertEquals(NoPassword, "passwd is required.");
		extentLogger.log(LogStatus.PASS, "TestCase21 is pass ");
		
	}
	@Test
	public void TestCase003() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		extentLogger.log(LogStatus.INFO, "Clicking on the SignIn Link");
		HeaderObj.getSignIn().click();
		extentLogger.log(LogStatus.INFO, "Enter Email id");
		athenObj.setCreateEmail("shirillshirill8@gmail.com");
		athenObj.getSubmitCreate().click();
		extentLogger.log(LogStatus.INFO,"Entering into the Create Account Page or not");
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
		extentLogger.log(LogStatus.INFO, "Entering into the MyAccount page Successfully or not");
		
		String NoDateOfBirth=CreateAnAccountObj.getInvalidDOBText().getText();
		Assert.assertEquals(NoDateOfBirth, "Invalid date of birth");
		extentLogger.log(LogStatus.PASS, "TestCase3 is pass ");
		
	}
	
	
	
	@Test
	public void TestCase004() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		extentLogger.log(LogStatus.INFO, "Clicking on the SignIn Link");
		HeaderObj.getSignIn().click();
		extentLogger.log(LogStatus.INFO, "Enter Email id");
		athenObj.setCreateEmail("shirillshirill8@gmail.com");
		athenObj.getSubmitCreate().click();
		extentLogger.log(LogStatus.INFO,"Entering into the Create Account Page or not");
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
		extentLogger.log(LogStatus.INFO, "Entering into the MyAccount page Successfully or not");
		
		String NoDateOfBirth=CreateAnAccountObj.getInvalidDOBText().getText();
		Assert.assertEquals(NoDateOfBirth, "Invalid date of birth");
		extentLogger.log(LogStatus.PASS, "TestCase4 is pass ");
		
	}
}


