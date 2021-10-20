package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WomenPage  {

WebDriver driver;
	
	public WomenPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
   
 // ContainerColumn;
   
   
   @FindBy(xpath="//div[@class='columns-container']")
   private WebElement ContainerCol;
	
	@FindBy(xpath = "//a[@class='home']")
	private WebElement HomeIcon;
	
	
	@FindBy(xpath="//div[@id='left_column']")
	private WebElement LeftColumn;
	
	@FindBy(xpath ="//h2[@class='title_block']")
	private WebElement WOMENLeftColumn;
	
	@FindBy(linkText ="\r\n"
			+ "		Tops\r\n"
			+ "	")
	private WebElement TopsLeftColumn;
	
	@FindBy(linkText = "\r\n"
			+ "		Dresses\r\n"
			+ "	")
	private WebElement DressesLeftColumn;
	
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
	
	@FindBy(xpath="(//a[@class='product-name'])[1]")
	private WebElement PrintedSummerDress1;
	  
	@FindBy(xpath="//div[@id='center_column']")
	private WebElement CenterColumn;
	
	
	@FindBy(xpath="(//img[@class='replace-2x'])[1]")
	private WebElement ImgTops;
	
	@FindBy(xpath="(//img[@class='replace-2x'])[2]")
	private WebElement ImgDresses;
	
	@FindBy(xpath ="//select[@id='selectProductSort']")
	private WebElement selectProductSort;
	
	@FindBy(xpath="(//a[@class='product-name'])[2]")
	private WebElement FadedShortSleevesTshirt;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]")
	private WebElement FadedShortSleevesTshirtAddToCart;
	
	



	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement AddToCart;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement ProceedToCheckout;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement ProceedToCheckout2;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement ProceedToCheckout3;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement ProceedToCheckout4;
	
	
	
	
	@FindBy(xpath="//span[@class='continue btn btn-default button exclusive-medium']")
	private WebElement ContinueShopping;
	
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement TermsAndServiceCheckBox;
	
	@FindBy(xpath="(//p[@class='payment_module'])[1]")
	private WebElement PayByBankWire;
	
	@FindBy(xpath="(//p[@class='payment_module'])[2]")
	private WebElement PayByCheck;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement IconfirmMyOrder;
	
	@FindBy(xpath="(//strong[@class='dark'])[6]")
	private WebElement YourOrderComplete;
	
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[1]")
	private WebElement FadedShortSleevesTshirtMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_1']")
	private WebElement FadedShortSleevesTshirtWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[1]")
	private WebElement add_to_compare1;
	

	@FindBy(xpath="(//a[@class='product-name'])[3]")
	private WebElement Blouse;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[2]")
	private WebElement BlouseAddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[2]")
	private WebElement BlouseMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_2']")
	private WebElement BlouseWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[2]")
	private WebElement add_to_compare2;
	
	@FindBy(xpath="(//a[@class='product-name'])[4]")
	private WebElement PrintedDress;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[3]")
	private WebElement PrintedDressAddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[3]")
	private WebElement PrintedDressMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_3']")
	private WebElement PrintedDressWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[3]")
	private WebElement add_to_compare3;
	
	@FindBy(xpath="(//a[@class='product-name'])[5]")
	private WebElement PrintedDress2;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[4]")
	private WebElement PrintedDress2AddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[4]")
	private WebElement PrintedDress2More;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_4']")
	private WebElement PrintedDress2WishList;
	
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[4]")
	private WebElement add_to_compare4;
	
	@FindBy(xpath="(//a[@class='product-name'])[6]")
	private WebElement PrintedSummerDress;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[5]")
	private WebElement PrintedSummerDressAddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[5]")
	private WebElement PrintedSummerDressMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_5']")
	private WebElement PrintedSummerDressWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[5]")
	private WebElement add_to_compare5;
	
	@FindBy(xpath="(//a[@class='product-name'])[7]")
	private WebElement  PrintedSummerDress2;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[6]")
	private WebElement PrintedSummerDress2AddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[6]")
	private WebElement PrintedSummerDress2More;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_6']")
	private WebElement PrintedSummerDress2WishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[6]")
	private WebElement add_to_compare6;
	
	@FindBy(xpath="(//a[@class='product-name'])[8]")
	private WebElement PrintedChiffonDress2;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[7]")
	private WebElement PrintedChiffonDress2sAddToCart;
	
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[7]")
	private WebElement PrintedChiffonDress2More;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_7']")
	private WebElement PrintedChiffonDress2WishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[7]")
	private WebElement add_to_compare7;

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

	public WebElement getWOMENLeftColumn() {
		return WOMENLeftColumn;
	}

	public WebElement getTopsLeftColumn() {
		return TopsLeftColumn;
	}

	public WebElement getDressesLeftColumn() {
		return DressesLeftColumn;
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
		return PrintedSummerDress1;
	}

	public WebElement getCenterColumn() {
		return CenterColumn;
	}

	public WebElement getImgTops() {
		return ImgTops;
	}

	public WebElement getImgDresses() {
		return ImgDresses;
	}

	public WebElement getFadedShortSleevesTshirt() {
		return FadedShortSleevesTshirt;
	}
	
	public WebElement getAddToCart() {
		return AddToCart;
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

	public WebElement getBlouse() {
		return Blouse;
	}

	public WebElement getBlouseAddToCart() {
		return BlouseAddToCart;
	}

	public WebElement getBlouseMore() {
		return BlouseMore;
	}

	public WebElement getBlouseWishList() {
		return BlouseWishList;
	}

	public WebElement getAdd_to_compare2() {
		return add_to_compare2;
	}

	public WebElement getPrintedDress() {
		return PrintedDress;
	}

	public WebElement getPrintedDressAddToCart() {
		return PrintedDressAddToCart;
	}

	public WebElement getPrintedDressMore() {
		return PrintedDressMore;
	}

	public WebElement getPrintedDressWishList() {
		return PrintedDressWishList;
	}

	public WebElement getAdd_to_compare3() {
		return add_to_compare3;
	}

	public WebElement getPrintedDress2() {
		return PrintedDress2;
	}

	public WebElement getPrintedDress2AddToCart() {
		return PrintedDress2AddToCart;
	}

	public WebElement getPrintedDress2More() {
		return PrintedDress2More;
	}

	public WebElement getPrintedDress2WishList() {
		return PrintedDress2WishList;
	}

	public WebElement getAdd_to_compare4() {
		return add_to_compare4;
	}

	public WebElement getPrintedSummerDress() {
		return PrintedSummerDress;
	}

	public WebElement getPrintedSummerDressAddToCart() {
		return PrintedSummerDressAddToCart;
	}

	public WebElement getPrintedSummerDressMore() {
		return PrintedSummerDressMore;
	}

	public WebElement getPrintedSummerDressWishList() {
		return PrintedSummerDressWishList;
	}

	public WebElement getAdd_to_compare5() {
		return add_to_compare5;
	}

	public WebElement getPrintedSummerDress2() {
		return PrintedSummerDress2;
	}

	public WebElement getPrintedSummerDress2AddToCart() {
		return PrintedSummerDress2AddToCart;
	}

	public WebElement getPrintedSummerDress2More() {
		return PrintedSummerDress2More;
	}

	public WebElement getPrintedSummerDress2WishList() {
		return PrintedSummerDress2WishList;
	}

	public WebElement getAdd_to_compare6() {
		return add_to_compare6;
	}

	public WebElement getPrintedChiffonDress2() {
		return PrintedChiffonDress2;
	}

	public WebElement getPrintedChiffonDress2sAddToCart() {
		return PrintedChiffonDress2sAddToCart;
	}

	public WebElement getPrintedChiffonDress2More() {
		return PrintedChiffonDress2More;
	}

	public WebElement getPrintedChiffonDress2WishList() {
		return PrintedChiffonDress2WishList;
	}

	public WebElement getAdd_to_compare7() {
		return add_to_compare7;
	}

	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}

	public WebElement getContinueShopping() {
		return ContinueShopping;
	}

	public WebElement getTermsAndServiceCheckBox() {
		return TermsAndServiceCheckBox;
	}

	public WebElement getPayByBankWire() {
		return PayByBankWire;
	}

	public WebElement getPayByCheck() {
		return PayByCheck;
	}

	public WebElement getIconfirmMyOrder() {
		return IconfirmMyOrder;
	}

	public WebElement getYourOrderComplete() {
		return YourOrderComplete;
	}

	public WebElement getProceedToCheckout2() {
		return ProceedToCheckout2;
	}

	public WebElement getProceedToCheckout3() {
		return ProceedToCheckout3;
	}

	public WebElement getProceedToCheckout4() {
		return ProceedToCheckout4;
	}
	
 
	
	
	
	
	}
