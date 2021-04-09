package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineDeals extends WebAPI {

    @FindBy(xpath = "//a[@href='/deals.html?intnav=BotNav:Shop:OnlineDeals']") public WebElement onlineDeals1;
    @FindBy(xpath = "//span[@data-attr-color='true']")public WebElement onlineDeals2;




    public void checkOnlineDeals(){

        onlineDeals1.click();
    }

    public void checkOnlineDeals2(){

        onlineDeals2.isDisplayed();
    }











}
