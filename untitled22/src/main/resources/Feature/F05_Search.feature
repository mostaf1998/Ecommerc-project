@smoke

Feature: F04_Search | users will be able to search for products with different parameters


  Scenario: user could search using product name
    Given user click on search bar
    When user search for product like "Nike"
    And user click on search Button
    Then user could search successfully and go to search page


  Scenario: user could search for product using sku
    Given   user click on search bar
    When    user search for product like "AP_MBP_13"
    And     user click on search Button
    Then    user could search successfully with SKU
