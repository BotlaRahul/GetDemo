package sept21_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;


public class Emp {
  @Test
  public void empInfo() {
	  System.out.println("emp name is Santhosh");
  }
  
  
  @Test
  public void empInfo2() {
	  System.out.println("emp name is Shiva");
  }
  @BeforeTest
  
  public void beforeTest() {
	  System.out.println("i m from Before Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("i m from After Test");
	  }
@BeforeClass
public void  beforeclass() {
	System.out.println("I m from Before Class");
}
@AfterClass
public void afterclass() {
	System.out.println("I m from After Class");
}

}
