package StepDefinaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberproject {
	
	WebDriver driver;
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://devportal.standontheright.com/");
       
	   
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_and_valid(String uname, String password) throws Throwable {
 
		 driver.findElement(By.id("Email")).sendKeys(uname);
		 driver.findElement(By.id("Password")).sendKeys(password);
	}

	@Then("^user should be able to login Successfully$")
	public void user_should_be_able_to_login_Successfully() throws Throwable {
	 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


}
