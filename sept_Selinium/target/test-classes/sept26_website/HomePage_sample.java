package sept26_website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_sample {
	
    
       
     //ContainerColumn;
       
       
       @FindBy(xpath="//div[@class='columns-container']")
       private WebElement ContainerCol;
       
       
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


