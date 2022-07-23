package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Productinformation {

	WebDriver driver;
	@Given("User be on homepage of url {string}")
	public void user_be_on_homepage_of_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   
	}

	@Given("user click on sign in")
	public void user_click_on_sign_in() throws InterruptedException {
		Actions action= new Actions (driver);
		   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		   Thread.sleep(5000);
	}

	@Given("user pass valid username and password to log in")
	public void user_pass_valid_username_and_password_to_log_in() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
	    driver.findElement(By.xpath(" //input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
	    driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
	    Thread.sleep(3000);
	}


      @When("User in their account pass iphone and click on search button")
      public void user_in_their_account_pass_iphone_and_click_on_search_button() throws InterruptedException {
    	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
    	  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    	  Thread.sleep(5000);
    

	}

	@Then("Select first product from the page")
	public void select_first_product_from_the_page() {
		driver.findElement(By.partialLinkText("Apple iPhone XR, 64GB, Black - Fully Unlocked (Renewed)")).click();
	}

	@Then("Selected product must show price")
	public void selected_product_must_show_price() {
	    boolean price =driver.findElement(By.partialLinkText("$349.99")).isEnabled();
	    System.out.println("price");
	    
	}

	@Then("Selected product must show customer review and ratings")
	public void selected_product_must_show_customer_review_and_ratings() {
	   boolean review =driver.findElement(By.id("acrCustomerReviewText")).isDisplayed();
	   
	}

}
