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

public class NationwideCoverageMap extends WebAPI {

    static homepage.NationwideCoverageMap boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.NationwideCoverageMap.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @When("I click on nationwide coverage map")
    public void i_click_on_nationwide_coverage_map() {
       boostMobileMethod.checkNationwideCoverageMap();
    }
    @Then("Nationwide network coverage map is displayed")
    public void nationwide_network_coverage_map_is_displayed() {
      boostMobileMethod.checkNationwideNetworkCoverageMap();
    }






}
