@smoke
Feature: F08_WishList  |  guest user could add products to wishlist

  Background: user login first
    Given     user go to login page
    And       login with valid "mostafaelsayed7788@outlook.com" and "Mostafa2022"
    Then     user press on login button
    And      user login to the system successfully


  Scenario: success message is visible after adding item to wishlist
    When    user add item to wishlist
    Then    wishlist notification success is visible


  Scenario: number of wishlist items in home page is increased
    When    user add item to wishlist
    Then    wishlist notification success is visible
    And     user get the number of wishlist items after adding item
    Then    the number of wishlist increased


  Scenario: added items are displayed on wishlist
    When    user add item to wishlist
    Then    wishlist notification success is visible
    And     user get the number of wishlist items after adding item
    And     user go to wishlist page
    Then    the number of items greater than zero in wishlist page
