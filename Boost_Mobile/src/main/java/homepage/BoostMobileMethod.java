package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoostMobileMethod extends WebAPI {

    @FindBy(xpath = "//a[@href='/phones.html?intnav=BotNav:Shop:AllPhones']") public WebElement allPhones1;
    @FindBy(xpath = "//span[@class='font-family-brand font-black']")public WebElement phones1;




    public void checkAllPhones(){

        allPhones1.click();
    }

    public void checkPhones(){

        phones1.isDisplayed();
    }





}
