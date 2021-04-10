Feature: Autozone searchBox test

  Background:
    Given I am at Autozone homepage

  @null
  Scenario: Search with valid product name
    Given I am at Autozone homepage
    And I type valid product name in SearchBox
    When I press Enter button on keyboard
    Then I am navigated to Search result page

  @null
  Scenario: Search with Invalid product name
    Given I am at Autozone homepage
    And I type valid product name in SearchBox
    When I press Enter button on keyboard
    Then I am navigated to Search result page

  @null
  Scenario: Search With valid product name 1
#        Given I am at Autozone homepage
    And I type "alternator" in SearchBox
    When I press Enter button on keyboard
    Then I verify that "alternator" is displayed

  @null
  Scenario: Search With valid product name 2
      #        Given I am at Autozone homepage
    And I type "spark plug" in SearchBox another way
    When I press Enter button on keyboard
    Then I verify that "spark plug" is displayed (using get text method)
    And I verify that page title is matched


  @null
  Scenario: Search with invalid product name
           #        Given I am at Autozone homepage
  And I type "cheese" in SearchBox
    When I press Enter button on keyboard
    Then I verify that "cheese" should not be displayed as it is not a valid product


    @null
    Scenario: Verify that the shopping cart takes you to the correct page
      # Given I am at Autozone homepage
  And I click on the shopping cart button
      And I verify that I am on the shopping cart page.
      But i should not be on the Homepage


  @null
  Scenario: Verify that the clicking the back button after shopping cart takes you back to the homepage
      # Given I am at Autozone homepage
    And I click on the shopping cart button
    And I verify that I am on the shopping cart page.
    But i should not be on the Homepage
    Then I click on the back button
    And I should be on the Autozone Homepage



  @aaka
  Scenario: Verify that clicking the logo after shopping cart takes you back to the homepage
      # Given I am at Autozone homepage
    And I click on the shopping cart button
    And I verify that I am on the shopping cart page.
    But i should not be on the Homepage
    Then I click on the Autozone logo
    And I should be on the Autozone Homepage











    




