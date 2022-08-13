@smoke
Feature: F01_Register | users could register with new accounts


Scenario: user register with valid data

Given    user go to register page
And      user choose male or female
When     user enter valid data
Then     user press on register button
And      user could register successfully