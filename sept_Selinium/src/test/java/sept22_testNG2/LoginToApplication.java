package sept22_testNG2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

@Test
public class LoginToApplication {
	WebDriver driver;
	
	@BeforeClass
	 public void BeforeClass() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		@BeforeMethod
		public void navigateBrowser() {
			driver.get("http://automationpractice.com/index.php");
		}
		
		@AfterMethod
		public void signOut() {
			driver.findElement(By.linkText("Sign out")).click();
		}
  
	public void loginValidUserNameAndPassword() throws InterruptedException {
		
		 
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("shirillshirill1@gmail.com");
			driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("Shirill@1248");
			driver.findElement(By.xpath("//button[@id = 'SubmitLogin']")).click();
			
			String ValMyAccount ="MY ACCOUNT";
			String myaccount=driver.findElement(By.xpath("//h1[text()='My account']")).getText();
			Thread.sleep(3000);
			
			
			
			Assert.assertEquals(ValMyAccount, myaccount);
			
	 }
	 
	 
	 public void loginValidUserNameAndPassword2() throws InterruptedException {
		 
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("shirillshirill1@gmail.com");
			driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("Shirill@1248");
			driver.findElement(By.xpath("//button[@id = 'SubmitLogin']")).click();
			
			
	//		String ValMyAccount ="My Account";
			String myaccount=driver.findElement(By.xpath("//h1[text()='My account']")).getText();
			Thread.sleep(3000);
			
			System.out.println(myaccount);
			
	//		Assert.assertEquals(ValMyAccount, myaccount);
			
	 }
	 
  
  @AfterClass
  public void afterClass() {
  }
  }

