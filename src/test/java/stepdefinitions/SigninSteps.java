package stepdefinitions;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SigninSteps {
	
	//Logger log = Logger.getLogger(SigninSteps.class);
	WebDriver driver;
	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
		//log.debug("test1 execution");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}  

	@Given("username and password are entered")
	public void username_and_password_are_entered() {
	
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("5199828385");
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ffff");
	    
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}

	@Then("user should see home page")
	public void user_should_see_home_page() {
		driver.quit();
		System.out.println("Close");
	}
}
