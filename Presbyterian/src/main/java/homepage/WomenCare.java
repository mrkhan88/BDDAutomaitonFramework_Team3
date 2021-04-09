package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenCare extends WebAPI {

    @FindBy(xpath = "//span[@class='desktopTitle'][normalize-space()='Doctors & Services']") public WebElement doctorsAndServices;
    @FindBy(xpath = "//a[normalize-space()='Schedule an Urgent Care Appointment']") public WebElement scheduleAnUrgentCareAppointment1;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/div[4]/article[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]/span[1]") public WebElement womenCare1;



    public void checkScheduleAnUrgentCareAppointment(){
        Actions action= new Actions(driver);
        action.moveToElement(doctorsAndServices).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(scheduleAnUrgentCareAppointment1));
        action.moveToElement(scheduleAnUrgentCareAppointment1).click().perform();

    }

    public void checkWomenCare(){

        womenCare1.click();
    }









}
