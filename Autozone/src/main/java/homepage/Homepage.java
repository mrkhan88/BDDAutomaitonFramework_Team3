package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Homepage extends WebAPI {

    public static final String searchbox_css ="#twotabsearchtextbox";
    public static final String searchButton_xp ="//input[@id='nav-search-submit-button']";
    public static final String searchResultText_xp = "//span[@class='a-color-state a-text-bold']";
    public  String expectedText ="\"ipad air\"";

    public String searchText = "battery";

    @FindBy(how = How.XPATH, using ="//input[@id='deskTopSearchInput']") public WebElement searchBox1;
    @FindBy(xpath = "//img[@alt='search']")public WebElement searchButton1;

    public void typeInSearchbox() throws InterruptedException {
        searchBox1.sendKeys("battery");
        wait(5);
    }
    public void pressEnterbutton(){
        searchBox1.sendKeys(Keys.ENTER);
//        searchButton1.click();
    }
    public void navigatedToSearchResult(){
        Assert.assertTrue(driver.getCurrentUrl().contains(searchText));
    }



}
