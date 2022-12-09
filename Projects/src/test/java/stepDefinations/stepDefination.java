package stepDefinations;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;
 
public class stepDefination extends Base {

















@Given("^initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver = initializeDriver();
}

@Given("^navigate to the \"([^\"]*)\"$")
public void navigate_to_the(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 driver.get(arg1);
}

@Given("^click on login button to land on login page$")
public void click_on_login_button_to_land_on_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	LandingPage l = new LandingPage(driver);
	 l.signin().click();
}


	

@When("^user enter (.+) and (.+) and logs in$")
public void user_enter_and_and_logs_in(String username, String password) throws Throwable {
	LoginPage lp = new LoginPage(driver);
	lp.email().sendKeys(username);
	lp.password().sendKeys(password);
	
	lp.submit().click();
}


@Then("^verify user is loged in$")
public void verify_user_is_loged_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("test is verified");
}
}
