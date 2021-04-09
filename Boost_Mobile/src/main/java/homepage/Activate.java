package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activate extends WebAPI {

    @FindBy(xpath = "//a[@href='https://activate.boostmobile.com/primary/activations-home?intnav=BotNav:MyBoost:Activate']") public WebElement activate1;
    @FindBy(xpath = "//h1[normalize-space()='Activate a Device']")public WebElement activateADevice1;




    public void checkActivate(){

        activate1.click();
    }

    public void checkActivateADevice(){

        activateADevice1.isDisplayed();
    }


}
