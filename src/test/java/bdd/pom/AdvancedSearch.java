package bdd.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Irina_Kartun on 1/30/2016.
 */
public class AdvancedSearch extends AbstractPage {

    public AdvancedSearch(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "_nkw")
    private WebElement searchLine;

    @FindBy(id = "LH_BIN")
    private WebElement buyNow;

    @FindBy(id = "LH_FS")
    private WebElement freeShipping;

    @FindBy(xpath = "//*[@id='searchBtnLowerLnk']")
    private WebElement searchBtn;


    public SearchResult submitSearch(){
        searchBtn.click();
        return PageFactory.initElements(driver, SearchResult.class);
    }

    public void setBuyingFormat(){
        buyNow.click();
    }

    public void setShippingOption(){
        freeShipping.click();
    }

    public void setSearchLine(String valueToSearch){
        searchLine.sendKeys(valueToSearch);
    }

}

