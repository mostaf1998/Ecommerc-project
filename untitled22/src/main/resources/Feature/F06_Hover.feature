@smoke

Feature: F06_HoverCategories  |  user could hover categories and select sub category

  Scenario: user could hover categories
    When    user hover category and select subcategory
    And     user click on it subcategory
    Then    user will go to relative product page
