package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

//import com.pages.DataStructure_Page;
import com.pages.Stack_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.*;

public class Stack_Step {
	
	WebDriver driver =Launch_Browser.launch_browser();
	Stack_Page sp = new Stack_Page(driver);
	
	@Given("User is on stack module")
	public void user_is_on_stack_module() {
		Launch_Browser.driver.get(ConfigReader.launch_Web("stack_url"));
	   }

	@When("User clicks on stack module's get start button")
	public void user_clicks_on_stack_module_s_get_start_button()
	{
	    sp.StackGetStart();
	}

	@Then("User launches on stack page")
	public void user_launches_on_stack_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		String expected=Launch_Browser.driver.getTitle();
		  System.out.println(expected);
		  Assert.assertEquals(expected, "Stack"); 
	}
	
	@Given("User is on operations in stack")
	public void user_is_on_operations_in_stack() 
	{
	   sp.StackOperation();
	}

	@When("User clicks on operations in stack button")
	public void user_clicks_on_operations_in_stack_button() 
	{
	 
	}

	@Then("User launches on operations in stack page")
	public void user_launches_on_operations_in_stack_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		String expected=Launch_Browser.driver.getTitle();
		  System.out.println(expected);
		  Assert.assertEquals(expected, "Operations in Stack"); 
	}
	
	
	

	
	}



