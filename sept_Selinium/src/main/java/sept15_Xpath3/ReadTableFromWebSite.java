package sept15_Xpath3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTableFromWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> TableColumn= driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/td[3]"));
		
	    System.out.println(TableColumn.size());
	    
	    for(int i =0 ; i < TableColumn.size();i++) {
	    	
	    	String ContactName = TableColumn.get(i).getText();
	    	System.out.println("Country is "+ContactName);
	    }
		
		
		
	}

}
