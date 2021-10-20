package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Women {

	
	
	
   
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
	
	@FindBy(xpath="(//a[@class='product-name'])[2]")
	private WebElement FadedShortSleeve;
	  
	@FindBy(xpath="//div[@id='center_column']")
	private WebElement CenterColumn;
	
	
	@FindBy(xpath="(//img[@class='replace-2x'])[1]")
	private WebElement ImgTops;
	
	@FindBy(xpath="(//img[@class='replace-2x'])[2]")
	private WebElement ImgDresses;
	
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
	

	@FindBy(xpath="(//a[@class='product-name'])[4]")
	private WebElement Blouse;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[2]")
	private WebElement BlouseAddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[2]")
	private WebElement BlouseMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_2']")
	private WebElement BlouseWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[2]")
	private WebElement add_to_compare2;
	
	@FindBy(xpath="(//a[@class='product-name'])[5]")
	private WebElement PrintedDress;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[3]")
	private WebElement PrintedDressAddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[3]")
	private WebElement PrintedDressMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_3']")
	private WebElement PrintedDressWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[3]")
	private WebElement add_to_compare3;
	
	@FindBy(xpath="(//a[@class='product-name'])[6]")
	private WebElement PrintedDress2;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[4]")
	private WebElement PrintedDress2AddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[4]")
	private WebElement PrintedDress2More;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_4']")
	private WebElement PrintedDress2WishList;
	
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[4]")
	private WebElement add_to_compare4;
	
	@FindBy(xpath="(//a[@class='product-name'])[7]")
	private WebElement PrintedSummerDress;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[5]")
	private WebElement PrintedSummerDressAddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[5]")
	private WebElement PrintedSummerDressMore;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_5']")
	private WebElement PrintedSummerDressWishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[5]")
	private WebElement add_to_compare5;
	
	@FindBy(xpath="(//a[@class='product-name'])[8]")
	private WebElement  PrintedSummerDress2;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[6]")
	private WebElement PrintedSummerDress2AddToCart;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[6]")
	private WebElement PrintedSummerDress2More;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_6']")
	private WebElement PrintedSummerDress2WishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[6]")
	private WebElement add_to_compare6;
	
	@FindBy(xpath="(//a[@class='product-name'])[9]")
	private WebElement PrintedChiffonDress2;
	
	@FindBy(xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[7]")
	private WebElement PrintedChiffonDress2sAddToCart;
	
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[7]")
	private WebElement PrintedChiffonDress2More;
	
	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_7']")
	private WebElement PrintedChiffonDress2WishList;
	
	@FindBy(xpath="(//a[@class='add_to_compare'])[7]")
	private WebElement add_to_compare7;
	
 
	
	
	
	
	}
