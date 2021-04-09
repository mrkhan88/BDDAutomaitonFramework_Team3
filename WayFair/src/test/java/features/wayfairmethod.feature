Feature: Wayfair functionality testing

  @Test1
  Scenario: Scenario 1
    Given I am on wayfair.com
    And I hover over furniture
    Then I should see living room furniture


  @Test2
  Scenario: Scenario 2
    Given I am on wayfair.com
    And I hover over furniture
    When I click on sofas and love seats
    Then I should see sofas


  @Test3
  Scenario: Scenario 3
    Given I am on wayfair.com
    And I hover over furniture
    When I click on sectionals
    Then I should see sectional sofas and couches




