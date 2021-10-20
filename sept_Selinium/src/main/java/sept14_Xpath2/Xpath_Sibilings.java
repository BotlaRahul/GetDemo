package sept14_Xpath2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Sibilings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		//get, getCurrentUrl, getTitle, getPageSource
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("Jeans");
		driver.findElement(By.xpath("//input[@id = 'search_query_top']//following-sibling::button")).click();

	}

}
