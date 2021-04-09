package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sectionals extends WebAPI {

    @FindBy(xpath = "//a[@id='DepartmentItem-Furniture']") public WebElement furniture;
    @FindBy(xpath = "//a[normalize-space()='Sectionals']") public WebElement sectionals1;
    @FindBy(xpath = "//span[@class='BrowseHeaderWithSort-roadsign']") public WebElement sectionalSofasAndCouches1;

    public void checkSectionals(){
        Actions action= new Actions(driver);
        action.moveToElement(furniture).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sectionals1));
        action.moveToElement(sectionals1).click().perform();
    }


    public void checkSectionalSofasAndCouches(){

        sectionalSofasAndCouches1.isDisplayed();
    }










}
