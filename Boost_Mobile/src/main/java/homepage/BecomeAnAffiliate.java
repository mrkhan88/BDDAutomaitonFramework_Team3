package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BecomeAnAffiliate extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Become an Affiliate']") public WebElement becomeAnAffiliate1;
    @FindBy(xpath = "//span[normalize-space()='It Pays To Be A Digital Affiliate']")public WebElement itPaysToBeADigitalAffiliate1;




    public void checkBecomeAnAffiliate(){

        becomeAnAffiliate1.click();
    }

    public void checkItPaysToBeADigitalAffiliate(){

        itPaysToBeADigitalAffiliate1.isDisplayed();
    }















}
