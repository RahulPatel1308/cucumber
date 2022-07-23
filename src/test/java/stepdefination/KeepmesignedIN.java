package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class KeepmesignedIN {
	
	WebDriver driver;
	Actions action;
	@Given("user must be on homepage url {string}")
	public void user_must_be_on_homepage_url(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   Thread.sleep(5000);
		  
	}
	@Given("User Must click on signin button")
	public void user_must_click_on_signin_button() {
		 Actions action= new Actions (driver);
		   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		   
	}
	@When("User must pass valid username password")
	public void user_must_pass_valid_username_password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
	    driver.findElement(By.xpath(" //input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
	    Thread.sleep(4000);
	}

	@Then("select Keep me signed in checkbox")
	public void select_keep_me_signed_in_checkbox() {
	   driver.findElement(By.name("rememberMe")).click();
	   driver.quit();
	  
	}}