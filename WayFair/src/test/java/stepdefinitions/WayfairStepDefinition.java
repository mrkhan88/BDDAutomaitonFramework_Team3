package stepdefinitions;

import common.WebAPI;
import homepage.Homepage;
import homepage.WayfairMethod;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class WayfairStepDefinition extends WebAPI {

    static WayfairMethod wayfairMethod;



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
        wayfairMethod= PageFactory.initElements(driver,WayfairMethod.class);
    }

    @After
    public void closeBrowser(){
        wayfairMethod.cleanUp();
    }


    @Given("I am on wayfair.com")
    public void i_am_on_wayfair_com() throws IOException, InterruptedException {
       openBrowser("https://www.wayfair.com/");
       sleepFor(20);
    }

    @Given("I hover over furniture")
    public void i_hover_over_furniture() {

        wayfairMethod.checkLivingRoomFurniture();
    }


    @Then("I should see living room furniture")
    public void i_should_see_living_room_furniture() {

        wayfairMethod.displayedText();
    }










}
