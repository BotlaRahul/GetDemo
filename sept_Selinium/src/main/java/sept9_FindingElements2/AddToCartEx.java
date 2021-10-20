package sept9_FindingElements2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("guitar for kids girls");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("B&B E-Mart Rockband Music and Lights Guitar Toy, Big Red for Girls (Pink)")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
