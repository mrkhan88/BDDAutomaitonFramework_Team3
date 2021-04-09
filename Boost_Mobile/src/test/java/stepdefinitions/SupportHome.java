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

public class SupportHome extends WebAPI {

    static homepage.SupportHome boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.SupportHome.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }

    @When("I click on support home")
    public void i_click_on_support_home() {
       boostMobileMethod.checkSupportHome();
    }
    @Then("faqs is displayed")
    public void faqs_is_displayed() {
        boostMobileMethod.checkFaqs();
    }





}
