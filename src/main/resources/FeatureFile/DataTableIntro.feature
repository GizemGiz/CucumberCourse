Feature: Login example scenario with Data Table

  #Data Tables :
  # We use Data Tables to run a single step in a scenario multiple times with different data
  # we use scenario Outline to run whole scenario multiple times with different data
@Smoke
  Scenario: Email input Test
    Given Navigate to website
    When User enter email address
     | sagahg |
     | 1234567|
     | grt45  |
    Then Close App
