package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs {
	
	
	
   String ContainerColumn;
     
     
     @FindBy(xpath="//div[@class='columns-container']")
     private WebElement ContainerCol;
     
     
     @FindBy(xpath="//div[@class='breadcrumb clearfix']")
     private WebElement breadcrumb;
     
     @FindBy(xpath="//i[@class='icon-home']")
     private WebElement HomeIcon;
     
     @FindBy(xpath ="//h1[@class='page-heading bottom-indent']")
     private WebElement PageHeading;
     
     @FindBy(xpath = "//h3[@class='page-subheading']")
     private WebElement SubHeading;
     
     @FindBy(xpath="(//select[@id='id_contact']//option)[1]")
     private WebElement Choose;
     
     @FindBy(xpath="(//select[@id='id_contact']//option)[2]")
     private WebElement CustomerService;
     
     @FindBy(xpath="(//select[@id='id_contact']//option)[3]")
     private WebElement WebMaster;
     
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
     
 

     
     
     
     
     
     
     
     
     
     
     
 
}
