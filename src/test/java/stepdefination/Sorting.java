package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sorting {
	
	WebDriver driver;
	
	@Given("User be on homepage url {string}")
	public void user_be_on_homepage_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
	}

	@Given("User click on sign in button")
	public void user_click_on_sign_in_button() throws InterruptedException {
		Actions action= new Actions (driver);
		   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		   Thread.sleep(5000);
	}

	@Given("User pass valid username and password to Sign in")
	public void user_pass_valid_username_and_password_to_sign_in() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
	    driver.findElement(By.xpath(" //input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
	    driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
	    Thread.sleep(3000);
	}

	@When("User in their account type iphone in search bar click on search")
	public void user_in_their_account_type_iphone_in_search_bar_click_on_search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 Thread.sleep(3000);
		 
	}

	@When("Click on sorting feature")
	public void click_on_sorting_feature() throws InterruptedException {
	   driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
	   Thread.sleep(50000);
	}

	@Then("User can select sort product as per their requirment and select price low to high")
	public void user_can_select_sort_product_as_per_their_requirment_and_select_price_low_to_high() {
	    driver.findElement(By.partialLinkText("Price: Low to High")).click();
	}

}
