package sept15_Xpath3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataWebSites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		//get, getCurrentUrl, getTitle, getPageSource
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("shirillshirill1@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("Shirill@1248");
		driver.findElement(By.xpath("//button[@id = 'SubmitLogin']")).click();
		
        String loginText = "MY ACCOUNT";
		
		WebElement getLoginText = driver.findElement(By.xpath("//h1[contains(text(),'My account')]"));
		String afterLoginText = getLoginText.getText();
		
		System.out.println(afterLoginText);
		
		if(loginText.equals(afterLoginText)) {
			System.out.println("TEstcase pass");
		} else {
			System.out.println("Testcase fail");
		}
		
		
		Thread.sleep(5000);
		String AccountInfo = driver.findElement(By.xpath("//h1[@class='info-account'")).getText();
		System.out.println( AccountInfo );

	}
}
