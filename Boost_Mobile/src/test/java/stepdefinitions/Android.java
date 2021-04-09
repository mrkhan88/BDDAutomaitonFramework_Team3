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

public class Android extends WebAPI {

    static homepage.Android boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.Android.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @When("I click on android")
    public void i_click_on_android() {

        boostMobileMethod.checkAndroid();
    }

    @Then("phones is displayed3")
    public void phones_is_displayed3() {

        boostMobileMethod.checkPhones3();
    }
















}
