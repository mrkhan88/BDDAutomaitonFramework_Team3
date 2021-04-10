Feature: WayFair homepage test

  @null
  Scenario:searchbox (positive test)
    Given  I am on Wayfair homepage
    And I click on the searchbox
    And I type in a valid product "rugs"
    Then I verify that the product matches

  @null
  Scenario:searchbox (negative)
    Given I am on Wayfair homepage
    And I click on the searchbox
    And I type in a invalid product "xyz"
    Then I verify that there are no products shown


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

  @null
  Scenario: verify clicking the back button takes you back to the homepage
    Given I am on Wayfair homepage
    And I click on "All Modern" AM
    Then clicking the back button should take me back to the homepage


  @null
  Scenario:Verify that partner company's take you to their respective websites
    Given I am on Wayfair homepage
    And I click on "Birch Lane" BL
    Then I verify "Birch Lane"  BL

  @null
  Scenario: verify clicking the back button takes you back to the homepage
    Given I am on Wayfair homepage
    And I click on "Birch Lane" BL
    Then clicking the back button should take me back to the homepage



