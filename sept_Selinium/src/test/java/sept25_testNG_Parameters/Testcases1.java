package sept25_testNG_Parameters;

import org.testng.annotations.Test;

import base.TestBase;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Testcases1 extends TestBase {
	

@Test(groups = {"A1"},dependsOnMethods = "testcase003" )
  @Parameters({"vegName1","vegName2"})
  public void testcase001(String name1,String name2) {
	   Actions act = new Actions(driver);
      WebElement DoubleClick = driver.findElement(By.xpath("//input[@id = 'input']"));
      
    //Double click on the webelemebt
      
      act.moveToElement(DoubleClick).click().sendKeys(name1).doubleClick().build().perform();
      
    //Right click on the web page
      
      act.moveToElement(DoubleClick).contextClick().build().perform();
      
  }
 
  @Test(groups = {"A2"} )
  @Parameters({"vegName1","vegName2"})
  public void testcase002(String name1,String name2) {
	  
	   Actions act = new Actions(driver);
	   WebElement DoubleClick = driver.findElement(By.xpath("//input[@id = 'input']"));
       
       act.moveToElement(DoubleClick).click().keyDown(Keys.SHIFT).sendKeys(name2).build().perform();
  }

  @Test(groups = {"A3"} )
  public void testcase003() {
	  Actions act = new  Actions(driver);
      WebElement ShopToCat = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle meganav-shop']"));
      act.moveToElement(ShopToCat).build().perform();
      if(ShopToCat.isDisplayed() && ShopToCat.isEnabled()){
      	
      	driver.findElement(By.xpath("(//a[text()='Bakery, Cakes & Dairy'])[2] ")).click();
      }
      	else {
      		System.out.println("WebElement is not working ");
      		
      	}
 //     Assert.assertTrue(false);
  }

  

 


}
