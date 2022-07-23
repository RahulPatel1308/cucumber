package stepdefination;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shoppingcart {

	WebDriver driver;
	Actions action;
	@Given("User be on homepage of {string}")
	public void user_be_on_homepage_of(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
	}

	@Given("User clcik on sign in button pass valid username password and login")
	public void user_clcik_on_sign_in_button_pass_valid_username_password_and_login() throws InterruptedException {
		Actions action= new Actions (driver);
		   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		   Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
		    driver.findElement(By.xpath(" //input[@id='continue']")).click();
		    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
		    driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
		    Thread.sleep(3000);
	}

	@When("User in their account select any product and add to cart")
	public void user_in_their_account_select_any_product_and_add_to_cart() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("airpod pro case");
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("Compatible AirPods Pro Case Cover Silicone Protective Case Skin for Apple Airpod Pro 2019 (Front LED Visible) Black")).click();
		 driver.findElement(By.id("add-to-cart-button")).click();
		 driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).click();
		 Thread.sleep(2000);
	
	}

	@Then("Item must be in cart with correct name image and price")
	public void item_must_be_in_cart_with_correct_name_image_and_price() {
		action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"))).build().perform();
		driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).click();
		driver.quit();
		
		
		
	    
	}
}
