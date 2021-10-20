package sept16_Actions_Mouse_Keyboard_FooterLink_JavaScriptDom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
        driver.get("https://www.bigbasket.com/");
        WebElement Search = driver.findElement(By.xpath("//input[@id = 'input']"));
        Search.sendKeys("Colgate");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String exe = "return document.getElementById(\"input\").value";
        String col = (String)js.executeScript(exe);
        
        System.out.println(exe);
        System.out.println("value is "+col);
        
        

	}

}
