package sept16_Actions_Mouse_Keyboard_FooterLink_JavaScriptDom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExEnterCAPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
        driver.get("https://www.bigbasket.com");
        Actions act = new Actions(driver);
        WebElement DoubleClick = driver.findElement(By.xpath("//input[@id = 'input']"));
        
        act.moveToElement(DoubleClick).click().keyDown(Keys.SHIFT).sendKeys("banana").build().perform();

	}

}
