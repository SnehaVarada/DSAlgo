
  package stepDefinition;
  
  
  
  import java.io.IOException;
  import org.junit.Assert; 
  import org.openqa.selenium.WebDriver;
  import com.pages.Register_Page;
 // import com.qa.factory.DriverFactory; 
  import com.qa.factory.Launch_Browser; 
 // import com.qa.util.ConfigReader;
   import io.cucumber.java.en.Given; 
  import io.cucumber.java.en.Then; 
  import io.cucumber.java.en.When;
  
  public class Register_Step 
  {
  
  WebDriver driver =Launch_Browser.launch_browser();
  Register_Page r=new Register_Page(driver);
  
  @Given("User clicks on register link for invalid login")
  public void user_clicks_on_register_link_for_invalid_login() throws InterruptedException
  {
     r.clickOnReg();
  }

  @When("user enters the invalid {string} {string} and {string}")
  public void user_enters_the_invalid_and(String UserName, String Password, String ConfirmPassword ) {
	  //RegisterPage r=new RegisterPage(DriverFactory.driverSetup());
	  System.out.println(Password); System.out.println(ConfirmPassword);
	   r.sendValues(UserName, Password, ConfirmPassword); 
  }

  @When("User clicks on register button for invalid login")
  public void user_clicks_on_register_button_for_invalid_login() throws InterruptedException 
  {
	  Thread.sleep(2000);
	   r.regButton();
  }

  @Then("Error message is displayed")
  public void error_message_is_displayed() 
  {
	  r.alertmsg();
      }
 
  @Given("user clicks on Register link") 
    public void user_clicks_cn_register_link() throws IOException, InterruptedException 
  {
	  r.clickOnReg();
  }
  
  @When("user enters the valid {string} {string} and {string}") public void
  user_enters_the_valid_and(String UserName, String Password, String
  ConfirmPassword ) throws IOException 
  {
  //RegisterPage r=new RegisterPage(DriverFactory.driverSetup());
  System.out.println(Password); System.out.println(ConfirmPassword);
  r.sendValues(UserName, Password, ConfirmPassword); 
  }
  
  @When("user clicks on Register button") 
  public void user_clicks_on_register_button() throws InterruptedException 
  {
  Thread.sleep(2000);
  r.regButton();
  }
  
  @Then("user navigated to NumpyNinja Home page")
  public void user_navigated_to_numpy_ninja_home_page() 
  {
  String expected=Launch_Browser.driver.getTitle();
  System.out.println(expected);
  Assert.assertEquals(expected, "NumpyNinja"); 
  }
  
 }
 