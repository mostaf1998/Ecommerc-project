@smoke
Feature: F04_Currencies | user could switch between currencies [$, €]

  Scenario: guest user can choose € currency
    When    user select Euro from currency dropdown list
    Then    All $ sign change to € sign
