package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;

import com.globaltech.bdd.Facebook;
@RunWith(Cucumber.class)
public class stepDefination extends Facebook{

    @Given("^I am on the homepage of the SHRM$")
    public void i_am_on_the_homepage_of_the_shrm_portal() throws Exception {
    	homepage();
    }

    @Given("^I am on the loginpage of the SHRM$")
    public void i_am_on_the_loginpage_of_the_shrm_portal() {
    	Assert.assertTrue(loginButton().isDisplayed());
    }

    @When("^I enter required information and login as CP user$")
    public void i_enter_required_information_and_login_as_cp_member_user() throws IOException {
       emailBox().sendKeys(detail());
       passwordBox().sendKeys(password());
       loginButton().click();
    }

    @Then("^I enter user homepage$")
    public void i_enter_user_homepage() throws Exception {
    	driver.wait(3000);
       Assert.assertTrue(profileLogo().isDisplayed());
    }

}