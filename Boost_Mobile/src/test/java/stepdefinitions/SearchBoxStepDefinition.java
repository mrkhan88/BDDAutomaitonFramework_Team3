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

    @Given("I am at Boostmobile homepage")
    public void i_am_at_boostmobile_homepage() throws IOException {
        openBrowser("https://www.boostmobile.com/");
    }
    @Given("I click on Search")
    public void i_click_on_search() {
        homepage.clickonSearch();
    }
    @And("I type valid product name in SearchBox")
    public void i_type_valid_product_name_in_search_box() {
        homepage.typeProductnameOnSearchBox();
    }
    @When("I click on SearchBox button")
    public void i_click_on_search_box_button() {
        homepage.clickSeachBox();
    }
    @Then("I am navigated to Search result page")
    public void i_am_navigated_to_search_result_page() {
        homepage.verifySearchResult();
    }

    @And("I click the Boost Mobile logo")
    public void iClickTheBoostMobileLogo() {
    homepage.clickOnHomePageLogo();
    }


    @Then("I verify that it takes me to the Boost Mobile homepage")
    public void iVerifyThatItTakesMeToTheBoostMobileHomepage() {
        String expectedText = "Affordable No-Contract, Prepaid Wireless | Boost Mobile";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on {string} AP")
    public void iClickOnAP(String arg0) {
        homepage.clickOnAllPhones();
    }

    @Then("I verify that I am on the {string} AP page")
    public void iVerifyThatIAmOnTheAPPage(String arg0) {
        String expectedText = "Shop our Best Prepaid No-Contract Cell Phones | Boost Mobile";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("clicking the back button should take me back to the homepage")
    public void clickingTheBackButtonShouldTakeMeBackToTheHomepage() {
        driver.navigate().back();
        homepage.checkHomePage();
    }

}
