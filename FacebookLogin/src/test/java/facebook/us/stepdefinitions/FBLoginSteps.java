package facebook.us.stepdefinitions;

import org.testng.Assert;

import facebook.us.basepage.FB_BasePage;
import facebook.us.elementspage.FBLoginElements;
import facebook.us.generic.FBCommonUtilities;
import facebook.us.generic.FBWaitHelper;
import io.cucumber.java.en.*;


public class FBLoginSteps extends FB_BasePage{
	FBLoginElements fble;
	
@Given("User able to open a any browser")
public void user_able_to_open_a_any_browser() {
    FB_BasePage.initialization();
     fble= new FBLoginElements();
     //constructor obj is created and can be called invoke implicitly
    
}
@Given("User able to enter {string} url")
public void user_able_to_enter_url(String URL) {
	driver.get(URL);
    
}
@When("User able to enter valid userName & password")
public void user_able_to_enter_valid_user_name_password() {
	
	fble.getUseNameAndPwd(prop.getProperty("userName"), prop.getProperty("pwd"));
    
}
@When("User able to click on login button")
public void user_able_to_click_on_login_button() {
	FBWaitHelper.waitUntilElementToBeClickable(fble.getLoginButton());//used FBWaitHelper class
	FBCommonUtilities.getActionClick(fble.getLoginButton());//used FBCommonUtilities class
	    
}
@Then("User can verify the user information {string} on the grid")
public void user_can_verify_the_user_information_on_the_grid(String text) {
    Assert.assertEquals(text, fble.getVerifyText().getText());
	System.out.println("Actual and expected is matched");
}

}
