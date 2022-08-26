Feature: Search Function

  Scenario: User search for Sony
    Given User navigate to website
    And User go to search page
    #When User search for "" ---> this is our step and we can pass any data between quotes
    When User search for "Sony"
    Then All the result should be displayed for "Sony"

  Scenario: User search for Samsung
    Given User navigate to website
    And User go to search page
    When User search for "Samsung"
    Then All the result should be displayed for "Samsung"

  Scenario: Use search for HP
    Given User go to search page
    When User search for "HP"
    Then All the result should be displayed for "HP"

  Scenario: Use search for Apple
    Given User go to search page
    When User search for "Apple"
    Then All the result should be displayed for "Apple"


