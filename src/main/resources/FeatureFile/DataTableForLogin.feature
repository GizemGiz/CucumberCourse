Feature: Login Function Email Input Test

  Scenario: Test Email Input
    Given Navigate to demoWebShop
    When User enter invalid email address
    | 12345    |
    | djgffdg  |
    | #%^%     |
    | sf6$%%^7 |
    Then User should see a warning