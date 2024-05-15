@smoke
Feature: Amazon E2E Test Feature

  Scenario: Amazon E2E Test Scenario
    Given the user is on the login page
    And the user logs in successfully
    When the user creates a list named as "My Shopping List"
    And the user selects product category "Computers & Accessories" for search
    And the user searches for product "hp laptop"
    And the user selects the first product and adds it to the list



