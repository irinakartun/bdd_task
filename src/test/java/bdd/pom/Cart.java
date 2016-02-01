package bdd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.fail;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class Cart extends AbstractPage{


    public Cart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='ShopCart']//div[@id]")
    private List<WebElement> addedItems;

    @FindBy(xpath = "//td[contains(., 'color:')]/following-sibling::td")
    private WebElement colour;

    public void verifyItemAddedInCart(String itemTitle){
        boolean found = false;
        for (int i = 0; i < addedItems.size(); i++){
            WebElement title = driver.findElement(By.xpath("//*[@class='fl prltv infocolcart140']//a[contains(., '" + itemTitle + "')]"));
            if ( addedItems.get(i).getText().contains(title.getText()) ){
                found = true;
                break;
            }
            else{
                continue;
            }
        }
        if (!found){
            fail("Item was not added to the cart!");
        }
    }

    public String getColour(){
        return colour.getText();
    }

}
