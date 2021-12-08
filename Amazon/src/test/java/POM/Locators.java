package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.BaseClass;

public class Locators extends BaseClass{
	public Locators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search_bar;
	@FindBy(id="p_72/419154031")
	private WebElement threeStar_rating;
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	private WebElement featured_icon;
	@FindBy(xpath="//li[@class='a-dropdown-item'][2]")
	private WebElement price_low;
	@FindBy(xpath="//span[@class='a-price'][1]")
	private WebElement price_low_product;
	@FindBy(id="add-to-cart-button")
	private WebElement addBasket_btn;
	@FindBy(id="attach-accessory-cart-subtotal")
	private WebElement product_price;
	@FindBy(xpath="(//span[@id='attach-sidesheet-checkout-button'])[1]")
	private WebElement Proceed_btn;
	@FindBy(xpath="//h1[@class='a-spacing-small']")
	private WebElement signIn_page;
	@FindBy(id="sp-cc-accept")
	private WebElement cookies;
	
	public WebElement getsearch_bar() {
		return search_bar;
	}
	public WebElement getThreeStar_Rating() {
		return threeStar_rating;
	}
	public WebElement getFeatured_icon() {
		return featured_icon;
	}
	public WebElement getPriceLow() {
		return price_low;
	}
	public WebElement getPriceLowProduct() {
		return price_low_product;
	}
	public WebElement getAddBasket() {
		return addBasket_btn;
	}
	public WebElement getProductPrice() {
		return product_price;
	}
	public WebElement getProceed() {
		return Proceed_btn;
	}
	public WebElement getSignIn_Page() {
		return signIn_page;
	}
	public WebElement getCookies() {
		return cookies;
	}
}
