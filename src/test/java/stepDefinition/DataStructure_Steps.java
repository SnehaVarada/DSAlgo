package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.DataStructure_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructure_Steps {
	
	WebDriver driver =Launch_Browser.launch_browser();
	DataStructure_Page dsp = new DataStructure_Page(driver);
	
	@Given("User is on  data structure module")
	public void user_is_on_data_structure_module() {
		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));  
	}

	@When("User clicks data structure {string} button")
	public void user_clicks_data_structure_button(String string) {
	   dsp.DSstart();
	}

	@Then("User launches data structure page")
	public void user_launches_data_structure_page() {
		String expected=Launch_Browser.driver.getTitle();
		  System.out.println(expected);
		  Assert.assertEquals(expected, "Data Structures-Introduction"); 
	  
	}
}
