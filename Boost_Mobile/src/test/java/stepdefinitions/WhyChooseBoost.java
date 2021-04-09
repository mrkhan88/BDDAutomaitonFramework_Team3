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

public class WhyChooseBoost extends WebAPI {

    static homepage.WhyChooseBoost boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.WhyChooseBoost.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }

    @When("I click on why choose boost")
    public void i_click_on_why_choose_boost() {
       boostMobileMethod.checkWhyChooseBoost();
    }
    @Then("why choose boost is displayed")
    public void why_choose_boost_is_displayed() {
       boostMobileMethod.checkWhyChooseBoost1();
    }








}
