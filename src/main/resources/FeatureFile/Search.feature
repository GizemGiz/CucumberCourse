Feature: Search functionality

  #All the steps in Background will get executed before each scenario
  #Background keyword works like @BeforeMethod annotation in TestNG

  Background:
    Given User navigate to website
    And User go to search page

  Scenario: Search for cucumber
    When User search for Cucumber
    Then All the result should be displayed for Cucumber

  Scenario: Search for SDET
    When User search for SDET
    Then All the result should be displayed for SDET