package sept9_FindingElements2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextUsingClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("search_query form-control ac_input")).sendKeys("T-shirts");
	

	}

}
