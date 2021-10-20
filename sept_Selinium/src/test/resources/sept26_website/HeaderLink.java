package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderLink {

	
	
	// HeaderLinks;
	  
	  
	  @FindBy(xpath = "//head]er[@id='header'")
	  private WebElement Header;
	

	   @FindBy(xpath="//img[@class='img-responsive']")
	   private WebElement GetSavingNowImg;
	   
	   @FindBy(xpath="//img[@class='logo img-responsive']")
	   private WebElement HomeImg;
	   

	   
     @FindBy(xpath="//input[@id='search_query_top']")
     private WebElement SearchTextBox;
   
     
     @FindBy(xpath="//button[@name='submit_search']")
     private WebElement SearchButton;
     
     @FindBy(linkText ="Contact us")
     private WebElement Contactus;
     
     @FindBy(linkText = "Sign in")
     private WebElement SignIn;
     
     @FindBy(linkText = "Sign out")
     private WebElement SignOut;
     
     @FindBy(xpath="//b[contains(text(),'Cart')]")
     private WebElement Cart;
     
     @FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
     private WebElement Women;
     
     @FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
     private WebElement Dresses;
     
     @FindBy(linkText = "T-shirts")
     private WebElement Tshirts;
}
