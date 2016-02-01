package bdd.steps;

import bdd.Driver;
import bdd.pom.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class Test2 extends Driver {

    EbayHome ebayHomePage;
    AdvancedSearch advancedSearchPage;
    SearchResult searchResultPage;
    ItemDetails itemDetailsPage;
    Cart cartPage;

    @Given("^I perform search of \"([^\"]*)\"$")
    public void UserSetSearchRequest(String searchRequest){
        ebayHomePage = new EbayHome(driver);
        advancedSearchPage = ebayHomePage.openAdvancedSearch();
        advancedSearchPage.setSearchLine(searchRequest);
        advancedSearchPage.setBuyingFormat();
        advancedSearchPage.setShippingOption();
        searchResultPage = advancedSearchPage.submitSearch();
    }

    @When("^I open item with title \"([^\"]*)\"$")
    public void openDetailsPage(String itemTitle){
        itemDetailsPage = searchResultPage.openItemDetails(itemTitle);
    }

    @And("^I select \"([^\"]*)\"$")
    public void userSelects(String colour) {
        itemDetailsPage.selectColour(colour);
    }

    @And("^I add item to cart$")
    public void userAddsItemToCart() {
        cartPage = itemDetailsPage.addItemToCart();
    }

    @Then("^Item \"([^\"]*)\" is added to the cart$")
    public void itemIsAddedToTheCart(String itemTitle) {
        cartPage.verifyItemAddedInCart(itemTitle);
    }


    @And("^Item color is \"([^\"]*)\"$")
    public void itemSColorIs(String colour) {
        assertTrue(cartPage.getColour().equals(colour));
    }



}
