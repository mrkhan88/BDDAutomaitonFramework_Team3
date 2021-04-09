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

public class OnlineDeals extends WebAPI {

    static homepage.OnlineDeals boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.OnlineDeals.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }


    @When("I click on online deals")
    public void i_click_on_online_deals() {
       boostMobileMethod.checkOnlineDeals();
    }
    @Then("online deals is displayed")
    public void online_deals_is_displayed() {
       boostMobileMethod.checkOnlineDeals2();
    }












}
