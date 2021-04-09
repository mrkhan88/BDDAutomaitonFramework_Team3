package stepdefinitions;

import common.WebAPI;
import homepage.BoostMobileMethod;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BoostMobileStepDefinition extends WebAPI {

    static BoostMobileMethod boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, BoostMobileMethod.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @Given("Im at Boost Mobile homepage")
    public void im_at_boost_mobile_homepage() throws IOException {
        openBrowser("https://www.boostmobile.com/");
    }
    @When("I click on all phones")
    public void i_click_on_all_phones() {

        boostMobileMethod.checkAllPhones();
    }
    @Then("phones is displayed")
    public void phones_is_displayed() {

        boostMobileMethod.checkPhones();
    }












}
