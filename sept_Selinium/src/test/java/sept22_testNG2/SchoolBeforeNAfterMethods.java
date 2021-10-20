package sept22_testNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;


public class SchoolBeforeNAfterMethods {
  @Test
  public void Student() {
	  System.out.println("student name is Rahul");
	  
	  
  }
  @Test
  public void Student2() {
	  System.out.println("student name is Ramesh");
	  
	  
	  
  }
  @Test
  public void Student3() {
	  System.out.println("student name is Rajesh");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I m from before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I m from after method ");
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from Before class");
 }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from After class");
  }

}
