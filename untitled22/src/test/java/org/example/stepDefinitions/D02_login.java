package org.example.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Home1_Page;
import org.example.pages.Login2_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;


public class D02_login {
    Login2_Page login;
    Home1_Page home;

    @Given("user go to login page")
    public void user_navigate_to_login_page() {
        home = new Home1_Page(Hooks.driver);
        login = new Login2_Page(Hooks.driver);
        home.Navigate_to_LoginPage().click();
    }
    @When("login with valid \"(.*)\" and \"(.*)\"$")
    public void vaild_data(String email, String password) throws InterruptedException {
        login.LoginSteps(email, password);
        Thread.sleep(3000);
    }

    @Then("user press on login button")
    public void click_Login() {
        login.password().sendKeys(Keys.ENTER);
    }

    @And("user login to the system successfully")
    public void login_success() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","URL login");
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed();
        soft.assertTrue(login.myAccount().isDisplayed(), "My Account");
        soft.assertAll();
    }

    @When("login with invalid \"(.*)\" and \"(.*)\"$")
    public void Invaild_data(String email, String password) throws InterruptedException {
        login.LoginSteps(email, password);
        Thread.sleep(3000);
    }

    @And("user could not login to the system")
    public void cannot_login_successfully() {
        SoftAssert soft = new SoftAssert();
        login.wrongMsg().isDisplayed();
        String actual = login.wrongMsg().getText();
        soft.assertEquals(actual,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect","Wrong Message");
        actual = login.wrongMsg().getCssValue("color");
        String expected = "rgba(228, 67, 75, 1)";
        soft.assertEquals(actual, expected, "color");
        soft.assertAll();
    }
}




