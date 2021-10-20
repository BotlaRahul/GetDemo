package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccount {
	
	
	
	String HeaderLinks;
	  
	  
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
   
   @FindBy(xpath="//b[contains(text(),'Cart')]")
   private WebElement Cart;
   
   @FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
   private WebElement Women;
   
   @FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
   private WebElement Dresses;
   
   @FindBy(linkText = "T-shirts")
   private WebElement Tshirts;
   
   
 String ContainerColumn;
   
   
   @FindBy(xpath="//div[@class='columns-container']")
   private WebElement ContainerCol;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement HomeIcon;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement CreateAnAccount;
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[1]")
	private WebElement YourPersonalInformation;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	private WebElement Mr;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	private WebElement Mrs;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	private WebElement LastName;
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email;
	
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//select[@id='days']//following-sibling::option")
	private WebElement Days;
	
	@FindBy(xpath="//select[@id='months']//following-sibling::option")
	private WebElement months;
	
	@FindBy(xpath="//select[@id='years']//following-sibling::option")
	private WebElement years;
		
	@FindBy(xpath="//input[@id='newsletter']")
	private WebElement newsletter;
	
	@FindBy(xpath="//input[@id='optin']")
	private WebElement options;
	
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[2]")
	private WebElement YourAddress;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname;
	
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']//following-sibling::option")
	private WebElement  id_state ;
	
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postcode;
	
	@FindBy(xpath="//select[@id='id_country']//option")
	private WebElement id_country;
	
	@FindBy(xpath="//textarea[@id='other']")
	private WebElement other;
	
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement phone_mobile;
	
	@FindBy(xpath="//input[@id='alias']")
	private WebElement alias;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	private WebElement submitAccount;
	
	
String Footerlinks;
    
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
