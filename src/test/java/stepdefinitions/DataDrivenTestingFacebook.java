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

public class DataDrivenTestingFacebook {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Given("^(.*) and (.*) are entered by user$")
	public void username_and_password_are_entered_by_user(String username, String password ) {
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys(username);
		
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//*[@name='login']")).click();
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	   System.out.println("Home Page");
	}
}

//Using Data Tables: Data Driven Testing

/*@Given("username and password are entered by user")
public void username_and_password_are_entered_by_user(DataTable table) {
	
	List<List<String>> rows = table.asLists(String.class);
	
	WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
	user.sendKeys(rows.get(0).get(0));
	
	WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
	pass.sendKeys(rows.get(0).get(1));
}*/

//Using Map Data Table: Data Driven Testing

/*@Given("username and password are entered by user")
public void username_and_password_are_entered_by_user(DataTable table) {
	
List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	
	WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
	user.sendKeys(rows.get(0).get("Username"));
	
	WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
	pass.sendKeys(rows.get(0).get("Password"));
}*/

