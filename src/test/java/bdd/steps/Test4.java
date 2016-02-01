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
public class Test4 extends Driver {

    EbayHome ebayHomePage;
    AdvancedSearch advancedSearchPage;
    SearchResult searchResultPage;
    ItemDetails itemDetailsPage;
    Cart cartPage;

    @Given("^I open the item with title \"([^\"]*)\"$")
    public void FindAndOpenItem(String title){
        ebayHomePage = new EbayHome(driver);
        advancedSearchPage = ebayHomePage.openAdvancedSearch();
        advancedSearchPage.setSearchLine("iphone 6");
        advancedSearchPage.setBuyingFormat();
        advancedSearchPage.setShippingOption();
        searchResultPage = advancedSearchPage.submitSearch();
        itemDetailsPage = searchResultPage.openItemDetails(title);
    }

    @When("^I set amount more than available in stock$")
    public void setExcedeedAmount(){
        int excedeed = itemDetailsPage.getAvailableQuantity() + 1;
        itemDetailsPage.setQuantity(Integer.toString(excedeed));
    }

    @Then("^Error message appears$")
    public void verifyErrorMessage() {
        int qnt = itemDetailsPage.getAvailableQuantity();
        assertTrue(itemDetailsPage.getQuantityErrorMessage().equals("Please enter a quantity of " + Integer.toString(qnt) + " or less"));
    }



}
