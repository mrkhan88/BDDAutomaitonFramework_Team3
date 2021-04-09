package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BringYourPhone extends WebAPI {

    @FindBy(xpath = "//a[@href='/bring-your-phone.html?intnav=BotNav:Shop:BringYourPhone']") public WebElement bringYourPhone1;
    @FindBy(xpath = "//span[normalize-space()='Bring Your Own Phone']")public WebElement bringYourPhone2;




    public void checkBringYourPhone(){

        bringYourPhone1.click();
    }

    public void checkBringYourPhone2(){

        bringYourPhone2.isDisplayed();
    }














}
