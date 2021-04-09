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

public class RetailerOpportunities extends WebAPI {

    static homepage.RetailerOpportunities boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.RetailerOpportunities.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @When("I click on retailer opportunities")
    public void i_click_on_retailer_opportunities() {
       boostMobileMethod.checkRetailerOpportunities();
    }
    @Then("retailer opportunities is displayed")
    public void retailer_opportunities_is_displayed() {
       boostMobileMethod.checkRetailerOpportunities1();
    }















}
