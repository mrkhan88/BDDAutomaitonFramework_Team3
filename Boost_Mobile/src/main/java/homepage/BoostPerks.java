package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoostPerks extends WebAPI {

    @FindBy(xpath = "//a[@href='/why-boost/boost-perks.html?intnav=BotNav:MyBoost:BoostPerks']") public WebElement boostPerks1;
    @FindBy(xpath = "//img[@alt='Boost Perks']")public WebElement boostPerks2;




    public void checkBoostPerks(){

        boostPerks1.click();
    }

    public void checkBoostPerks1(){

        boostPerks2.isDisplayed();
    }



}
