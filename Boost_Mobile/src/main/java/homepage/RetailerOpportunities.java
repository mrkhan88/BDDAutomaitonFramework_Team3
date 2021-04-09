package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetailerOpportunities extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Retailer Opportunities']") public WebElement retailerOpportunities1;
    @FindBy(xpath = "//div[@class='dl-title']")public WebElement retailerOpportunities2;




    public void checkRetailerOpportunities(){

        retailerOpportunities1.click();
    }

    public void checkRetailerOpportunities1(){

        retailerOpportunities2.isDisplayed();
    }











}
