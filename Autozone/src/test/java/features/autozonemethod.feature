Feature: Vehicle Make test

  @Test1
  Scenario: Click with valid credentials
    Given Im at AutoZone homepage
    When I click on vehicle make
    Then Shop by make is displayed