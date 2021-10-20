package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ContactUsPage  {
	
WebDriver driver;
	
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   //ContainerColumn;
     
     
    
     
     
   //  @FindBy(xpath="//div[@class='breadcrumb clearfix']")
  //   private WebElement breadcrumb;
     
     @FindBy(xpath="//i[@class='icon-home']")
     private WebElement HomeIcon;
     
  

	@FindBy(xpath ="//h1[@class='page-heading bottom-indent']")
     private WebElement PageHeading;
     
     @FindBy(xpath="//p[@class='alert alert-success']")
     private WebElement AlertSuccess;
   
     
     @FindBy(xpath="//li[text()='The message cannot be blank.']")
     private WebElement AlertFailed;
     
     
 //    @FindBy(xpath = "//h3[@class='page-subheading']")
//     private WebElement SubHeading;
     
     @FindBy(xpath="//select[@id='id_contact']")
     private WebElement SubjectReading;
    
     
     @FindBy(xpath="//input[@class='form-control grey validate']")
     private WebElement EmailAddress;
   
     
     @FindBy(xpath="//input[@class='form-control grey']")
     private WebElement OrderReference;
     
     @FindBy(xpath="//span[@class='action']")
     private WebElement AttachFile;
     
     @FindBy(xpath="//textarea[@id='message']")
     private WebElement TypeMessage;
     
     @FindBy(xpath="//button[@id='submitMessage']")
     private WebElement submitMessage;

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String val) {
		EmailAddress.sendKeys(val);;
	}

	public WebElement getTypeMessage() {
		return TypeMessage;
	}

	public void setTypeMessage(String val) {
		TypeMessage.sendKeys(val);;
	}

	public WebElement getHomeIcon() {
		return HomeIcon;
	}

	
	public WebElement getOrderReference() {
		return OrderReference;
	}

	public WebElement getAttachFile() {
		return AttachFile;
	}

	public WebElement getSubmitMessage() {
		return submitMessage;
	}
     
 
	   public WebElement getPageHeading() {
			return PageHeading;
		}

		public WebElement getAlertSuccess() {
			return AlertSuccess;
		}

		public WebElement getAlertFailed() {
			return AlertFailed;
		}

		public WebElement getSubjectReading() {
			return SubjectReading;
		}

		public void setSubjectReading(String val) {
			SubjectReading.sendKeys(val);
		}

		public void setOrderReference(String val) {
			OrderReference.sendKeys(val);
		}


	
     
     
     
     
     
     
     
     
     
 
}
