Feature:Presbyterian homepage

  Background:I am on the Presbyterian homepage

  @null
  Scenario: verify the homepage title
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title


  @null
#    need help identifying texts
  Scenario: verify that the text "About NYP" is on the footnotes
    Given I am on the Presbyterian homepage
    And verify the text "About NYP" appears in the footnotes

  @null
  Scenario: verify about us page
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    When I click on "about us"
    Then I verify that it is indeed the "about us" page

  @null
  Scenario: verify clicking the back button takes you back to the homepage
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    When I click on "about us"
    Then clicking the back button should take me back to the homepage


  @null
  Scenario: verify "Governance & Leadership"
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on "Governance & Leadership" tab
    And I verify that the page title "Governance & Leadership" is correct

  @null
  Scenario: verify that clicking the back button from "Governance and Leadership" page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on "Governance & Leadership" tab
    Then clicking the back button should take me back to the homepage

  @null
  Scenario:Verify the "contact us" tab
    Given I am on the Presbyterian homepage
    And I click on the contact us tab
    Then I verify that I am on the contact us tab


  @null
  Scenario:Verify the "Health Matters" page
    Given I am on the Presbyterian homepage
    And I click on the "Health Matters" tab
    Then I verify that I am on the "Health Matters" tab

  @null
  Scenario: verify that clicking the back button from "Health and Matters" page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on the "Health Matters" tab
    Then clicking the back button should take me back to the homepage


  @null
  Scenario:Verify the "News Room" page
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on the "News Room" tab1
    And I verify that I am on the "News Room" tab1


    @null
    Scenario: verify that clicking the back button from "News Room" page takes you to homepage
      Given I am on the Presbyterian homepage
      And That I am on the homepage by verifying page title
      Then I click on the "News Room" tab1
      And clicking the back button should take me back to the homepage


  @null
  Scenario:Verify the "Events & Classes" page
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on the the tab "Events & Classes"
    And  I verify that I am on the page "Events & Classes" tab

  @null
  Scenario: verify that clicking the back button from "Events & Classes" page takes you to homepage
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on the the tab "Events & Classes"
    And  I verify that I am on the page "Events & Classes" tab
    And clicking the back button should take me back to the homepage

  @null
  Scenario:Verify the "Give to NYP" page
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on the the tab named "Give to NYP"
    And  I verify that I am on the page "Give to NYP"

  @null
  Scenario: verify that clicking the back button from "Give to NYP" page takes you to homepage
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on the the tab named "Give to NYP"
    And  I verify that I am on the page "Give to NYP"
    And clicking the back button should take me back to the homepage

  @null
  Scenario:Verify the "Volunteer" page
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on the another tab named "Volunteer"
    And  I verify that I am on the "Volunteer" page1

  @null
  Scenario: verify that clicking the back button from "Give to NYP" page takes you to homepage
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on the another tab named "Volunteer"
    And  I verify that I am on the "Volunteer" page1
    And clicking the back button should take me back to the homepage

  @null
  Scenario: verify "For Professionals" page
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on "For Professionals" fp tab
    And  I verify that I am on the "For Professionals"

  @null
  Scenario: verify that clicking the back button from "Give to NYP" page takes you to homepage
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on "For Professionals" fp tab
    And  I verify that I am on the "For Professionals"
    And clicking the back button should take me back to the homepage

  @null
  Scenario: verify "Graduate Medical Education" page
    Given I am on the Presbyterian homepage
    And That I am on the homepage by verifying page title
    Then I click on "Graduate Medical Education" GME tab
    And  I verify that I am on the "Graduate Medical Education" GME tab

  @null
  Scenario: verify that clicking the back button from "Graduate Medical Education" page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on "Graduate Medical Education" GME tab
    And clicking the back button should take me back to the homepage

  @null
  Scenario: verify "Publications" page
    Given I am on the Presbyterian homepage
    And I click on "Publications" P tab
    And  I verify that I am on the "Publications" p

  @null
  Scenario: verify that clicking the back button from "Publications" page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on "Publications" P tab
    And clicking the back button should take me back to the homepage

  @null
  Scenario: verify "Careers" page
    Given I am on the Presbyterian homepage
    And I click on "Careers" C tab
    And  I verify that I am on the "Careers" C

  @null
  Scenario: verify that clicking the back button from "Publications" page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on "Careers" C tab
    And  I verify that I am on the "Careers" C
    And clicking the back button should take me back to the homepage

  @null
  Scenario: verify "Nursing Jobs" page
    Given I am on the Presbyterian homepage
    And I click on "Nursing Jobs" NJ tab
    And  I verify that I am on the "Nursing Jobs" NJ

  @null
  Scenario: verify that clicking the back button from "Nursing Jobs" page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on "Nursing Jobs" NJ tab
    And clicking the back button should take me back to the homepage

  @null
  Scenario: verify "Disclaimer" page
    Given I am on the Presbyterian homepage
    And I click on "Disclaimer" D tab
    And  I verify that I am on the "Disclaimer" D

  @null
  Scenario: verify that clicking the back button from  "Disclaimer"  page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on "Disclaimer" D tab
    And  I verify that I am on the "Disclaimer" D
    And clicking the back button should take me back to the homepage


  @aaka
  Scenario: verify "Privacy Notice" page
    Given I am on the Presbyterian homepage
    And I click on "Privacy Notice" PN tab
    And  I verify that I am on the "Privacy Notice" PN

  @aaka
  Scenario: verify that clicking the back button from "Privacy Notice" page takes you to homepage
    Given I am on the Presbyterian homepage
    And I click on "Privacy Notice" PN tab
    And  I verify that I am on the "Privacy Notice" PN
    And clicking the back button should take me back to the homepage



























































