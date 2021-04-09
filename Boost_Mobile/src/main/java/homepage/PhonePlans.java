package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonePlans {

    @FindBy(xpath = "//a[@href='/expanded-plans.html?intnav=BotNav:PlansAndServices:PhonePlans']") public WebElement phonePlans1;
    @FindBy(xpath = "//div[@class='font-family-brand font-bold display-text-90']//span[@data-attr-color='true'][normalize-space()='SHRINK-IT!']")public WebElement shrinkIt1;




    public void checkPhonePlans(){

        phonePlans1.click();
    }

    public void checkShrinkIt(){

        shrinkIt1.isDisplayed();
    }











}
