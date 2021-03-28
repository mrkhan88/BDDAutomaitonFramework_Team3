package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Homepage extends WebAPI {

    @FindBy(xpath = "//a[@class='header-actions__button']") public WebElement serachbox1;
    @FindBy(how = How.CSS, using = ".addsearch.placeholder-shown") public WebElement searchBox2;
    @FindBy(xpath = "//a[@class='addsearchIcon']//*[local-name()='svg']") public WebElement searchBoxButton;
    @FindBy(xpath = "//div[@id='addsearch-result-item-1']/div/h2/a") public WebElement serachResultText;

    public String expectedSearchText= "12 Pro Max";

    public void clickonSearch(){
        serachbox1.click();
    }
    public void typeProductnameOnSearchBox(){
        searchBox2.sendKeys("iphone 12 pro max");
    }
    public void clickSeachBox(){
        searchBoxButton.click();
    }
    public void verifySearchResult(){
        Assert.assertTrue(serachResultText.getText().contains(expectedSearchText));
    }

}
