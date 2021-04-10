package stepdefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {

    static HomePage homepage;



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
        homepage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on Wayfair homepage")
    public void iAmOnWayfairHomepage() throws IOException {
        openBrowser("https://www.wayfair.com/");
    }


    @And("I click on {string} JM")
    public void iClickOnJM(String arg0) {
        homepage.clickOnJossAndMain();

    }

    @Then("I verify {string} JM")
    public void iVerifyJM(String arg0) {
        String expectedText = "Joss & Main | Style is what you make it. Make it yours.";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }


    @And("I click on {string} AM")
    public void iClickOnAM(String arg0) {
        homepage.clickOnAllModern();
    }

    @Then("I verify {string} AM")
    public void iVerifyAM(String arg0) {
        String expectedText = "Modern Furniture and Decor for your Home and Office";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("clicking the back button should take me back to the homepage")
    public void clickingTheBackButtonShouldTakeMeBackToTheHomepage() {
        driver.navigate().back();
        homepage.checkHomePage();
    }


    @And("I click on {string} BL")
    public void iClickOnBL(String arg0) {
        homepage.clickOnBirchLane();
        }


    @Then("I verify {string}  BL")
    public void iVerifyBL(String arg0) {
        String expectedText = "Birch Lane: Farmhouse & Traditional Furniture - Made to Last";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }


}

