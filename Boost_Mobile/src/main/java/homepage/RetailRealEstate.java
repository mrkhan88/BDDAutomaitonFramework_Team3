package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetailRealEstate extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Retail Real Estate']") public WebElement retailRealEstate1;
    @FindBy(xpath = "//span[normalize-space()='Real Estate Opportunities']")public WebElement realEstateOpportunities1;




    public void checkRetailRealEstate(){

       retailRealEstate1.click();
    }

    public void checkRealEstateOpportunities(){

        realEstateOpportunities1.isDisplayed();
    }















}
