package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesAndDevices extends WebAPI {

    @FindBy(xpath = "//a[@href='https://www.boostmobile.com/support/faq/phones-devices.html?INTNAV=BotNav:Support:PhonesAndDevices']") public WebElement phonesAndDevices1;
    @FindBy(xpath = "//h1[@id='title-phones-devices']")public WebElement phonesAndDevices2;




    public void checkPhonesAndDevices(){

        phonesAndDevices1.click();
    }

    public void checkPhonesAndDevices1(){

        phonesAndDevices2.isDisplayed();
    }




}
