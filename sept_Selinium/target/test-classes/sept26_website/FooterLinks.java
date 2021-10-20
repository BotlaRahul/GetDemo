package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLinks {

	
	
	
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
}
