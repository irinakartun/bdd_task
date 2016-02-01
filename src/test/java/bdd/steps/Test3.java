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
public class Test3 extends Driver {

    EbayHome ebayHomePage;
    AdvancedSearch advancedSearchPage;
    SearchResult searchResultPage;
    ItemDetails itemDetailsPage;
    Cart cartPage;

    @Given("^User adds \"([^\"]*)\" and \"([^\"]*)\" items to cart$")
    public void UserAddItemsToCart(String title1, String title2){
        ebayHomePage = new EbayHome(driver);
        advancedSearchPage = ebayHomePage.openAdvancedSearch();
        advancedSearchPage.setSearchLine("uno");
        advancedSearchPage.setBuyingFormat();
        advancedSearchPage.setShippingOption();
        searchResultPage = advancedSearchPage.submitSearch();
        itemDetailsPage = searchResultPage.openItemDetails(title1);
        itemDetailsPage.addItemToCart();
        ebayHomePage = (new NavigationPanel(driver)).goToHomePage();
        advancedSearchPage = ebayHomePage.openAdvancedSearch();
        advancedSearchPage.setSearchLine("monopoly");
        advancedSearchPage.setBuyingFormat();
        advancedSearchPage.setShippingOption();
        searchResultPage = advancedSearchPage.submitSearch();
        itemDetailsPage = searchResultPage.openItemDetails(title2);
        itemDetailsPage.addItemToCart();
    }

    @And("^User goes to home page$")
    public void goToHomePage(){
        ebayHomePage = (new NavigationPanel(driver)).goToHomePage();
    }

    @When("^User opens the cart$")
    public void openCart(){
        cartPage = (new NavigationPanel(driver)).openCart();
    }

    @Then("^\"([^\"]*)\" and \"([^\"]*)\" items are in the cart$")
    public void itemsAddedToTheCart(String title1, String title2) {
        cartPage.verifyItemAddedInCart(title1);
        cartPage.verifyItemAddedInCart(title2);
    }

}

