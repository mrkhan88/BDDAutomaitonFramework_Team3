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


public class CoveringYourCareAndFinancialAssistance extends WebAPI {

    static homepage.CoveringYourCareAndFinancialAssistance presbyterianStepDefinition;


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
        presbyterianStepDefinition = PageFactory.initElements(driver, homepage.CoveringYourCareAndFinancialAssistance.class);
    }

    @After
    public void closeBrowser() {

        cleanUp();
    }


    @Then("I click on covering your care and financial assistance")
    public void i_click_on_covering_your_care_and_financial_assistance() {
       presbyterianStepDefinition.checkCoveringYourCareAndFinancialAssistance();
    }






}
