package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FooterLinksPage  {
	
	WebDriver driver;
	
	public FooterLinksPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
	// Footerlinks;
    
    @FindBy(xpath="//div[@class='footer-container']")
    private WebElement footer;
    
    @FindBy(xpath="//div[@class='block']")
    private WebElement NewsLetter;
    
    @FindBy(xpath = "//input[@class='inputNew form-control grey newsletter-input']/following-sibling::button")
    private WebElement email2;
    
    
    @FindBy(xpath = "//section[@id='social_block']")
    private WebElement FollowUs;
    
    @FindBy(xpath = "//li[@class='facebook']")
    private WebElement Facebook;
    
    @FindBy(xpath = "//li[@class='twitter']")
    private WebElement Twitter;
    
    @FindBy(xpath = "//li[@class='youtube']")
    private WebElement Youtube;
    
    @FindBy(xpath = "//li[@class='google-plus']")
    private WebElement GooglePlus;
    
    @FindBy(xpath = "//section[@class='blockcategories_footer footer-block col-xs-12 col-sm-2']")
    private WebElement Catagories;
    
    @FindBy(xpath ="(//a[contains(text(),'Women')])[2]")
    private WebElement Women2;
    
    @FindBy(xpath="//section[@id='block_various_links_footer']")
    private WebElement Information;
    

    @FindBy(xpath="(//li[@class='item'])[1]")
    private WebElement Specials;
    
    @FindBy(xpath="(//li[@class='item'])[2]")
    private WebElement NewProducts;
    
    @FindBy(xpath="(//li[@class='item'])[3]")
    private WebElement BestSeller1;
    
    @FindBy(xpath="(//li[@class='item'])[4]")
    private WebElement OurStories;
    
    @FindBy(xpath="(//li[@class='item'])[5]")
    private WebElement Contactus1;
    
    @FindBy(xpath="(//li[@class='item'])[6]")
    private WebElement TermsAndConditions;
    
    @FindBy(xpath="(//li[@class='item'])[7]")
    private WebElement AboutUs;
    
    @FindBy(xpath ="(//section[@class='footer-block col-xs-12 col-sm-4'])[1]")
    private WebElement MyAccount;
    
    @FindBy(xpath ="//a[contains(text(),'My orders')]")
    private WebElement MyOrders;
    
    
    @FindBy(xpath ="//a[contains(text(),'My credit slips')]")
    private WebElement MyCreditSlips;
    
    @FindBy(xpath ="//a[contains(text(),'My addresses')]")
    private WebElement MyAddresses;
    
    @FindBy(xpath ="//a[contains(text(),'My personal info')]")
    private WebElement MyPersonalInfo;
    
    @FindBy(xpath ="(//section[@class='footer-block col-xs-12 col-sm-4'])[2]")
    private WebElement StoreInformation;
    
    @FindBy(xpath="(//i[@class='icon-phone'])[2]")
    private WebElement CallUsNow;

	public WebElement getEmail2() {
		return email2;
	}

	public void setEmail2(String val) {
		this.email2.sendKeys(val);;
	}

	public WebElement getFooter() {
		return footer;
	}

	public WebElement getNewsLetter() {
		return NewsLetter;
	}

	public WebElement getFollowUs() {
		return FollowUs;
	}

	public WebElement getFacebook() {
		return Facebook;
	}

	public WebElement getTwitter() {
		return Twitter;
	}

	public WebElement getYoutube() {
		return Youtube;
	}

	public WebElement getGooglePlus() {
		return GooglePlus;
	}

	public WebElement getCatagories() {
		return Catagories;
	}

	public WebElement getWomen2() {
		return Women2;
	}

	public WebElement getInformation() {
		return Information;
	}

	public WebElement getSpecials() {
		return Specials;
	}

	public WebElement getNewProducts() {
		return NewProducts;
	}

	public WebElement getBestSeller1() {
		return BestSeller1;
	}

	public WebElement getOurStories() {
		return OurStories;
	}

	public WebElement getContactus1() {
		return Contactus1;
	}

	public WebElement getTermsAndConditions() {
		return TermsAndConditions;
	}

	public WebElement getAboutUs() {
		return AboutUs;
	}

	public WebElement getMyAccount() {
		return MyAccount;
	}

	public WebElement getMyOrders() {
		return MyOrders;
	}

	public WebElement getMyCreditSlips() {
		return MyCreditSlips;
	}

	public WebElement getMyAddresses() {
		return MyAddresses;
	}

	public WebElement getMyPersonalInfo() {
		return MyPersonalInfo;
	}

	public WebElement getStoreInformation() {
		return StoreInformation;
	}

	public WebElement getCallUsNow() {
		return CallUsNow;
	}
    
}
