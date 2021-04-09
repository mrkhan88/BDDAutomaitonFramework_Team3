Feature: Amazon searchBox test
  @smoketest
  Scenario: Search with valid product name
    Given I am at Boostmobile homepage
    And I click on Search
    And I type valid product name in SearchBox
    When I click on SearchBox button
    Then I am navigated to Search result page

