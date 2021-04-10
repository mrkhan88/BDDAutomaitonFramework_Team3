Feature: WayFair homepage test

  @null
  Scenario:Verify that partner company's take you to their respective websites
    Given I am on Wayfair homepage
    And I click on "Joss and Main" JM
    Then I verify "Joss and Main" JM

    @null
    Scenario: verify clicking the back button takes you back to the homepage
      Given I am on Wayfair homepage
      When I click on "Joss and Main" JM
      Then clicking the back button should take me back to the homepage


  @null
  Scenario:Verify that partner company's take you to their respective websites
    Given I am on Wayfair homepage
    And I click on "All Modern" AM
    Then I verify "All Modern" AM

  @aaka
  Scenario: verify clicking the back button takes you back to the homepage
    Given I am on Wayfair homepage
    And I click on "All Modern" AM
    Then clicking the back button should take me back to the homepage


  @aaka
  Scenario:Verify that partner company's take you to their respective websites
    Given I am on Wayfair homepage
    And I click on "Birch Lane" BL
    Then I verify "Birch Lane"  BL

  @aaka
  Scenario: verify clicking the back button takes you back to the homepage
    Given I am on Wayfair homepage
    And I click on "Birch Lane" BL
    Then clicking the back button should take me back to the homepage