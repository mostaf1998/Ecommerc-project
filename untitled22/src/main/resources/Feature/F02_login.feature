@smoke
Feature: F02_login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user go to login page
    When login with valid "mostafaelsayed7788@outlook.com" and "Mostafa2022"
    Then  user press on login button
     And  user login to the system successfully

    Scenario: user could login with invalid email and password
    Given user go to login page
    When login with invalid "mostafaelsayed7788@outlook.com" and "Mostafa259"
    Then user press on login button
    And user could not login to the system
