package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.DataStructure_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructure_Step {
	
	WebDriver driver =Launch_Browser.launch_browser();
	DataStructure_Page dsp = new DataStructure_Page(driver);
	
	@Given("User is on  data structure module")
	public void user_is_on_data_structure_module() {
		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
	}

	@When("User clicks data structure get start button")
	public void user_clicks_data_structure_get_start_button() throws InterruptedException {
		Thread.sleep(2000);
		dsp.DSstart();
	}

	@Then("User launches data structure page")
	public void user_launches_data_structure_page() {
		String dsexpected=Launch_Browser.driver.getTitle();
	    System.out.println(dsexpected);
	    Assert.assertEquals(dsexpected, "Data Structures-Introduction");
	}

	@Given("user enters onto TimeComplexity link")
	public void user_enters_onto_time_complexity_link() {
	   
	}

	@When("user clicks on TimeComplexity")
	public void user_clicks_on_time_complexity() {
		dsp.TimeComplexity();
    }

	@When("user launches on TimeComplexity page")
	public void user_launches_on_time_complexity_page() {
	   
	}

	@Given("user clicks on TryHere button")
	public void user_clicks_on_try_here_button() {
		dsp.DSTryHere(); 
	}

	@Given("user navigated to Tryeditor page to write a Python code")
	public void user_navigated_to_tryeditor_page_to_write_a_python_code() {
		String tryeditorexpected=Launch_Browser.driver.getTitle();
	    System.out.println(tryeditorexpected);
	    Assert.assertEquals(tryeditorexpected, "Assessment");
     }
	@When("user is writing Python code")
	public void user_is_writing_python_code() {
		dsp.TextBox();
	}

	@When("user clicks on Run button")
	public void user_clicks_on_run_button() {
		dsp.Run(); 
	}

	@Then("user can see the Output of Python code")
	public void user_can_see_the_output_of_python_code() {
	    
	}
}
