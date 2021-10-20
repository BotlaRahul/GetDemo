package base;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import excel.ExcelReader;
import listeners.EventListener;
import oct1_log4j.LogFileImpl;
import pages.AthenticationPage;
import pages.ContactUsPage;
import pages.CreateAnAccountPage;
import pages.DressesPage;
import pages.FooterLinksPage;
import pages.HeaderLinksPage;
import pages.MyAccountPage;
import pages.Simple_HomePage;
import pages.TshirtsPage;
import pages.WomenPage;

public class TestBase {
	
	

	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public ExcelReader datatable;
	
	
	public AthenticationPage athenObj;
	public ContactUsPage ContactUsObj;
	public CreateAnAccountPage CreateAnAccountObj;
	public DressesPage DressesObj;
	public FooterLinksPage FooterObj;
	public HeaderLinksPage HeaderObj;
	public MyAccountPage MyAccountObj;
	public Simple_HomePage Simple_HomeObj;
	public TshirtsPage TshirtsObj;
	public WomenPage WomenObj;
	
	
	public Logger log = LogManager.getLogger(LogFileImpl.class.getName());
	
	
	
	//extents reporting
	//create two instance variable
	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	@BeforeTest
	public void testbefore() {
		
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\extent-config.xml"));
	}

	
	
	
	
	 @BeforeClass(groups = {"A1","A2","A3"})
	  public void beforeMethod() throws IOException {
		    datatable = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\SpreadSheets\\TestData.xlsx");
		    prop = new Properties();
			FileInputStream fis =new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\src\\test\\resources\\Properties\\Config.properties");
			prop.load(fis);
		 if(prop.getProperty("browser").equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\chrome\\chromedriver.exe" );
			
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless", "--disable-gpu", "--window-size=1366,768","--ignore-certificate-errors");
			driver = new ChromeDriver(options);
			
		 }
		 else if(prop.getProperty("browser").equals("Edge")){
			 System.setProperty("webdriver.edge.driver","C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\drivers\\Edge\\msedgedriver.exe" );
			 driver = new EdgeDriver();
		 }
		 else {
			 System.out.println("provided browser is not support");
		 }
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
			
			//class file which we created in above step
			EventListener ecapture = new EventListener(); 
			
			//pass the driver to EventFiringWebDriver
			EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
			
			//pass ecapture tp eventHandler
			eventHandler.register( ecapture);
			
			
			athenObj = new AthenticationPage(eventHandler);
			ContactUsObj = new ContactUsPage(eventHandler);
			CreateAnAccountObj = new CreateAnAccountPage(eventHandler);
			DressesObj = new DressesPage(eventHandler);
			FooterObj = new FooterLinksPage(eventHandler);
			HeaderObj = new HeaderLinksPage(eventHandler);
			MyAccountObj = new MyAccountPage(eventHandler);
			Simple_HomeObj = new Simple_HomePage(eventHandler);
			TshirtsObj = new TshirtsPage(eventHandler);
			WomenObj = new WomenPage(eventHandler);
			
			
			
			
			
			
	 }
	 @BeforeMethod(groups = {"A1","A2","A3"})
	 public void NavigateToBrowser() {
	 
		  driver.get(prop.getProperty("url"));		
	  }
	
	 
	 
	 @AfterClass(groups = {"A1","A2","A3"})
	  public void afterMethod() {
		 driver.quit();
		 extent.endTest(extentLogger);
			extent.flush();
	  }
	 
	 @AfterTest
	 public void testafter() {
	 	 
	 	extent.close();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
