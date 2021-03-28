Feature: Autozone searchBox test
  @smoketest
  Scenario: Search with valid product name
    Given I am at Autozone homepage
    And I type valid product name in SearchBox
    When I press Enter button on keyboard
    Then I am navigated to Search result page

    @mamun
  Scenario: Search with Invalid product name
      Given I am at Autozone homepage
      And I type valid product name in SearchBox
      When I press Enter button on keyboard
      Then I am navigated to Search result page