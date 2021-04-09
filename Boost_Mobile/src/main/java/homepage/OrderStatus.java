package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderStatus extends WebAPI {

    @FindBy(xpath = "//a[@href='/support/track-order-status.html?intnav=BotNav:Support:OrderStatus']") public WebElement orderStatus1;
    @FindBy(xpath = "//h1[normalize-space()='Order Status']")public WebElement orderStatus2;




    public void checkOrderStatus(){

        orderStatus1.click();
    }

    public void checkOrderStatus1(){

        orderStatus2.isDisplayed();
    }





}
