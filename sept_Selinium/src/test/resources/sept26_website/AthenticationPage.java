package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AthenticationPage {
	

	
	
   String ContainerColumn;
     
     
     @FindBy(xpath="//div[@class='columns-container']")
     private WebElement ContainerCol;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement HomeIcon;
	
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement Authentication;
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[1]")
    private WebElement CreateAnAccount;
	
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement CreateEmail;
	
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement SubmitCreate;
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[2]")
	 private WebElement AlreadyRegistered;
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailAddress;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	private WebElement ForgetPassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement SignInButton;
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
