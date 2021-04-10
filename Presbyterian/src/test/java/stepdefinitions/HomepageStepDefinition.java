package stepdefinitions;


import common.WebAPI;
import homepage.HomePage;
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

public class HomepageStepDefinition extends WebAPI {
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

    @Given("I am on the Presbyterian homepage")
    public void iAmOnThePresbyterianHomepage() throws IOException {
        openBrowser("https://www.nyp.org//");

    }


    @And("That I am on the homepage by verifying page title")
    public void thatIAmOnTheHomepageByVerifyingPageTitle() {
        String expectedText = "NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");

    }


    @And("verify the text {string} appears in the footnotes")
    public void verifyTheTextAppearsInTheFootnotes() {
        String actualText=getTextByXpath("//h4[contains(text(),'About NYP')]");
        String expectedText = "About NYP";
        Assert.assertEquals("Product does not match",expectedText,actualText);




        // public void verifySearchResult(String expectedText){
        //        String actualText=searchText.getText();
        //        Assert.assertEquals("Product does not match",expectedText,actualText);

    }

    @When("I click on {string}")
    public void iClickOn(String aboutus) {
        homepage.clickOnAboutUs();
    }

    @Then("I verify that it is indeed the {string} page")
    public void iVerifyThatItIsIndeedThePage(String arg0) {
        String expectedText = "About Us | NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }


    @Then("clicking the back button should take me back to the homepage")
    public void clickingTheBackButtonShouldTakeMeBackToTheHomepage() {
            driver.navigate().back();
            homepage.checkHomePage();
    }

    @Then("I click on {string} tab")
    public void iClickOnTab(String arg0) {
        homepage.clickGovernance();
    }


    @And("I verify that the page title {string} is correct")
    public void iVerifyThatThePageTitleIsCorrect(String arg0) {
        String expectedText = "NYP-Governance and Leadership | NYP";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }


    @And("I click on the contact us tab")
    public void iClickOnTheContactUsTab() throws InterruptedException {
        homepage.clickContactus();
        sleepFor(5);
    }

    @Then("I verify that I am on the contact us tab")
    public void iVerifyThatIAmOnTheContactUsTab() {
        String expectedText = "Contact NewYork-Presbyterian - Phone | Addresses";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on the {string} tab")
    public void iClickOnTheTab(String arg0) {
        homepage.clickOnHealth();
    }

    @Then("I verify that I am on the {string} tab")
    public void iVerifyThatIAmOnTheTab(String arg0) {
        String expectedText = "NewYork-Presbyterian - Health Matters";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("I click on the {string} tab{int}")
    public void iClickOnTheTab(String arg0, int arg1) {
        homepage.clickOnNewsRoom();
    }

    @And("I verify that I am on the {string} tab{int}")
    public void iVerifyThatIAmOnTheTab(String arg0, int arg1) {
        String expectedText = "Newsroom | NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("I click on the the tab {string}")
    public void iClickOnTheTheTab(String arg0) {
        homepage.clickOnEvents();
    }


    @And("I verify that I am on the page {string} tab")
    public void iVerifyThatIAmOnThePageTab(String arg0) {
        String expectedText = "Events Calendar - Events at NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("I click on the the tab named {string}")
    public void iClickOnTheTheTabNamed(String arg0) {
        homepage.clickOnCharity();
    }

    @And("I verify that I am on the page {string}")
    public void iVerifyThatIAmOnThePage(String arg0) {
        String expectedText = "Give to NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("I click on the another tab named {string}")
    public void iClickOnTheAnotherTabNamed(String arg0) {
        homepage.clickOnVolunteer();
    }

    @And("I verify that I am on the {string} page")
    public void iVerifyThatIAmOnThePage1(String arg0) {
        String expectedText = "Volunteer at NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I verify that I am on the {string} page{int}")
    public void iVerifyThatIAmOnThePage(String arg0, int arg1) {
        String expectedText = "Give to NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }


    @Then("I click on {string} fp tab")
    public void iClickOnFpTab(String arg0) {
        homepage.clickOnprofessionals();
    }

    @And("I verify that I am on the {string}")
    public void iVerifyThatIAmOnThe(String arg0) {
        String expectedText = "For Professionals | NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Then("I click on {string} GME tab")
    public void iClickOnGMETab(String arg0) {
        homepage.clickOnGraduate();
    }

    @And("I verify that I am on the {string} GME tab")
    public void iVerifyThatIAmOnTheGMETab(String arg0) {
        String expectedText = "Graduate Medical Education - For Professionals | NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on {string} P tab")
    public void iClickOnPTab(String arg0) {
        homepage.clickOnpublication();
    }


    @And("I verify that I am on the {string} p")
    public void iVerifyThatIAmOnTheP(String arg0) {
        String expectedText = "NYP-Professionals-Publications for Medical Professionals | NYP";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on {string} C tab")
    public void iClickOnCTab(String arg0) {
        homepage.clickOncareers();
    }

    @And("I verify that I am on the {string} C")
    public void iVerifyThatIAmOnTheC(String arg0) {
        String expectedText = "Working at NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on {string} NJ tab")
    public void iClickOnNJTab(String arg0) {
        homepage.clickOnNursing();
    }

    @And("I verify that I am on the {string} NJ")
    public void iVerifyThatIAmOnTheNJ(String arg0) {
        String expectedText = "Nursing Careers at NewYork-Presbyterian Hospitaln";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on {string} D tab")
    public void iClickOnDTab(String arg0) {
        homepage.clickOnDisclaimer();
    }

    @And("I verify that I am on the {string} D")
    public void iVerifyThatIAmOnTheD(String arg0) {
        String expectedText = "NYP-Professionals-Publications for Medical Professionals | NYP";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @And("I click on {string} PN tab")
    public void iClickOnPNTab(String arg0) {
        homepage.clickOnPrivacy();
    }

    @And("I verify that I am on the {string} PN")
    public void iVerifyThatIAmOnThePN(String arg0) {
        String expectedText = "Privacy Notice | NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

}
