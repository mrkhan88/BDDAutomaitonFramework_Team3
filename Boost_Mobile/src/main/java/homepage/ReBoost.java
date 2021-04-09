package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReBoost extends WebAPI {

    @FindBy(xpath = "//a[@href='/reboost.html?intnav=BotNav:MyBoost:ReBoost']") public WebElement reBoost1;
    @FindBy(xpath = "//span[@class='font-family-brand font-black']")public WebElement reBoost2;




    public void checkReBoost(){

        reBoost1.click();
    }

    public void checkReBoost1(){

        reBoost2.isDisplayed();
    }




}
