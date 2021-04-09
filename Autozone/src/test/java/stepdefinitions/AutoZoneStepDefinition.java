package stepdefinitions;

import common.WebAPI;
import homepage.AutoZoneMethod;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AutoZoneStepDefinition extends WebAPI {
    static AutoZoneMethod autoZonemethod;

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

        autoZonemethod=PageFactory.initElements(driver, AutoZoneMethod.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }

    @Given("Im at AutoZone homepage")
    public void im_at_auto_zone_homepage() throws IOException {
        openBrowser("https://www.autozone.com/");
    }

    @When("I click on vehicle make")
    public void i_click_on_vehicle_make() {
       autoZonemethod.checkVehicleMake();
    }
    @Then("Shop by make is displayed")
    public void shop_by_make_is_displayed() {
       autoZonemethod.checkShopByMake();
    }


}
