package bdd.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class ItemDetails extends AbstractPage{

    public ItemDetails(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "isCartBtn_btn")
    private WebElement addToCartBtn;

    @FindBy(id="msku-sel-1")
    private WebElement colour;

    @FindBy(id = "qtyTextBox")
    private WebElement quantity;

    @FindBy(id = "qtySubTxt")
    private WebElement availableQuantity;

    @FindBy(xpath = "//div[contains(., 'Quantity:')]/following-sibling::div//div[@class='u-cb err']")
    private WebElement errorQuantity;

    @FindBy(xpath = "//div[contains(., 'Color')]/following-sibling::div/div[@class='u-cb err']")
    private WebElement colorError;

    @FindBy(xpath = "//div[contains(., 'Storage Capacity:')]/following-sibling::div/div[@class='u-cb err']")
    private WebElement capacityError;


    public Cart addItemToCart(){
        addToCartBtn.click();
        return PageFactory.initElements(driver, Cart.class);
    }

    public void selectColour(String itemColour){
        Select dropdownColour = new Select(colour);
        dropdownColour.selectByVisibleText(itemColour);
    }

    public void setQuantity(String amount){
        quantity.clear();
        quantity.sendKeys(amount);
    }

    public int getAvailableQuantity(){
        String max = availableQuantity.getText().replace("available", "");
        String maxAmount = max.replace("More than", "").trim();
        int maxQuantity = Integer.parseInt(maxAmount);
        return maxQuantity;
    }

    public String getQuantityErrorMessage(){
        return errorQuantity.getText();
    }

    public String getColorErrorMessage(){
        return colorError.getText();
    }

    public String getCapacityErrorMessage(){
        return capacityError.getText();
    }




}

