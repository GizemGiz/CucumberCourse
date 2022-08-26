

Feature: Google Search

  Scenario: Google search for cucumber
    Given User navigate to Google website
    When user search for "Cucumber" in Google
    Then User should see results "Cucumber" related in Google



  Scenario: Google search for Apple
    Given User navigate to Google website
    When user search for "Apple" in Google
    Then User should see results "Apple" related in Google



  Scenario: Google search for Java
    Given User navigate to Google website
    When user search for "Java" in Google
    Then User should see results "Java" related in Google