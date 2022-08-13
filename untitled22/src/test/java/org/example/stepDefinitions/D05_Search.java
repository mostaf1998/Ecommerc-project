package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Home1_Page;
import org.example.pages.Search4_Page;
import org.testng.asserts.SoftAssert;

public class D05_Search {

    Home1_Page home;
    Search4_Page search;
    @Given("user click on search bar")
    public void user_click_on_searchbar() {
        home = new Home1_Page(Hooks.driver);
        search = new Search4_Page(Hooks.driver);
        home.searchBar().click();
    }

    @When("user search for product like \"(.*)\"$")
    public void user_search_for_product(String search) {
        home.searchBar().sendKeys(search);
    }

    @And("user click on search Button")
    public void user_click_on_searchButton() {
        home.searchButton().click();
    }

    @Then("user could search successfully and go to search page")
    public void search_successfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Nokia"), "search URL");
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        soft.assertAll();
    }

    @Then("user could search successfully with SKU")
    public void search_with_sku_successfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        soft.assertAll();
    }


        }



