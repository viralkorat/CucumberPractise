package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingOpenHRM {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given("^(.*) and (.*) are entered by user$")
	public void username_and_password_are_entered_by_user(String username, String password ) {
		WebElement user = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		System.out.println(user);
		user.sendKeys(username);
		WebElement pass =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]"));
		System.out.println(pass);
		user.sendKeys(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	   System.out.println("Home Page");
	}
}
