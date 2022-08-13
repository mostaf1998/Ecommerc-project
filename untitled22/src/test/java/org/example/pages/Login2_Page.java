package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login2_Page {


    WebDriver driver;

    public Login2_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement email() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement password() {
        return driver.findElement(By.id("Password"));
    }

    public void LoginSteps(String email ,String password)
    {
        email().clear();
        password().clear();

        email().sendKeys( email );
        password().sendKeys( password );
    }

    public WebElement myAccount() {
        return driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement wrongMsg() {
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}

