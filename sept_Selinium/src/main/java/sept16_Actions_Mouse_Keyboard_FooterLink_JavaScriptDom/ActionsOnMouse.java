package sept16_Actions_Mouse_Keyboard_FooterLink_JavaScriptDom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
        driver.get("https://www.bigbasket.com");
        
        Actions act = new  Actions(driver);
        WebElement ShopToCat = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle meganav-shop']"));
        act.moveToElement(ShopToCat).build().perform();
        if(ShopToCat.isDisplayed() && ShopToCat.isEnabled()){
        	
        	driver.findElement(By.xpath("(//a[text()='Bakery, Cakes & Dairy'])[2]n ")).click();
        }
        	else {
        		System.out.println("WebElement is not working ");
        		
        	}
        	
        }

	}


