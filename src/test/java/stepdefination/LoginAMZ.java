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


public class LoginAMZ {
	
	WebDriver driver;
	@Given("User must be on homepage by clickig on URL {string}")
	public void user_must_be_on_homepage_by_clickig_on_url(String string) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(string);
	   driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
	}
	
	@When("User can click on signin button")
	public void user_can_click_on_signin_button() {
	   Actions action= new Actions (driver);
	   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
	}

	@Then("user must pass valid username and click on continue")
	public void user_must_pass_valid_username_and_click_on_continue() throws InterruptedException{
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
	    driver.findElement(By.xpath(" //input[@id='continue']")).click();
	}

	@Then("user must pass valid password and clcikc on sign in button to login into their account")
	public void user_must_pass_valid_password_and_clcikc_on_sign_in_button_to_login_into_their_account() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
	}

	@Then("user name must display with hello <username> account list")
	public void user_name_must_display_with_hello_username_account_list() {
	 boolean actual= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).isDisplayed();
	 Assert.assertEquals(true, actual);
	}

	@Then("user can select my accont from list")
	public void user_can_select_my_accont_from_list() {
	    Actions action =new Actions(driver);
	    action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	    driver.findElement(By.partialLinkText("Your Account")).click();
	    driver.quit();
	    
		
	}



}
