package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before(order = 0)
	public void beforeScenario() {
		System.out.println("This will run before the Both Scenario");
	}

	@After(order = 0)
	public void afterScenario() {
		System.out.println("This will run after the Both Scenario");
	}

	@Before(value = "@DataDriven", order = 1)
	public void beforeFirst() {
		System.out.println("This will run only before the @DataDriven Scenario");
	}

	@Before("@SmokeTest")
	public void beforeSecond() {
		System.out.println("This will run only before the @SmokeTest Scenario");
	}

	@After(value="@DataDriven", order = 1)
	public void afterFirst() {
		System.out.println("This will run only after the @DataDriven Scenario");
	}

	@After("@SmokeTest")
	public void afterSecond() {
		System.out.println("This will run only after the @SmokeTest Scenario");
	}
}
