package oct2_extents;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class TestReporting extends TestBase {
	
	
  @Test
  public void f() {
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  extentLogger = extent.startTest(TestcaseId, "TestStarted");
	  extentLogger.log(LogStatus.PASS, "text");
	  extentLogger.log(LogStatus.FAIL, "text");
	  extentLogger.log(LogStatus.INFO, "text");
	  
  }
}