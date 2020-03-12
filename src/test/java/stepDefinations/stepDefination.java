package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;

import com.globaltech.bdd.Oliveboard;
@RunWith(Cucumber.class)
public class stepDefination extends Oliveboard{

    @Given("^I am on the homepage of the Oliveboard$")
    public void i_am_on_the_homepage_of_the_oliveboard_portal() throws Exception {  	
    	homepage();
    	maximizeWindow();
    }

    @Given("^I am on the loginpage of the Oliveboard$")
    public void i_am_on_the_loginpage_of_the_oliveboard_portal() {
    	Assert.assertTrue(loginButton().isDisplayed());
    }

    @When("^I enter required information and login as CP user$")
    public void i_enter_required_information_and_login_as_cp_member_user() throws Exception, Exception {
       emailBox().sendKeys(detail());
       passwordBox().sendKeys(password());
       loginButton().click();
       
    }
    
    @When("^I enter username and password and click login as CP user$")
    public void i_enter_username_password_and_login_as_cp_member_user() throws Exception, Exception {
       emailBox().sendKeys(detail());
       passwordBox().sendKeys(password());
       loginButton().click();
       
    }

    @Then("^I enter user homepage$")
    public void i_enter_user_homepage() throws Exception {
    //	closeNotificationWindow();
    	Thread.sleep(2000);
    	Assert.assertTrue("matched",profileName().contains("Anuj"));
 /*   	if(profileName().trim()=="Anuj")
   		Assert.assertTrue(true);
    		else
    			Assert.assertFalse(false); */ 	
   //    Assert.assertTrue(profileName().trim()=="Anuj");
    }

}