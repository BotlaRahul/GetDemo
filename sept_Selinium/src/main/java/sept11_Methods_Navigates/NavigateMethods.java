package sept11_Methods_Navigates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("http://automationpractice.com");
		driver.findElement(By.linkText("Sign in")).click();
		
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("email_create")).sendKeys("shirillshirill3@gmail.com");
		String email = driver.findElement(By.id("email_create")).getAttribute("value");
		System.out.println("Email id is " + email);
		
		driver.navigate().refresh();
		
		email = driver.findElement(By.id("email_create")).getAttribute("value");
		System.out.println("Email id is " + email);

	}

}
