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

public class PlansAndServices extends WebAPI {

    static homepage.PlansAndServices boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.PlansAndServices.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @When("I click on plans and services")
    public void i_click_on_plans_and_services() {
        boostMobileMethod.checkPlanAndServices();
    }
    @Then("plans and services is displayed")
    public void plans_and_services_is_displayed() {
       boostMobileMethod.checkPlanAndServices1();
    }







}
