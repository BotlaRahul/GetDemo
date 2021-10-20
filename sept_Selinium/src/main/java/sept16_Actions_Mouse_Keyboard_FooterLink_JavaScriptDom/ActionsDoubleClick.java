package sept16_Actions_Mouse_Keyboard_FooterLink_JavaScriptDom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
        driver.get("https://www.bigbasket.com");
        Actions act = new Actions(driver);
        WebElement DoubleClick = driver.findElement(By.xpath("//input[@id = 'input']"));
        
      //Double click on the webelemebt
        
        act.moveToElement(DoubleClick).click().sendKeys("Tomata").doubleClick().build().perform();
        
        
        Thread.sleep(5000);
        
      //Right click on the web page
        
        act.moveToElement(DoubleClick).contextClick().build().perform();
        

	}

}
