package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Category5_Page;
import org.example.pages.Home1_Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D06_HoverCategories {
    Home1_Page home;
    Category5_Page category;
    String subCategoryName;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {
        home = new Home1_Page(Hooks.driver);
        category = new Category5_Page(Hooks.driver);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(home.computers()).perform();
        action.moveToElement(home.computers()).perform();

        subCategoryName = home.desktops().getText().toLowerCase();

        Thread.sleep(1000);
    }

    @And("user click on it subcategory")
    public void user_clicks_subcategory(){
        home.desktops().click();
    }

    @Then("user will go to relative product page")
    public void relative_subcategory(){
        Assert.assertEquals(category.categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }
}


