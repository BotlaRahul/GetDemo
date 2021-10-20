package sept13_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		//get, getCurrentUrl, getTitle, getPageSource
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("t shirts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
		
		driver.findElement(By.xpath("//input[@name = 'search_query']")).sendKeys("shirts");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class = 'search_query form-control ac_input']")).sendKeys("jeans");
		

	}

}
