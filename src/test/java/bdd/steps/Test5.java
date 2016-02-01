package bdd.steps;

import bdd.Driver;
import bdd.pom.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class Test5 extends Driver {

    EbayHome ebayHomePage;
    AdvancedSearch advancedSearchPage;
    SearchResult searchResultPage;
    ItemDetails itemDetailsPage;
    Cart cartPage;

    @Given("^User found an item \"([^\"]*)\" with color and capacity attributes$")
    public void UserFindsItem(String title){
        ebayHomePage = new EbayHome(driver);
        advancedSearchPage = ebayHomePage.openAdvancedSearch();
        advancedSearchPage.setSearchLine(title);
        advancedSearchPage.setBuyingFormat();
        advancedSearchPage.setShippingOption();
        searchResultPage = advancedSearchPage.submitSearch();
        itemDetailsPage = searchResultPage.openItemDetails(title);
    }

    @When("^User tries to add found item to cart$")
    public void openCart(){
        itemDetailsPage.addItemToCart();
    }

    @Then("^two error messages appear$")
    public void itemsAddedToTheCart() {
        assertTrue(itemDetailsPage.getColorErrorMessage().equals("Please select a Color"));
        assertTrue(itemDetailsPage.getCapacityErrorMessage().equals("Please select a Storage Capacity"));
    }

}

