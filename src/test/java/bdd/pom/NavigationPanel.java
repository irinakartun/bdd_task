package bdd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class NavigationPanel extends AbstractPage{

    public NavigationPanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gh-la")
    private WebElement ebayLogo;

    @FindBy(id="gh-cart")
    private WebElement cartIcon;

    @FindBy(id = "gh-eb-Geo")
    private WebElement languages;

    @FindBy(xpath = "//*[@class='gh-menu']//span[contains(., 'English')]")
    private WebElement english;


    public EbayHome goToHomePage(){
        ebayLogo.click();
        return PageFactory.initElements(driver, EbayHome.class);
    }

    public Cart openCart(){
        cartIcon.click();
        return PageFactory.initElements(driver, Cart.class);
    }

    public void setLanguage(String language){
        languages.click();
        WebElement setLanguage = driver.findElement(By.xpath("//*[@class='gh-menu']//span[contains(., '" + language + "')]"));
        setLanguage.click();
    }

}

