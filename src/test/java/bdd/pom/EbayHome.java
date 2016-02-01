package bdd.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class EbayHome extends AbstractPage{

    public EbayHome(WebDriver driver) {
        super(driver);
    }

    public static final String EBAY_URL = "http://www.ebay.com/";

    @FindBy(id = "gh-as-a")
    private WebElement advancedSearch;


    public AdvancedSearch openAdvancedSearch(){
        advancedSearch.click();
        return PageFactory.initElements(driver, AdvancedSearch.class);
    }



}