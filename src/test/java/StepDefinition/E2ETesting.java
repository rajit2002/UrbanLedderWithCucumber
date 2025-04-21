package StepDefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E2ETesting {

	WebDriver driver;
	
	@Given("I open the Urban Ladder website")
	public void i_open_the_urban_ladder_website() {
	   
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.urbanladder.com/");
	   
	}

	@Then("I should see the homepage displayed correctly")
	public void i_should_see_the_homepage_displayed_correctly() {
	   
		boolean isLogoVisible = driver.findElement(By.xpath("//figure[@class='header__topBar_logo']")).isDisplayed();
	    Assert.assertTrue(isLogoVisible, "Homepage logo is not displayed.");
	
		
	}

	@When("I enter {string} in the search bar and submit")
	public void i_enter_in_the_search_bar_and_submit(String string) throws InterruptedException {
	   WebElement searchproduct = driver.findElement(By.xpath("//input[@id='search']"));
	   searchproduct.sendKeys("Sofa");
	   WebElement searchbtn = driver.findElement(By.xpath("//span[@class='search-icon icofont-search']"));
		searchbtn.click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	}

	@Then("I should see search results related to {string}")
	public void i_should_see_search_results_related_to(String string) throws InterruptedException {
	   Thread.sleep(2000);
	   
	   boolean productitem = driver.findElement(By.xpath("//img[@title='Weston Half Leather Sofa (Licorice Italian Leather)']")).isDisplayed();
	    Assert.assertTrue(productitem, "Productitem is not displayed.");

		
	}

	@When("I apply a filter on the search results")
	public void i_apply_a_filter_on_the_search_results() {
	   
		driver.findElement(By.xpath("//li[@data-group='category']")).click();
		driver.findElement(By.xpath("//input[@id='filters_primary_category_Sofa_cum_Bed']")).click();
		
		driver.findElement(By.xpath("//div[@id='search-results']")).click();
		
		
	}

	@Then("I should see filtered results updated accordingly")
	public void i_should_see_filtered_results_updated_accordingly() {
		
		
		System.out.println("updated successfully");
	    


		
	}

	@When("I click on a product from the filtered results")
	public void i_click_on_a_product_from_the_filtered_results() throws InterruptedException {
		
		
		
		driver.findElement(By.xpath("//img[@title='Sofa Furniture Mabel 3 Seater Fold Out Sofa cum Bed In Grey Colour']")).click();
		
		  Set<String> windowIDs = driver.getWindowHandles();
		
		
		 List<String> windowList = new ArrayList<>(windowIDs);
	        
	      //  String parentID = windowList.get(0);
	        String childID = windowList.get(1);
	        
	        // Switch to child window
	        driver.switchTo().window(childID);
	        System.out.println("Child window title: " + driver.getTitle());
	        
	     
	        
	   
	   
	}

	@When("I add the product to the cart")
	public void i_add_the_product_to_the_cart() {
	driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
		
		
	}

	@Then("the product should be added successfully to the cart")
	public void the_product_should_be_added_successfully_to_the_cart() {
	    System.out.println("the product should be add successfully ");
		
		
		
	}

	@When("I navigate to the cart")
	public void i_navigate_to_the_cart() {
	  
		System.out.println("checkout page  displaying");
		
		
	}

	@When("I click on the checkout button")
	public void i_click_on_the_checkout_button() {
	   
		driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']//button[@id='checkout-link']")).click();
		
		
	}

	@When("I enter  shipping details")
	public void i_enter_shipping_details() {
	  
		driver.findElement(By.xpath("//input[@id='order_email']")).sendKeys("rajitgautam2002@gmail.com");
		driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_zipcode']")).sendKeys("530068");
		driver.findElement(By.xpath("//textarea[@id='order_ship_address_attributes_address1']")).sendKeys(" hsr asha tifin near by masai school");
		
		driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_firstname']")).sendKeys("Rajit");
		driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_phone']")).sendKeys("8756986473");
		
		
		driver.findElement(By.xpath("//input[@id='address-form-submit']")).click();

		
	}

	@Then("I should be navigated to the payment page")
	public void i_should_be_navigated_to_the_payment_page() {
	   
		
		
		
		
	}



	
}