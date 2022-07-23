package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchfacility {
	
	WebDriver driver;
	@Given("User should be on homepage url {string}")
	public void user_should_be_on_homepage_url(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15145\\eclipse-workspace\\Global\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   Thread.sleep(5000);      
	}	   

	@Given("User should click on sign in button")
	public void user_should_click_on_sign_in_button() {
		 Actions action= new Actions (driver);
		   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		   driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
	    
	}

	@Given("User should pass valid username password and log in to their account")
	public void user_should_pass_valid_username_password_and_log_in_to_their_account() {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("5145821994");
	    driver.findElement(By.xpath(" //input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rahul@130894");
	    driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
	}
	
	@When("User in their account search for tshirt in search bar ,user should get tshirt for men ,women and all related suggestion")
	public void user_in_their_account_search_for_tshirt_in_search_bar_user_should_get_tshirt_for_men_women_and_all_related_suggestion() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("tshirt");
	    Thread.sleep(10000);
	}

	
	@Then("User select tshirt for men and click on search bar")
	public void user_select_tshirt_for_men_and_click_on_search_bar() {
	    driver.findElement(By.className("s-heavy")).click();
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    driver.close();
	    
	}


}
