package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class AboutOurQualityDoctors extends WebAPI {


    static homepage.AboutOurQualityDoctors presbyterianStepDefinition;


    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        presbyterianStepDefinition = PageFactory.initElements(driver, homepage.AboutOurQualityDoctors.class);
    }

    @After
    public void closeBrowser() {

        cleanUp();
    }


    @Then("I click on about our quality doctors")
    public void i_click_on_about_our_quality_doctors() {
       presbyterianStepDefinition.checkAboutOurQualityDoctors();
    }














}
