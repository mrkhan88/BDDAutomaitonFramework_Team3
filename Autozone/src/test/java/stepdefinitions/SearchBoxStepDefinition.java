package stepdefinitions;

import common.WebAPI;
import homepage.Homepage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class SearchBoxStepDefinition extends WebAPI {
    static Homepage homepage;




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
        homepage= PageFactory.initElements(driver,Homepage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am at Autozone homepage")
    public void i_am_at_autozone_homepage() throws IOException {
        openBrowser("https://www.autozone.com/");
    }

    @And("I type valid product name in SearchBox")
    public void i_type_valid_product_name_in_search_box() throws InterruptedException {
        homepage.typeInSearchbox();
    }

    @When("I press Enter button on keyboard")
    public void i_press_enter_button_on_keyboard() {
        homepage.pressEnterbutton();
    }

    @Then("I am navigated to Search result page")
    public void i_am_navigated_to_search_result_page() {
        homepage.navigatedToSearchResult();
    }


    @And("I type {string} in SearchBox")
    public void i_Type_In_SearchBox(String productName) {
        //call the action method here
        homepage.typeInAutoZoneSearchBox(productName);
    }

    @Then("I verify that {string} is displayed")
    public void i_Verify_That_Is_Displayed(String arg0) throws InterruptedException {
        String expectedText = "Search Results for : alternator";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
        Thread.sleep(5000);
    }

    @Then("I verify that {string} is displayed \\(using get text method)")
    public void i_Verify_That_Is_Displayed_Using_Get_Text_Method(String expectedText) {
        homepage.verifySearchResult(expectedText);


    }

    @And("I verify that page title is matched")
    public void i_Verify_That_Page_Title_Is_Matched() throws InterruptedException {
        String expectedText = "Search Results for : spark plug";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
        Thread.sleep(5000);

    }



    @And("I type {string} in SearchBox another way")
    public void i_Type_In_Search_Box_Another_Way(String productName2) {
        homepage.typeInAutoZoneSearchBox(productName2);
    }

    @Then("I verify that {string} should not be displayed as it is not a valid product")
    public void i_Verify_That_Should_Not_Be_Displayed_As_It_Is_Not_A_Valid_Product_Using_The_Get_Text_Method(String Text) {
        String expectedText = "Best Thread Repair Parts for Cars, Trucks & SUVs";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on the shopping cart button")
    public void i_Click_On_The_Shopping_Cart_Button() {
        homepage.clickOnShoppingCart();
    }


    @And("I verify that I am on the shopping cart page.")
    public void i_Verify_That_I_Am_On_The_Shopping_Cart_Page() {
        String expectedText = "Shopping Cart | AutoZone";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @But("i should not be on the Homepage")
    public void i_Should_Not_Be_On_The_Homepage() {
        String expectedText = "Shopping Cart | AutoZone";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("I click on the back button")
    public void iClickOnTheBackButton() {
        homepage.navigateBack();
    }

    @And("I should be on the Autozone Homepage")
    public void iShouldBeOnTheAutozoneHomepage() {
        String expectedText = "AutoZone - Auto Parts, Accessories, and Advice for Cars & Trucks";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("I click on the Autozone logo")
    public void iClickOnTheAutozoneLogo() {
        homepage.clickOnAutoZoneLogo();
    }
}

