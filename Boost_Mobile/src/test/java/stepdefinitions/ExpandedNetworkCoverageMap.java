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

public class ExpandedNetworkCoverageMap extends WebAPI {

    static homepage.ExpandedNetworkCoverageMap boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.ExpandedNetworkCoverageMap.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }

    @When("I click on expanded network coverage map")
    public void i_click_on_expanded_network_coverage_map() {
      boostMobileMethod.checkExpandedNetworkCoverageMap();
    }
    @Then("expanded network coverage map is displayed")
    public void expanded_network_coverage_map_is_displayed() {
        boostMobileMethod.checkExpandedNetworkCoverageMap1();
    }




}
