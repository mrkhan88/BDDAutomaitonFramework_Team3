package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternationalServices extends WebAPI {

    @FindBy(xpath = "//a[@href='/international-services.html?intnav=BotNav:PlansAndServices:InternationalServices']") public WebElement internationalServices1;
    @FindBy(xpath = "//span[@class='font-family-brand font-black display-text-55']")public WebElement internationalServices2;




    public void checkInternationalServices(){

        internationalServices1.click();
    }

    public void checkInternationalServices1(){

       internationalServices2.isDisplayed();
    }














}
