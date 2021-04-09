package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoZoneMethod extends WebAPI {

    @FindBy(xpath = "//div[@class='styles_columnsContainer__1cIh7']//a[contains(@class,'styles_linkItem__11kzM')][normalize-space()='Vehicle Make']") public WebElement vehicleMake1;
    @FindBy(xpath = "//h2[normalize-space()='Shop By Make']")public WebElement shopByMake1;

    public void checkVehicleMake(){

        vehicleMake1.click();
    }

    public void checkShopByMake(){

       shopByMake1.isDisplayed();
    }




}
