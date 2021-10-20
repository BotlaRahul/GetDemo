package sept23_testNG3;

import org.testng.annotations.Test;

import base.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class TestcasesEx2 extends TestBase {

	
	
  @Test(groups = {"P3"} )
  public void testcase001() {
	   Actions act = new Actions(driver);
      WebElement DoubleClick = driver.findElement(By.xpath("//input[@id = 'input']"));
      
    //Double click on the webelemebt
      
      act.moveToElement(DoubleClick).click().sendKeys("Tomata").doubleClick().build().perform();
      
    //Right click on the web page
      
      act.moveToElement(DoubleClick).contextClick().build().perform();
      
  }
 
  @Test(groups = {"P1"} )
  public void testcase002() {
	   Actions act = new Actions(driver);
	   WebElement DoubleClick = driver.findElement(By.xpath("//input[@id = 'input']"));
       
       act.moveToElement(DoubleClick).click().keyDown(Keys.SHIFT).sendKeys("banana").build().perform();
  }

  @Test(groups = {"P1"} )
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
  }

  

 
  @AfterClass
  public void afterClass() {
	  
  }

}
