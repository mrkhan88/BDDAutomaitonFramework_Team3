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

public class OrderStatus extends WebAPI {

    static homepage.OrderStatus boostMobileMethod;

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

        boostMobileMethod= PageFactory.initElements(driver, homepage.OrderStatus.class);
    }

    @After
    public void closeBrowser(){

        cleanUp();
    }

    @When("I click on order status")
    public void i_click_on_order_status() {
       boostMobileMethod.checkOrderStatus();
    }
    @Then("order status is displayed")
    public void order_status_is_displayed() {
      boostMobileMethod.checkOrderStatus1();
    }



}
