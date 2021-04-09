package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageAccount extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Manage Account']") public WebElement manageAccount1;
    @FindBy(xpath = "//h1[normalize-space()='Sign in to My Boost']")public WebElement signInToMyBoost1;




    public void checkManageAccount(){

        manageAccount1.click();
    }

    public void checkSignInToMyBoost(){

        signInToMyBoost1.isDisplayed();
    }




}
