package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newsroom extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Newsroom']") public WebElement newsroom1;
    @FindBy(xpath = "//span[normalize-space()='Newsroom']")public WebElement newsroom2;




    public void checkNewsroom(){

        newsroom1.click();
    }

    public void checkNewsroom1(){

        newsroom2.isDisplayed();
    }










}
