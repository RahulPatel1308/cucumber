package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Yourordermodule {
	
	WebDriver driver;
	
	@Given("User must be on homepage url {string}")
	public void user_must_be_on_homepage_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
	}

	@Given("User must click on sign in button")
	public void user_must_click_on_sign_in_button() throws InterruptedException {
		 Actions action= new Actions (driver);
		   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		   Thread.sleep(3000);
	}

	@Given("User must pass valid username password and log in to their account")
	public void user_must_pass_valid_username_password_and_log_in_to_their_account() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
	    driver.findElement(By.xpath(" //input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
	    driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
	    Thread.sleep(3000);
	}

	@When("User in to their account select your orders from the list")
	public void user_in_to_their_account_select_your_orders_from_the_list() throws InterruptedException {
		    Actions action =new Actions(driver);
		    action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		    driver.findElement(By.partialLinkText("Your Orders")).click();
		    Thread.sleep(3000);
	}

	@Then("User can see their order history")
	public void user_can_see_their_order_history() {
		boolean actual =driver.findElement(By.className("a-color-state")).isEnabled();
		Assert.assertEquals(true, actual);
	   
	}

	@Then("User can see option like buy again ,not yet shipped and cancelled order")
	public void user_can_see_option_like_buy_again_not_yet_shipped_and_cancelled_order() throws InterruptedException{
	   Thread.sleep(4000);
	   driver.findElement(By.partialLinkText("Buy Again")).click();
	    driver.quit();
}}
