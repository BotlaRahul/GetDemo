package sept9_FindingElements2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountSignIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("shirillshirill@gmail.com");
		driver.findElement( By.id("passwd")).sendKeys("Shirill@1248");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
	
		driver.close();

	}

}
