Feature: Amazon searchBox test

  @null
  Scenario: Search with valid product name
    Given I am at Boostmobile homepage
    And I click on Search
    And I type valid product name in SearchBox
    When I click on SearchBox button
    Then I am navigated to Search result page

  @null
  Scenario: Verify that the BoostMobile logo takes you to the homepage
    Given I am at Boostmobile homepage
    And I click the Boost Mobile logo
    Then I verify that it takes me to the Boost Mobile homepage


  @null
  Scenario: Verify foot note links
    Given I am at Boostmobile homepage
    And I click on "All phones" AP
    Then I verify that I am on the "All phones" AP page

  @null
  Scenario: verify clicking the back button takes you back to the homepage
    Given I am at Boostmobile homepage
    And I click on "All phones" AP
    Then I verify that I am on the "All phones" AP page
    Then clicking the back button should take me back to the homepage

  @null
  Scenario: Verify foot note links
    Given I am at Boostmobile homepage
    And I click on "iphone" i
    Then I verify that I am on the "iphone" i page

  @null
  Scenario: verify clicking the back button takes you back to the homepage
    Given I am at Boostmobile homepage
    And I click on "iphone" i
    Then I verify that I am on the "iphone" i page
    Then clicking the back button should take me back to the homepage

  @aaka
  Scenario: Verify foot note links
    Given I am at Boostmobile homepage
    And I click on "Phone Plans" pp
    Then I verify that I am on the "Phone Plans" pp page

  @aaka
  Scenario: verify clicking the back button takes you back to the homepage
    And I click on "Phone Plans" pp
    Then I verify that I am on the "Phone Plans" pp page
    Then clicking the back button should take me back to the homepage