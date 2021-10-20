package sept17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingImg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("(//a[@class = 'sf-with-ul'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class = 'logo img-responsive']")).click();

	}

}
