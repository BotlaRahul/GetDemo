package sept14_Xpath2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ParentToChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		//get, getCurrentUrl, getTitle, getPageSource
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//div[@class='form-group']/input[@id='email']")).sendKeys("shirillshirill2@gmail.com");
		// Xpath_Child_To_Parent_To_Sibling_GrandChild Ex.
	  //   driver.findElement(By.xpath("//input[@id='email']//parent::div/following-sibling::div//input")).sendKeys("Shirill@1248");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Shirill@1248");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p/button[@class ='button btn btn-default button-medium']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
		
		

	}

}
