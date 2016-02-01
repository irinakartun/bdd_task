package bdd.steps;

import bdd.Driver;
import bdd.pom.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class Test1 extends Driver {

    EbayHome ebayHomePage;
    AdvancedSearch advancedSearchPage;
    SearchResult searchResultPage;
    ItemDetails itemDetailsPage;
    Cart cartPage;

    @Given("^User performs search of \"([^\"]*)\"$")
    public void UserSetSearchRequest(String searchRequest){
        ebayHomePage = new EbayHome(driver);
        advancedSearchPage = ebayHomePage.openAdvancedSearch();
        advancedSearchPage.setSearchLine(searchRequest);
        advancedSearchPage.setBuyingFormat();
        advancedSearchPage.setShippingOption();
        searchResultPage = advancedSearchPage.submitSearch();
    }

    @When("^User opens item with title \"([^\"]*)\"$")
    public void openDetailsPage(String itemTitle){
        itemDetailsPage = searchResultPage.openItemDetails(itemTitle);
    }

    @And("^User adds item to cart$")
    public void userAddsItemToCart() {
        cartPage = itemDetailsPage.addItemToCart();
    }

    @Then("^Item with title \"([^\"]*)\" added to the cart$")
    public void itemIsAddedToTheCart(String itemTitle) {
        cartPage.verifyItemAddedInCart(itemTitle);
    }

}

