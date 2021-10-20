package sept11_Methods_Navigates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//get, getCurrentUrl, getTitle, getPageSource
		driver.get("http://automationpractice.com");
		
	
		String getcurrentURL = driver.getCurrentUrl();
		System.out.println("URL is "+getcurrentURL);
		
		String getTitleName = driver.getTitle();
		System.out.println("get title name is"+getTitleName);
		
		String getPageSource = driver.getPageSource();
		System.out.println("get page source is "+getPageSource);
		

	}

}
