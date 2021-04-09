package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SofasAndLoveSeats extends WebAPI {

    @FindBy(xpath = "//a[@id='DepartmentItem-Furniture']") public WebElement furniture;
    @FindBy(xpath = "//a[normalize-space()='Sofas & Loveseats']") public WebElement sofasAndLoveSeats1;
    @FindBy(xpath = "//span[@class='BrowseHeaderWithSort-roadsign']") public WebElement sofas1;

    public void checkSofasAndLoveSeats(){
        Actions action= new Actions(driver);
        action.moveToElement(furniture).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sofasAndLoveSeats1));
        action.moveToElement(sofasAndLoveSeats1).click().perform();
    }


    public void checkSofas(){

        sofas1.isDisplayed();
    }










}
