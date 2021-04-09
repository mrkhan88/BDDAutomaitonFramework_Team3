package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddOnServices extends WebAPI {

    @FindBy(xpath = "//a[@href='/add-on-services.html?intnav=BotNav:PlansAndServices:AddOnServices']") public WebElement addOnServices1;
    @FindBy(xpath = "//span[normalize-space()='Add-On Services']")public WebElement addOnServices2;




    public void checkAddOnServices(){

        addOnServices1.click();
    }

    public void checkAddOnServices1(){

       addOnServices2.isDisplayed();
    }










}
