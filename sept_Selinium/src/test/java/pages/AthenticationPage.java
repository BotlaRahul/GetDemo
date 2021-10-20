package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AthenticationPage {
	
  
	
WebDriver driver;
	
	public AthenticationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
   //ContainerColumn;
     
     
  //   @FindBy(xpath="//div[@class='columns-container']")
 //    private WebElement ContainerCol;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement HomeIcon;
	
	
	@FindBy(xpath="//h1[@class='page-heading']")
     private WebElement Authentication;
	
	@FindBy(xpath="//li[text()='Authentication failed.']")
	private WebElement AuthenticationFailed;
	
	
	@FindBy(xpath="//li[text()='Password is required.']")
	private WebElement PasswordIsRequired;
	
	
//	@FindBy(xpath="(//h3[@class='page-subheading'])[1]")
//    private WebElement CreateAnAccount;
	
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement CreateEmail;
	
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement SubmitCreate;
	
//	@FindBy(xpath="(//h3[@class='page-subheading'])[2]")
//	 private WebElement AlreadyRegistered;
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailAddress;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	private WebElement ForgetPassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement SignInButton;

	public WebElement getCreateEmail() {
		return CreateEmail;
	}

	public void setCreateEmail(String val) {
		CreateEmail.sendKeys(val);;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String val) {
		EmailAddress.sendKeys(val);;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(String val) {
		Password.sendKeys(val);;
	}

	public WebElement getHomeIcon() {
		return HomeIcon;
	}

	public WebElement getSubmitCreate() {
		return SubmitCreate;
	}

	public WebElement getForgetPassword() {
		return ForgetPassword;
	}

	public WebElement getSignInButton() {
		return SignInButton;
	}

	public WebElement getAuthentication() {
		return Authentication;
	}

	public WebElement getAuthenticationFailed() {
		return AuthenticationFailed;
	}

	public WebElement getPasswordIsRequired() {
		return PasswordIsRequired;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
