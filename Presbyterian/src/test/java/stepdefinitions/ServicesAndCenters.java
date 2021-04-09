package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ServicesAndCenters extends WebAPI {


    static homepage.ServicesAndCenters presbyterianStepDefinition;


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
        presbyterianStepDefinition = PageFactory.initElements(driver, homepage.ServicesAndCenters.class);
    }

    @After
    public void closeBrowser() {

        cleanUp();
    }


    @Given("I am on www.phs.org")
    public void i_am_on_www_phs_org() throws IOException {
       openBrowser("https://www.phs.org/Pages/default.aspx");
    }
    @When("I click on schedule an urgent care appointment")
    public void i_click_on_schedule_an_urgent_care_appointment() {
       presbyterianStepDefinition.checkScheduleAnUrgentCareAppointment();
    }
    @Then("I click on services and center")
    public void i_click_on_services_and_center() {
       presbyterianStepDefinition.checkServicesAndCenters();
    }





}