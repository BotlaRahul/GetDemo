package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {

	
	

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
      
     
      
      
     
}
