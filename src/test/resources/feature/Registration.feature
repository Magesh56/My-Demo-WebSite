Feature: User Registration

  Scenario: Successful registration with valid details
    Given User is on the registration page
    When User enters valid personal details
    And submits the registration form
    Then User should be registered successfully
    And redirected to the homepage

  Scenario: Registration with existing email
    Given User is on the registration page
    When User enters an already registered email
    And submits the registration form
    Then An error message should be displayed