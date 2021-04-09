package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WayfairMethod extends WebAPI {

@FindBy(xpath = "//a[@id='DepartmentItem-Furniture']") public WebElement furniture;
@FindBy(xpath = "//li[1]//div[1]//div[1]//ul[1]//li[1]//a[1]//h3[1]") public WebElement livingRoomFurniture;
@FindBy(xpath = "//h1[normalize-space()='Living Room Furniture']") public WebElement livingRoomFurniture1;

    public void checkLivingRoomFurniture(){
        Actions action= new Actions(driver);
        action.moveToElement(furniture).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(livingRoomFurniture));
        action.moveToElement(livingRoomFurniture).click().perform();
    }


 public void displayedText(){

        livingRoomFurniture1.isDisplayed();
 }



}
