package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Simple_HomePage  {
	
    
	WebDriver driver;
	
	public Simple_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
       
     //ContainerColumn;
       
       
       @FindBy(xpath="//div[@class='columns-container']")
       private WebElement ContainerCol;
       
       
       public WebElement getContainerCol() {
		return ContainerCol;
	}

	public WebElement getSaleImg() {
		return saleImg;
	}

	public WebElement getSummerImg() {
		return summerImg;
	}

	public WebElement getTrendsImg() {
		return TrendsImg;
	}

	public WebElement getMensImg() {
		return MensImg;
	}

	public WebElement getWomenImg() {
		return WomenImg;
	}

	public WebElement getSunglassesImg() {
		return SunglassesImg;
	}

	public WebElement getHandBagsImg() {
		return HandBagsImg;
	}

	public WebElement getCallus() {
		return callus;
	}

	public WebElement getPopular() {
		return Popular;
	}

	public WebElement getDress1() {
		return Dress1;
	}

	public WebElement getDress2() {
		return Dress2;
	}

	public WebElement getDress3() {
		return Dress3;
	}

	public WebElement getDress4() {
		return Dress4;
	}

	public WebElement getDress5() {
		return Dress5;
	}

	public WebElement getDress6() {
		return Dress6;
	}

	public WebElement getDress7() {
		return Dress7;
	}

	public WebElement getBestSeller() {
		return BestSeller;
	}

	public WebElement getDress8() {
		return Dress8;
	}

	public WebElement getDress9() {
		return Dress9;
	}

	public WebElement getDress10() {
		return Dress10;
	}

	public WebElement getDress11() {
		return Dress11;
	}

	public WebElement getDress12() {
		return Dress12;
	}

	public WebElement getDress13() {
		return Dress13;
	}

	public WebElement getDress14() {
		return Dress14;
	}

	public WebElement getShopSlide1() {
		return ShopSlide1;
	}

	public WebElement getShopSlide2() {
		return ShopSlide2;
	}

	public WebElement getShopSlide3() {
		return ShopSlide3;
	}

	public WebElement getShopSlide4() {
		return ShopSlide4;
	}

	public WebElement getFacebookBlock() {
		return FacebookBlock;
	}

	public WebElement getComeVisitUs() {
		return ComeVisitUs;
	}

	public WebElement getSeleniumFramework() {
		return SeleniumFramework;
	}

	public WebElement getAPW() {
		return APW;
	}


	@FindBy(xpath="(//img[@class='item-img'])[1]")
	   private WebElement saleImg;
	   
	   
	   @FindBy(xpath="(//img[@class='item-img'])[2]")
	   private WebElement summerImg;
	   
	   
	   @FindBy(xpath="(//img[@class='item-img'])[3]")
	   private WebElement TrendsImg;
	   
	   @FindBy(xpath="(//img[@class='item-img'])[4]")
	   private WebElement MensImg;
	   
	   @FindBy(xpath="(//img[@class='item-img'])[5]")
	   private WebElement WomenImg;
	   
	   @FindBy(xpath="(//img[@class='item-img'])[6]")
	   private WebElement SunglassesImg;
	   
	   @FindBy(xpath="(//img[@class='item-img'])[7]")
	   private WebElement HandBagsImg;
	
	   @FindBy(xpath="//span[@class='shop-phone']")
	   private WebElement callus;
	   
	   @FindBy(xpath="//a[@class='homefeatured']")
	   private WebElement Popular;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[1]")
	   private WebElement Dress1;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[2]")
	   private WebElement Dress2;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[3]")
	   private WebElement Dress3;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[4]")
	   private WebElement Dress4;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[5]")
	   private WebElement Dress5;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[6]")
	   private WebElement Dress6;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[7]")
	   private WebElement Dress7;
	   
	   
	   @FindBy(xpath ="//a[@class='blockbestsellers']")
	   private WebElement BestSeller;
	   
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[8]")
	   private WebElement Dress8;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[9]")
	   private WebElement Dress9;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[10]")
	   private WebElement Dress10;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[11]")
	   private WebElement Dress11;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[12]")
	   private WebElement Dress12;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[13]")
	   private WebElement Dress13;
	   
	   @FindBy(xpath = "(//div[@class='product-container'])[14]")
	   private WebElement Dress14;
	   
       
       @FindBy(xpath="(//div[@class='homeslider-description'])[2]")
       private WebElement ShopSlide1;
       
     
       @FindBy(xpath="(//div[@class='homeslider-description'])[3]")
       private WebElement ShopSlide2;
       
       @FindBy(xpath="(//div[@class='homeslider-description'])[4]")
       private WebElement ShopSlide3;
       
       @FindBy(xpath="(//div[@class='homeslider-description'])[5]")
       private WebElement ShopSlide4;
       
       
       @FindBy(xpath="//div[@id='facebook_block']")
       private WebElement FacebookBlock;
       
       @FindBy(xpath="//em[@id='icon-truck']")
       private WebElement ComeVisitUs;
       
       
       @FindBy(xpath="//a[@class='btn btn-default']")
       private WebElement SeleniumFramework;
       
       @FindBy(xpath="//div[@class='editorial_block']")
       private WebElement APW;
       
     
       
       
    
       
       
       
       
   
	}


