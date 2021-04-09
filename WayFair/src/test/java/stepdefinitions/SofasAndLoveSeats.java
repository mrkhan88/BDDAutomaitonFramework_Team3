package stepdefinitions;

import common.WebAPI;
import homepage.WayfairMethod;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class SofasAndLoveSeats extends WebAPI {

    static homepage.SofasAndLoveSeats wayfairMethod;



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
        wayfairMethod= PageFactory.initElements(driver,homepage.SofasAndLoveSeats.class);
    }

    @After
    public void closeBrowser(){
        wayfairMethod.cleanUp();
    }


    @When("I click on sofas and love seats")
    public void i_click_on_sofas_and_love_seats() {
       wayfairMethod.checkSofasAndLoveSeats();
    }


    @Then("I should see sofas")
    public void i_should_see_sofas() {
        wayfairMethod.checkSofas();
    }





}
