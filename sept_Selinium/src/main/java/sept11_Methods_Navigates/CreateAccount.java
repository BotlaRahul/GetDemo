package sept11_Methods_Navigates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("http://automationpractice.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("shirillshirill2@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("BOTLA");
		driver.findElement(By.id("customer_lastname")).sendKeys("RAHUL");
		driver.findElement( By.id("passwd")).sendKeys("Shirill@1248");
		
//		Method 1
		driver.findElement(By.id("days")).sendKeys("25  ");
		driver.findElement(By.id("months")).sendKeys("January  ");
		driver.findElement(By.id("years")).sendKeys("1992  ");
		Thread.sleep(2000);
		
//		Select day = new Select(driver.findElement(By.id("days")));
//        day.selectByVisibleText("25  ");
        
  //      Select month = new Select(driver.findElement(By.id("months")));
  //      month.selectByIndex(1);
        
 //       Select year = new Select(driver.findElement(By.id("years")));
 //       year.selectByValue("1992");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
        
	     Thread.sleep(2000);
		driver.findElement(By.id("newsletter")).click();
		
		
		boolean NewsLetterCheckBoxStatus = driver.findElement(By.id("newsletter")).isSelected();
		if(NewsLetterCheckBoxStatus == false) {
			driver.findElement(By.id("newsletter")).click();
			
		}
		
		
		driver.findElement(By.id("address1")).sendKeys("11-5-180 Christain Colony ");
		driver.findElement(By.id("address2")).sendKeys("Warangal Urban");
		driver.findElement(By.id("city")).sendKeys("Warangal");
		driver.findElement(By.id("id_state")).sendKeys("TELANGANA");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		driver.findElement(By.name("id_country")).sendKeys("united states");
		driver.findElement(By.id("phone_mobile")).sendKeys("8897730505");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys(" ChristainColony");
//		driver.findElement(By.id("submitAccount")).click();
//		driver.close();

	}

}
