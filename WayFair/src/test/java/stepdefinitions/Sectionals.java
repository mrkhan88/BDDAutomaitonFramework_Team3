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

public class Sectionals extends WebAPI {

    static homepage.Sectionals wayfairMethod;



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
        wayfairMethod= PageFactory.initElements(driver,homepage.Sectionals.class);
    }

    @After
    public void closeBrowser(){
        wayfairMethod.cleanUp();
    }


    @When("I click on sectionals")
    public void i_click_on_sectionals() {
      wayfairMethod.checkSectionals();
    }
    @Then("I should see sectional sofas and couches")
    public void i_should_see_sectional_sofas_and_couches() throws InterruptedException {
      wayfairMethod.checkSectionalSofasAndCouches();
      sleepFor(5);
    }









}
