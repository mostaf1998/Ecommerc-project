package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Home1_Page;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_HomeSlider {
    Home1_Page home;
    @When("click on first slider to direct user")
    public void F1Slider()
    {
        home = new Home1_Page(Hooks.driver);
        Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).click();
        home.slider("1").click();

    }
    @Then("product for first slider is displayed")
    public void first_slide_displayed() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","URL of First Slide");
    }

    @When("user clicks on second slider")
    public void click_on_second_slider() throws InterruptedException {
        home = new Home1_Page(Hooks.driver);
//        Thread.sleep(2000);
        Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).click();
        home.slider("2").click();
    }

    @Then("product for second slider is displayed")
    public void second_slide_displayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6","URL of Second Slide");
    }
}


