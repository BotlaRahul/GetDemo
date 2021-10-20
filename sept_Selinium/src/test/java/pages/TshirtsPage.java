package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TshirtsPage  {

WebDriver driver;
	
	public TshirtsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//ContainerColumn;


@FindBy(xpath="//div[@class='columns-container']")
private WebElement ContainerCol;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement HomeIcon;
	
	
	@FindBy(xpath="//div[@id='left_column']")
	private WebElement LeftColumn;
	
	@FindBy(xpath="(//p[@class='title_block'])[1]")
	private WebElement Catlog;
	
	@FindBy(xpath="(//div[@class='checker'])[1]")
	private WebElement checkboxTops;
	
	
	@FindBy(xpath="(//div[@class='checker'])[2]")
	private WebElement checkboxDresses;
	
	
	@FindBy(xpath="(//div[@class='checker'])[3]")
	private WebElement checkboxS7;
	
	@FindBy(xpath="(//div[@class='checker'])[4]")
	private WebElement checkboxM7;
	
	@FindBy(xpath="(//div[@class='checker'])[5]")
	private WebElement checkboxL7;
	
	@FindBy(xpath="(//div[@class='checker'])[6]")
	private WebElement checkboxCotton;
	
	@FindBy(xpath="(//div[@class='checker'])[7]")
	private WebElement checkboxPolyester;
	
	
	@FindBy(xpath="(//div[@class='checker'])[8]")
	private WebElement checkboxviscose;
	
	@FindBy(xpath="(//div[@class='checker'])[9]")
	private WebElement checkboxCasual;
	
	@FindBy(xpath="(//div[@class='checker'])[10]")
	private WebElement checkboxDressy;
	
	
	@FindBy(xpath="(//div[@class='checker'])[11]")
	private WebElement checkboxGirly;
	
	
	@FindBy(xpath="(//div[@class='checker'])[12]")
	private WebElement checkboxColourfulDress;
	
	@FindBy(xpath="(//div[@class='checker'])[13]")
	private WebElement checkboxMaxiDress;
	
	@FindBy(xpath="(//div[@class='checker'])[14]")
	private WebElement checkboxMidiDress;
	
	@FindBy(xpath="(//div[@class='checker'])[15]")
	private WebElement checkboxShortDress;
	
	@FindBy(xpath="(//div[@class='checker'])[16]")
	private WebElement checkboxShortSleves;
	
	
	@FindBy(xpath="(//div[@class='checker'])[17]")
	private WebElement checkboxInStocks;
	
	
	@FindBy(xpath="(//div[@class='checker'])[18]")
	private WebElement checkboxFashionManufacture;
	
	@FindBy(xpath="(//div[@class='checker'])[19]")
	private WebElement checkboxNew;
	
	
	
	@FindBy(xpath="(//p[@class='title_block'])[2]")
	private WebElement Information1;
	
	

	@FindBy(linkText = "Delivery")
	private WebElement Delivery;
	
	@FindBy(linkText = "Legal Notice")
	private WebElement LegalNotice;
	
	@FindBy(linkText = "Terms and conditions of use")
	private WebElement TermsAndConditions1;
	
	@FindBy(linkText = "About us")
	private WebElement AboutUs1;
	
	
	@FindBy(linkText = "Secure payment")
	private WebElement SecurePayment;
	
	
	@FindBy(linkText = "Our stores")
	private WebElement OurStores2;
	
	
	@FindBy(xpath="(//p[@class='title_block'])[3]")
	private WebElement Specials1;
	
	
	@FindBy(xpath="(//a[@class='product-name'])[1]")
	private WebElement PrintedChiffonDress;
	
	@FindBy(xpath="(//a[@class='btn btn-default button button-small'])[2]")
	private WebElement AllSpecials;
	
					
	
	
	@FindBy(xpath="(//p[@class='title_block'])[4]")
	private WebElement OurStores;
	
	@FindBy(xpath="(//img[@class='img-responsive'])[2]")
	private WebElement Img;
	
	
	@FindBy(xpath="(//a[@class='btn btn-default button button-small'])[2]")
	private WebElement DiscoverOurStore;
		
	
	@FindBy(xpath="(//p[@class='title_block'])[5]")
	private WebElement ViewProducts;
	
	@FindBy(xpath="(//a[@class='product-name'])[2]")
	private WebElement FadedShortSleeve;
	  
	@FindBy(xpath="//div[@id='center_column']")
	private WebElement CenterColumn;
	

	
	@FindBy(xpath ="//select[@id='selectProductSort']")
	private WebElement selectProductSort;
	
	@FindBy(xpath="(//a[@class='product-name'])[3]")
	private WebElement FadedShortSleevesTshirt;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]")
	private WebElement FadedShortSleevesTshirtAddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[1]")
	private WebElement FadedShortSleevesTshirtMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_1']")
	private WebElement FadedShortSleevesTshirtWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[1]")
	private WebElement add_to_compare1;

	public WebElement getSelectProductSort() {
		return selectProductSort;
	}

	public void setSelectProductSort(String val) {
		this.selectProductSort.sendKeys(val);;
	}

	public WebElement getContainerCol() {
		return ContainerCol;
	}

	public WebElement getHomeIcon() {
		return HomeIcon;
	}

	public WebElement getLeftColumn() {
		return LeftColumn;
	}

	public WebElement getCatlog() {
		return Catlog;
	}

	public WebElement getCheckboxTops() {
		return checkboxTops;
	}

	public WebElement getCheckboxDresses() {
		return checkboxDresses;
	}

	public WebElement getCheckboxS7() {
		return checkboxS7;
	}

	public WebElement getCheckboxM7() {
		return checkboxM7;
	}

	public WebElement getCheckboxL7() {
		return checkboxL7;
	}

	public WebElement getCheckboxCotton() {
		return checkboxCotton;
	}

	public WebElement getCheckboxPolyester() {
		return checkboxPolyester;
	}

	public WebElement getCheckboxviscose() {
		return checkboxviscose;
	}

	public WebElement getCheckboxCasual() {
		return checkboxCasual;
	}

	public WebElement getCheckboxDressy() {
		return checkboxDressy;
	}

	public WebElement getCheckboxGirly() {
		return checkboxGirly;
	}

	public WebElement getCheckboxColourfulDress() {
		return checkboxColourfulDress;
	}

	public WebElement getCheckboxMaxiDress() {
		return checkboxMaxiDress;
	}

	public WebElement getCheckboxMidiDress() {
		return checkboxMidiDress;
	}

	public WebElement getCheckboxShortDress() {
		return checkboxShortDress;
	}

	public WebElement getCheckboxShortSleves() {
		return checkboxShortSleves;
	}

	public WebElement getCheckboxInStocks() {
		return checkboxInStocks;
	}

	public WebElement getCheckboxFashionManufacture() {
		return checkboxFashionManufacture;
	}

	public WebElement getCheckboxNew() {
		return checkboxNew;
	}

	public WebElement getInformation1() {
		return Information1;
	}

	public WebElement getDelivery() {
		return Delivery;
	}

	public WebElement getLegalNotice() {
		return LegalNotice;
	}

	public WebElement getTermsAndConditions1() {
		return TermsAndConditions1;
	}

	public WebElement getAboutUs1() {
		return AboutUs1;
	}

	public WebElement getSecurePayment() {
		return SecurePayment;
	}

	public WebElement getOurStores2() {
		return OurStores2;
	}

	public WebElement getSpecials1() {
		return Specials1;
	}

	public WebElement getPrintedChiffonDress() {
		return PrintedChiffonDress;
	}

	public WebElement getAllSpecials() {
		return AllSpecials;
	}

	public WebElement getOurStores() {
		return OurStores;
	}

	public WebElement getImg() {
		return Img;
	}

	public WebElement getDiscoverOurStore() {
		return DiscoverOurStore;
	}

	public WebElement getViewProducts() {
		return ViewProducts;
	}

	public WebElement getFadedShortSleeve() {
		return FadedShortSleeve;
	}

	public WebElement getCenterColumn() {
		return CenterColumn;
	}

	public WebElement getFadedShortSleevesTshirt() {
		return FadedShortSleevesTshirt;
	}

	public WebElement getFadedShortSleevesTshirtAddToCart() {
		return FadedShortSleevesTshirtAddToCart;
	}

	public WebElement getFadedShortSleevesTshirtMore() {
		return FadedShortSleevesTshirtMore;
	}

	public WebElement getFadedShortSleevesTshirtWishList() {
		return FadedShortSleevesTshirtWishList;
	}

	public WebElement getAdd_to_compare1() {
		return add_to_compare1;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
