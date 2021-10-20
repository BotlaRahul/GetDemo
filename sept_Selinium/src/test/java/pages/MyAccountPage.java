package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MyAccountPage  {

WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

// ContainerColumn;


    @FindBy(xpath="//div[@class='columns-container']")
    private WebElement ContainerCol;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement HomeIcon;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement MyAccountText;
	
	
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")
	private WebElement OrderHistoryAndDetails;
	
	
	@FindBy(xpath="//span[contains(text(),'My credit slips')]")
	private WebElement MyCreditSlips1;
	
	
	
	
      @FindBy(xpath="//span[contains(text(),'My addresses')]")
    	private WebElement MyAddresses1;		
      
      
      @FindBy(xpath="//span[contains(text(),'My personal information')]")
  	  private WebElement MyPersonalInformation;
      
      @FindBy(xpath="(//a[@class='btn btn-default button button-small'])[2]")
  	  private WebElement HomeIcon2;

	public WebElement getContainerCol() {
		return ContainerCol;
	}

	public WebElement getHomeIcon() {
		return HomeIcon;
	}

	public WebElement getMyAccountText() {
		return MyAccountText;
	}

	public WebElement getOrderHistoryAndDetails() {
		return OrderHistoryAndDetails;
	}

	public WebElement getMyCreditSlips1() {
		return MyCreditSlips1;
	}

	public WebElement getMyAddresses1() {
		return MyAddresses1;
	}

	public WebElement getMyPersonalInformation() {
		return MyPersonalInformation;
	}

	public WebElement getHomeIcon2() {
		return HomeIcon2;
	}
      
     
      
      
     
}
