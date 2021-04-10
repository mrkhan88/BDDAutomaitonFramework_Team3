package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage extends WebAPI {

    //    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'About NYP')]") public WebElement searchText1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='doc3']/div[4]/footer[1]/section[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/*[1]")
    public WebElement JossAndMain;
    @FindBy(how = How.XPATH, using = "//body/div[@id='doc3']/div[4]/footer[1]/section[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/*[1]")
    public WebElement AllModern;
    @FindBy(how = How.XPATH, using = "//body/div[@id='doc3']/div[4]/footer[1]/section[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/*[1]") public WebElement BirchLane;

    public void clickOnJossAndMain() {
        JossAndMain.click();
    }

    public void clickOnAllModern() {
        AllModern.click();
    }

    public void checkHomePage() {
        String expectedText = "Wayfair.com - Online Home Store for Furniture, Decor, Outdoors & More";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    public void clickOnBirchLane(){
        BirchLane.click();
    }
}
