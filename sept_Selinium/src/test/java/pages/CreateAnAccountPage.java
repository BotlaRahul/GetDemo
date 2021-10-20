package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {
	
WebDriver driver;
	
	public CreateAnAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

   
   
 //ContainerColumn;
   
   
   @FindBy(xpath="//div[@class='columns-container']")
   private WebElement ContainerCol;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement HomeIcon;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement CreateAnAccount;
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[1]")
	private WebElement YourPersonalInformation;
	
	@FindBy(xpath=" //li[text()=' is required.']")
	private WebElement ErrorPasswordReq;
	
	@FindBy(xpath=" (//li[text()=' is invalid.'])[1]")
	private WebElement ErrorInvalPhoneReq;
	
	@FindBy(xpath=" (//li[text()=' is invalid.'])[2]")
	private WebElement ErrorInvalMobileReq;
	
	
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
	
	@FindBy(xpath="//select[@id='days']")
	private WebElement Days;
	
	@FindBy(xpath="//select[@id='months']")
	private WebElement months;
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement years;
		
	@FindBy(xpath="//li[text()='Invalid date of birth']")
	private WebElement InvalidDOBText;
	
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
	
	@FindBy(xpath="//select[@id='id_state']")
	private WebElement  id_state ;
	
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postcode;
	
	@FindBy(xpath="//select[@id='id_country']")
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

	public WebElement getYourPersonalInformation() {
		return YourPersonalInformation;
	}

	
	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(String val) {
		FirstName.sendKeys(val);
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(String val) {
		LastName.sendKeys(val);;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(String val) {
		Email.sendKeys(val);
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(String val) {
		Password.sendKeys(val);
	}

	public WebElement getDays() {
		return Days;
	}

	public void setDays(String val) {
		Days.sendKeys(val);
	}

	public WebElement getMonths() {
		return months;
	}

	public void setMonths(String val) {
		this.months.sendKeys(val);;
	}

	public WebElement getYears() {
		return years;
	}

	public void setYears(String val) {
		this.years.sendKeys(val);
	}

	public WebElement getYourAddress() {
		return YourAddress;
	}

	public void setYourAddress(String val) {
		YourAddress.sendKeys(val);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String val) {
		this.firstname.sendKeys(val);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String val) {
		this.lastname.sendKeys(val);;
	}

	public WebElement getCompany() {
		return company;
	}

	public void setCompany(String val) {
		this.company.sendKeys(val);
	}

	public WebElement getAddress1() {
		return address1;
	}

	public void setAddress1(String val) {
		this.address1.sendKeys(val);
	}

	public WebElement getAddress2() {
		return address2;
	}

	public void setAddress2(String val) {
		this.address2.sendKeys(val);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String val) {
		this.city.sendKeys(val);
	}

	public WebElement getId_state() {
		return id_state;
	}

	public void setId_state(String val) {
		this.id_state.sendKeys(val);
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public void setPostcode(String val) {
		this.postcode.sendKeys(val);;
	}

	public WebElement getId_country() {
		return id_country;
	}

	public void setId_country(String val) {
		this.id_country.sendKeys(val);
	}

	public WebElement getOther() {
		return other;
	}

	public void setOther(String val) {
		this.other.sendKeys(val);
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(String val) {
		this.phone.sendKeys(val);
	}

	public WebElement getPhone_mobile() {
		return phone_mobile;
	}

	public void setPhone_mobile(String val) {
		this.phone_mobile.sendKeys(val);
	}

	public WebElement getAlias() {
		return alias;
	}

	public void setAlias(String val) {
		this.alias.sendKeys(val);
	}

	public WebElement getContainerCol() {
		return ContainerCol;
	}

	public WebElement getHomeIcon() {
		return HomeIcon;
	}

	public WebElement getCreateAnAccount() {
		return CreateAnAccount;
	}

	public WebElement getMr() {
		return Mr;
	}

	public WebElement getMrs() {
		return Mrs;
	}

	public WebElement getSubmitAccount() {
		return submitAccount;
	}


	public WebElement getNewsletter() {
		return newsletter;
	}


	public WebElement getOptions() {
		return options;
	}


	public WebElement getErrorPasswordReq() {
		return ErrorPasswordReq;
	}


	public WebElement getErrorInvalPhoneReq() {
		return ErrorInvalPhoneReq;
	}


	public WebElement getErrorInvalMobileReq() {
		return ErrorInvalMobileReq;
	}


	public WebElement getInvalidDOBText() {
		return InvalidDOBText;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
