package sept17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeAndFrifoxWebDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\Edge\\msedgedriver.exe" );
		WebDriver driver;
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		driver.get("http://automationpractice.com/index.php");
	}

}
