package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'About NYP')]") public WebElement searchText1;
    //   @FindBy(how = How.XPATH, using ="//input[@id='deskTopSearchInput']") public WebElement searchBox1;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]") public WebElement aboutUs;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]") public WebElement governance;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]") public WebElement contactUs;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]") public WebElement health;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]") public WebElement newsRoom;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]") public WebElement Events;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[2]/li[1]/a[1]") public WebElement charity;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[2]/li[1]/a[1]") public WebElement volunteer;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]") public WebElement professionals;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]") public WebElement Graduate;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]") public WebElement publication;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[2]/li[1]/a[1]") public WebElement careers;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[2]/li[2]/a[1]") public WebElement Nursing;
    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[2]/div[1]") public WebElement Disclaimer;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Privacy Notice')]") public WebElement Privacy;





    public void clickOnAboutUs(){
        aboutUs.click();
    }

    public void checkHomePage(){
        String expectedText = "NewYork-Presbyterian";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    public void clickGovernance(){
        governance.click();
    }

    public void clickContactus(){
        contactUs.click();
    }

    public void clickOnHealth(){
        health.click();
    }

    public void clickOnNewsRoom(){
        newsRoom.click();
    }

    public void clickOnEvents(){
        Events.click();
    }


    public void clickOnCharity(){
        charity.click();
    }

    public void clickOnVolunteer(){
        volunteer.click();
    }

    public void clickOnprofessionals(){
        professionals.click();
    }

    public void clickOnGraduate(){
        Graduate.click();
    }

    public void clickOnpublication(){
        publication.click();
    }

    public void clickOncareers(){
        careers.click();
    }

    public void clickOnNursing(){
        Nursing.click();
    }

    public void clickOnDisclaimer(){
        Disclaimer.click();
    }

    public void clickOnPrivacy(){
        Privacy.click();
    }
}

