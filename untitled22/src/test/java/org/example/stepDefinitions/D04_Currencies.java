package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Home1_Page;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D04_Currencies {
    Home1_Page home;

    @When("user select Euro from currency dropdown list")
    public void user_select_Euro() {
        home = new Home1_Page(Hooks.driver);
        home.currency().click();
        home.currencyEuro().click();
    }

    @Then("All $ sign change to € sign")
    public void €_sign() {
        int count = Hooks.driver.findElements(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).size();
        for (int x = 0; x < count; x++){
            String text = home.productPrices().getText();
            Assert.assertTrue(text.contains("€"));
        }
    }
}


