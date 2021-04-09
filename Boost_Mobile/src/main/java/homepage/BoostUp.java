package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoostUp {


    @FindBy(xpath = "//a[@href='/boost-up-phone-financing.html?intnav=BotNav:Shop:BoostUP']") public WebElement boostUp1;
    @FindBy(xpath = "//span[@class='font-family-brand font-light']")public WebElement boostUp2;




    public void checkBoostUp(){

        boostUp1.click();
    }

    public void checkBoostUp1(){

        boostUp2.isDisplayed();
    }










}
