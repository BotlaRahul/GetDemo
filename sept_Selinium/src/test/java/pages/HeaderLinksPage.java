package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderLinksPage    {
    WebDriver driver;
	
	public HeaderLinksPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// HeaderLinks;
	 
	

	   @FindBy(xpath="//img[@class='img-responsive']")
	   private WebElement GetSavingNowImg;
	   
	   @FindBy(xpath="(//i[@class='icon-phone'])[1]")
	    private WebElement CallUsNow;

	   
	   
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

	public WebElement getSearchTextBox() {
		return SearchTextBox;
	}

	public void setSearchTextBox(String val) {
		SearchTextBox.sendKeys(val);;
	}

	public WebElement getGetSavingNowImg() {
		return GetSavingNowImg;
	}

	public WebElement getCallUsNow() {
		return CallUsNow;
	}

	public WebElement getHomeImg() {
		return HomeImg;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getContactus() {
		return Contactus;
	}

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getSignOut() {
		return SignOut;
	}

	public WebElement getCart() {
		return Cart;
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getTshirts() {
		return Tshirts;
	}
}
