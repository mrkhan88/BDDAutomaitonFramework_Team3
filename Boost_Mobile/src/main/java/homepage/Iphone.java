package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iphone extends WebAPI {

    @FindBy(xpath = "//a[@href='/phones.html?filters=phone-types:iphone&intnav=BotNav:Shop:iPhone']") public WebElement iphone1;
    @FindBy(xpath = "//span[@class='font-family-brand font-black']")public WebElement phones2;




    public void checkIphone(){

        iphone1.click();
    }

    public void checkPhones2(){

        phones2.isDisplayed();
    }














}
