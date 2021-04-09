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

public class Activate extends WebAPI {

    static homepage.Activate boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.Activate.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }

    @When("I click on activate")
    public void i_click_on_activate() {
       boostMobileMethod.checkActivate();
    }
    @Then("activate a device is displayed")
    public void activate_a_device_is_displayed() {
       boostMobileMethod.checkActivateADevice();
    }



}
