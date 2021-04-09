package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class ManageAccount extends WebAPI {

    static homepage.ManageAccount boostMobileMethod;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){

        boostMobileMethod= PageFactory.initElements(driver, homepage.ManageAccount.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @When("I click on manage account")
    public void i_click_on_manage_account() {
       boostMobileMethod.checkManageAccount();
    }
    @Then("sign in to my boost is displayed")
    public void sign_in_to_my_boost_is_displayed() {
       boostMobileMethod.checkSignInToMyBoost();
    }







}
