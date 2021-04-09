package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlansAndServices extends WebAPI {

    @FindBy(xpath = "//a[@href='https://www.boostmobile.com/support/faq/plans-services.html?INTNAV=BotNav:Support:PlansAndServices']") public WebElement plansAndServices1;
    @FindBy(xpath = "//h1[normalize-space()='Plans & Services']")public WebElement plansAndServices2;




    public void checkPlanAndServices(){

        plansAndServices1.click();
    }

    public void checkPlanAndServices1(){

        plansAndServices2.isDisplayed();
    }





}
