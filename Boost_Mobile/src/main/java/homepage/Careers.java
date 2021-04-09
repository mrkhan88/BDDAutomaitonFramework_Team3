package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Careers']") public WebElement careers1;
    @FindBy(xpath = "//span[@class='font-family-brand font-black']")public WebElement careers2;




    public void checkCareers(){

        careers1.click();
    }

    public void checkCareers1(){

        careers2.isDisplayed();
    }












}
