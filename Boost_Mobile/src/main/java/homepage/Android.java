package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Android extends WebAPI {

    @FindBy(xpath = "//a[@href='/phones.html?filters=phone-types:android&intnav=BotNav:Shop:Android']") public WebElement android1;
    @FindBy(xpath = "//span[@class='font-family-brand font-black']")public WebElement phones3;




    public void checkAndroid(){

        android1.click();
    }

    public void checkPhones3(){

        phones3.isDisplayed();
    }












}
