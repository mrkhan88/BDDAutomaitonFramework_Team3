package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportHome extends WebAPI {

    @FindBy(xpath = "//a[@href='https://www.boostmobile.com/support/faq.html?INTNAV=BotNav:Support:SupportHome']") public WebElement supportHome1;
    @FindBy(xpath = "//span[normalize-space()='FAQs']")public WebElement faqs1;




    public void checkSupportHome(){

        supportHome1.click();
    }

    public void checkFaqs(){

        faqs1.isDisplayed();
    }


}
