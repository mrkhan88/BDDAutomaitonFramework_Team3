package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NationwideCoverageMap extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Nationwide Coverage Map']") public WebElement nationwideCoverageMap1;
    @FindBy(xpath = "//span[@id='general-title']")public WebElement nationwideNetworkCoverageMap1;




    public void checkNationwideCoverageMap(){

        nationwideCoverageMap1.click();
    }

    public void checkNationwideNetworkCoverageMap(){

        nationwideNetworkCoverageMap1.isDisplayed();
    }








}
