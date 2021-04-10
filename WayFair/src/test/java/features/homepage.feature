Feature: WayFair homepage test

  @null
  Scenario :Verify that partner company's take you to their respective websites
    Given I am on Wayfair homepage
    And I click on "Joss and Main" JM
    Then I verify "Joss and Main" JM

