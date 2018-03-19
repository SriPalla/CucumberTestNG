package stepdefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import runner.CucumberRunner;

public class Clearpage extends CucumberRunner {
	

	@Then("^I clear search textbox$")
	public void Clear() throws Throwable {

		driver.findElement(By.cssSelector("input[name='q']")).clear();

	}

}
