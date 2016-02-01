package bdd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.fail;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class SearchResult extends AbstractPage{


    public SearchResult(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='ResultSetItems']//li[@id]")
    private List<WebElement> itemsList;

    @FindBy(xpath = "//td[@class='pagn-next']/a[not(@aria-disabled)]")
    private WebElement nextPage;


    public ItemDetails openItemDetails(String itemTitle) {
        boolean found = false;
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getText().contains(itemTitle)) {
                WebElement title = driver.findElement(By.xpath(".//h3[contains(., '" + itemTitle + "')]/a"));
                title.click();
                found = true;
                break;
            } else {
                continue;
            }
        }
        if (!found) {
            if (nextPage.isDisplayed()) {
                nextPage.click();
                openItemDetails(itemTitle);
            } else {
                fail("Specified item was not found!");
            }
        }
        return PageFactory.initElements(driver, ItemDetails.class);
    }

}

