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
    public static final String autozoneSearchBoxLocator = "//input[@id='deskTopSearchInput']"; //xpath
    public static final String shoppingCartButtonLocator= "//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/a[1]/div[1]/img[1]"; //xpath
    public static final String AutoZoneLogoLocator= "//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/img[1]";//xpath

    public String searchText = "battery";


    @FindBy(how = How.XPATH, using ="//input[@id='deskTopSearchInput']") public WebElement searchBox1;
    @FindBy(xpath = "//img[@alt='search']")public WebElement searchButton1;
    @FindBy(how = How.XPATH, using = autozoneSearchBoxLocator) public WebElement autozoneSearchBox;
    //@FindBy(how = How.XPATH, using = closeCookies) public WebElement closeCookies1;
    @FindBy(xpath = "//h2[contains(text(),'spark plug')]") public WebElement sparkPlugText;
    @FindBy(how = How.XPATH, using = shoppingCartButtonLocator) public WebElement shoppingCartButton;
    @FindBy(how = How.XPATH, using = AutoZoneLogoLocator) public WebElement AutoZoneLogo;




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

    //make an action method
    //type in searchbox
    public void typeInAutoZoneSearchBox(String productName){
        autozoneSearchBox.sendKeys(productName);
    }


    public void verifySearchResult(String expectedText){
        String actualText=sparkPlugText.getText();
        Assert.assertEquals("Product does not match",expectedText,actualText);
    }

    public void clickOnShoppingCart(){
        shoppingCartButton.click();
    }

    public void clickOnAutoZoneLogo(){
        AutoZoneLogo.click();
    }


    }






