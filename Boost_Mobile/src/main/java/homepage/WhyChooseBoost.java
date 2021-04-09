package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhyChooseBoost extends WebAPI {

    @FindBy(xpath = "//a[@href='/why-boost.html?intnav=BotNav:About:WhyChooseBoost']") public WebElement whyChooseBoost1;
    @FindBy(xpath = "//span[@class='font-family-brand font-black']")public WebElement whyChooseBoost2;




    public void checkWhyChooseBoost(){

        whyChooseBoost1.click();
    }

    public void checkWhyChooseBoost1(){

        whyChooseBoost2.isDisplayed();
    }











}
