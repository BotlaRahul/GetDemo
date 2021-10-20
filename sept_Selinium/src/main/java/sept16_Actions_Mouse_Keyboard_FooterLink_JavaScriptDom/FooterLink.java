package sept16_Actions_Mouse_Keyboard_FooterLink_JavaScriptDom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
        driver.get("http://automationpractice.com/index.php");
		
		
		
	    List<WebElement> FooterLinks =	driver.findElements(By.xpath("(//div[@class='row'])[6]//ul/li/a"));
        
	    System.out.println(FooterLinks.size());
	    
		for(int i = 0 ; i < FooterLinks.size(); i++) {
		
	    System.out.println("Footer Is "+ FooterLinks.get(i).getText());
		
	}
		driver.get("https://www.amazon.in/");
		
		List<WebElement> FooterLinks1 =	driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//ul/li/a"));
	   
		System.out.println(FooterLinks1.size());
	    
		for(int i = 0 ; i < FooterLinks1.size(); i++) {
		
	    System.out.println("Footer Is "+ FooterLinks1.get(i).getText());
		
	}

	}

}
