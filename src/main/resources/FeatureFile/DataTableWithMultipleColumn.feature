Feature: Login Function

  Scenario: Email and Password Input Test
    Given User navigate to login page
    When User enter valid email address and password
    | test@tech.com  | 12345678  |
    | admin@tech.com | asdfgh4t5 |
    | user@tech.com  | sddghhhgd |

    Then Error message should be displayed