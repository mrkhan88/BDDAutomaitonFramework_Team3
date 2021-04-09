package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpandedNetworkCoverageMap extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Expanded Network Coverage Map']") public WebElement expandedNetworkCoverageMap1;
    @FindBy(xpath = "//span[@class='ng-binding']")public WebElement expandedNetworkCoverageMap2;




    public void checkExpandedNetworkCoverageMap(){

        expandedNetworkCoverageMap1.click();
    }

    public void checkExpandedNetworkCoverageMap1(){

        expandedNetworkCoverageMap2.isDisplayed();
    }



}
