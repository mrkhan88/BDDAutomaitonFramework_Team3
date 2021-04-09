package stepdefinitions;

import common.WebAPI;
import homepage.BoostMobileMethod;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class Iphone extends WebAPI {

    static homepage.Iphone boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.Iphone.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @When("I click on iphone")
    public void i_click_on_iphone() {
       boostMobileMethod.checkIphone();
    }

    @Then("phones is displayed2")
    public void phones_is_displayed2() {

        boostMobileMethod.checkPhones2();
    }





}
