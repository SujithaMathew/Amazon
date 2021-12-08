package StepDefinition;

import org.openqa.selenium.Keys;

import POM.Locators;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public String productPrice;
	Locators product_Element=new Locators();
	@Given("User has to navigate Amazon page")
	public void user_has_to_navigate_Amazon_page() {
		try {
		implicit();
		explicit(product_Element.getsearch_bar());
		System.out.println("The browser has launched successfully");
		if(product_Element.getCookies().isDisplayed()) {
			click(product_Element.getCookies());
		}
		}
		catch(Exception e) {}
	}

	@When("Search for the product {string}")
	public void search_for_the_product(String string) {
		try {
		 click(product_Element.getsearch_bar());
		 type(product_Element.getsearch_bar(),string);
		 product_Element.getsearch_bar().sendKeys(Keys.ENTER);
		 implicit();
		}
		catch(Exception e) {}
	}

	@When("Select the three star rating")
	public void select_the_three_star_rating() {
		try {
		explicit(product_Element.getThreeStar_Rating());
		click(product_Element.getThreeStar_Rating());
		}
		catch(Exception e) {}
	}

	@When("Select the lowest price for the product")
	public void select_the_lowest_price_for_the_product() throws InterruptedException {
		try {
		explicit(product_Element.getFeatured_icon());
		Thread.sleep(1000);
		click(product_Element.getFeatured_icon());
		click(product_Element.getPriceLow());
		click(product_Element.getPriceLowProduct());
		productPrice = product_Element.getPriceLowProduct().getText();
		}
		catch(Exception e) {}
	}

	@When("User has to add the product to trolly")
	public void user_has_to_add_the_product_to_trolly() {
		try {
		explicit(product_Element.getAddBasket());
		click(product_Element.getAddBasket());
		}
		catch(Exception e) {}
	}

	@When("To verify the product price")
	public void to_verify_the_product_price() {
		try {
		explicit(product_Element.getProductPrice());
		String itemPrice = product_Element.getProductPrice().getText();
		if(itemPrice.contains(productPrice)) {
			System.out.println("Product price is matched-->"+itemPrice);
		}else {
			System.out.println("Product price is not matched-->"+itemPrice);
		}
		}
	catch(Exception e) {}
	}

	@When("Proceed to checkout the product")
	public void proceed_to_checkout_the_product() {
		try {
			Thread.sleep(1000);
			click(product_Element.getProceed());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("To verify user navigated to signin page")
	public void to_verify_user_navigated_to_signin_page() {
		try {
		explicit(product_Element.getSignIn_Page());
		String signIn = product_Element.getSignIn_Page().getText();
		if(signIn.contains("Sign-In")) {
			System.out.println("User is navigated into Sign In page");
		}else {
			System.out.println("User is not navigated into Sign In page");
		}
		}
		catch(Exception e) {}
	}


}
