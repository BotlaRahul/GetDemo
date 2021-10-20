package sept16_Actions_Mouse_Keyboard_FooterLink_JavaScriptDom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFooterAnchorTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
     //   driver.get("http://automationpractice.com/index.php");
         
		driver.get("https://www.bigbasket.com");  
        
       List<WebElement> footerLinks =  driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[1]/ul/li/a"));
		
		System.out.println("total links "+ footerLinks);
		
		for(int i = 0 ; i < footerLinks.size() ; i++) {
		if(footerLinks.get(i).getText().equals("Affiliate")) {
			continue;
		}
		System.out.println(footerLinks.get(i).getText());
		
			}
		}
		
	}
		
	


